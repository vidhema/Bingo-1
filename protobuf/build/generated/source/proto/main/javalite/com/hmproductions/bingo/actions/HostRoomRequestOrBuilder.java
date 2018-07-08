// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: actions/HostRoom.proto

package com.hmproductions.bingo.actions;

public interface HostRoomRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hmproductions.bingo.actions.HostRoomRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional string room_name = 1;</code>
   */
  java.lang.String getRoomName();
  /**
   * <code>optional string room_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getRoomNameBytes();

  /**
   * <code>optional uint32 max_size = 2;</code>
   */
  int getMaxSize();

  /**
   * <code>optional .com.hmproductions.bingo.actions.HostRoomRequest.TimeLimit time_limit = 3;</code>
   */
  int getTimeLimitValue();
  /**
   * <code>optional .com.hmproductions.bingo.actions.HostRoomRequest.TimeLimit time_limit = 3;</code>
   */
  com.hmproductions.bingo.actions.HostRoomRequest.TimeLimit getTimeLimit();

  /**
   * <code>optional uint32 player_id = 4;</code>
   */
  int getPlayerId();

  /**
   * <code>optional string player_name = 5;</code>
   */
  java.lang.String getPlayerName();
  /**
   * <code>optional string player_name = 5;</code>
   */
  com.google.protobuf.ByteString
      getPlayerNameBytes();

  /**
   * <code>optional string player_color = 6;</code>
   */
  java.lang.String getPlayerColor();
  /**
   * <code>optional string player_color = 6;</code>
   */
  com.google.protobuf.ByteString
      getPlayerColorBytes();
}
