package com.hmproductions.bingo.services;

import com.hmproductions.bingo.BingoStreamServiceGrpc;
import com.hmproductions.bingo.data.GameEventSubscription;
import com.hmproductions.bingo.data.Player;
import com.hmproductions.bingo.data.Room;
import com.hmproductions.bingo.data.RoomEventSubscription;
import com.hmproductions.bingo.datastreams.GameEventUpdate;
import com.hmproductions.bingo.datastreams.RoomEventUpdate;
import com.hmproductions.bingo.models.GameEvent;
import com.hmproductions.bingo.models.GameSubscription;
import com.hmproductions.bingo.models.RoomEvent;
import com.hmproductions.bingo.models.RoomSubscription;

import java.util.ArrayList;
import java.util.Random;

import io.grpc.stub.StreamObserver;

import static com.hmproductions.bingo.utils.Constants.CLEAR_GAME_SUBSCRIPTION;
import static com.hmproductions.bingo.utils.Constants.CLEAR_ROOM_SUBSCRIPTION;
import static com.hmproductions.bingo.utils.Constants.NEXT_ROUND_CODE;
import static com.hmproductions.bingo.utils.Constants.NO_WINNER_ID_CODE;
import static com.hmproductions.bingo.utils.Constants.PLAYER_QUIT_CODE;
import static com.hmproductions.bingo.utils.MiscellaneousUtils.allPlayersReady;
import static com.hmproductions.bingo.utils.MiscellaneousUtils.getArrayListFromPlayersList;
import static com.hmproductions.bingo.utils.RoomUtils.getRoomFromId;

public class BingoStreamServiceImpl extends BingoStreamServiceGrpc.BingoStreamServiceImplBase {

    @Override
    public void getRoomEventUpdates(RoomSubscription request, StreamObserver<RoomEventUpdate> responseObserver) {

        if (request.getRoomId() == CLEAR_ROOM_SUBSCRIPTION) {
            responseObserver.onCompleted();
            return;
        }

        Room currentRoom = getRoomFromId(request.getRoomId());

        if (currentRoom != null) {
            boolean found = false;

            for (RoomEventSubscription currentSubscription : currentRoom.getRoomEventSubscriptionArrayList()) {
                if (currentSubscription.getSubscription().getPlayerId() == request.getPlayerId()) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                currentRoom.getRoomEventSubscriptionArrayList().add(new RoomEventSubscription(responseObserver, request));
                System.out.println("Adding " + request.getPlayerId() + " to room " + request.getRoomId());
            }

            RoomEvent roomEvent;

            if (request.getDestroy()) {
                roomEvent = RoomEvent.newBuilder().setEventCode(RoomEvent.EventCode.ROOM_DESTROY)
                        .setMaxCount(currentRoom.getMaxSize()).build();
            } else {
                roomEvent = RoomEvent.newBuilder().addAllPlayers(getArrayListFromPlayersList(currentRoom.getPlayersList()))
                        .setEventCode(RoomEvent.EventCode.PLAYER_STATE_CHANGED).setMaxCount(currentRoom.getMaxSize()).build();
            }

            responseObserver.onNext(RoomEventUpdate.newBuilder().setRoomEvent(roomEvent).build());

            if (!request.getDestroy() && allPlayersReady(currentRoom.getPlayersList()) && currentRoom.getCount() == currentRoom.getMaxSize()) {

                setupCurrentPlayerAndStartGame(currentRoom);

                roomEvent = RoomEvent.newBuilder().setEventCode(RoomEvent.EventCode.GAME_START).setMaxCount(currentRoom.getMaxSize())
                        .addAllPlayers(getArrayListFromPlayersList(currentRoom.getPlayersList())).build();

                responseObserver.onNext(RoomEventUpdate.newBuilder().setRoomEvent(roomEvent).build());

                for (Player player : currentRoom.getPlayersList()) {
                    player.setWinCount(0);
                }

                currentRoom.getTimer().cancel();
            }
        }
    }

    @Override
    public void getGameEventUpdates(GameSubscription request, StreamObserver<GameEventUpdate> responseObserver) {

        if (request.getCellClicked() == CLEAR_GAME_SUBSCRIPTION) {
            responseObserver.onCompleted();
            return;
        }

        Room currentRoom = getRoomFromId(request.getRoomId());

        if (currentRoom != null) {
            if (!gameSubscriptionExists(currentRoom, request.getPlayerId())) {
                currentRoom.getGameEventSubscriptionArrayList().add(new GameEventSubscription(request.getPlayerId(), responseObserver, request));
            }

            GameEvent gameEvent;

            if (request.getFirstSubscription()) {

                gameEvent = GameEvent.newBuilder().setEventCode(GameEvent.EventCode.GAME_STARTED)
                        .setWinner(-1).setCellClicked(-1).setCurrentPlayerId(currentRoom.getCurrentPlayerId()).build();

            } else if (request.getCellClicked() == PLAYER_QUIT_CODE) {

                gameEvent = GameEvent.newBuilder().setCurrentPlayerId(currentRoom.getCurrentPlayerId())
                        .setEventCode(GameEvent.EventCode.PLAYER_QUIT)
                        .setCellClicked(request.getCellClicked()).setWinner(request.getWinnerId()).build();

            } else if (request.getCellClicked() == NEXT_ROUND_CODE) {

                gameEvent = GameEvent.newBuilder().setCurrentPlayerId(currentRoom.getCurrentPlayerId())
                        .setEventCode(GameEvent.EventCode.NEXT_ROUND)
                        .setCellClicked(request.getCellClicked()).setWinner(request.getWinnerId()).build();
            } else {

                if (request.getWinnerId() == NO_WINNER_ID_CODE) {

                    gameEvent = GameEvent.newBuilder().setCurrentPlayerId(currentRoom.getCurrentPlayerId())
                            .setEventCode(GameEvent.EventCode.CELL_CLICKED).setCellClicked(request.getCellClicked())
                            .setWinner(request.getWinnerId()).build();
                } else {

                    ArrayList<com.hmproductions.bingo.models.Player> modelsPlayerList = new ArrayList<>();

                    for (Player player : currentRoom.getPlayersList()) {
                        if (player.getId() == request.getWinnerId())
                            player.setWinCount(player.getWinCount());

                        modelsPlayerList.add(com.hmproductions.bingo.models.Player.newBuilder().setName(player.getName())
                                .setColor(player.getColor()).setId(player.getId()).setReady(player.isReady())
                                .setWinCount(player.getWinCount()).build());
                    }

                    gameEvent = GameEvent.newBuilder().setCurrentPlayerId(currentRoom.getCurrentPlayerId())
                            .setEventCode(GameEvent.EventCode.GAME_WON).setCellClicked(request.getCellClicked())
                            .addAllLeaderboard(modelsPlayerList).setWinner(request.getWinnerId()).build();
                }
            }
            responseObserver.onNext(GameEventUpdate.newBuilder().setGameEvent(gameEvent).build());

            if (request.getCellClicked() == PLAYER_QUIT_CODE) {
                responseObserver.onCompleted();
            }
        }
    }

    private void setupCurrentPlayerAndStartGame(Room room) {

        if (room.getStatus() == Room.Status.WAITING) {
            room.setCurrentPlayerPosition(new Random().nextInt(room.getCount()));
        }

        room.changeRoomStatus(Room.Status.INGAME);
    }

    private boolean gameSubscriptionExists(Room room, int playerId) {

        for (GameEventSubscription currentSubscription : room.getGameEventSubscriptionArrayList()) {
            if (currentSubscription.getGameSubscription().getPlayerId() == playerId)
                return true;
        }

        return false;
    }
}
