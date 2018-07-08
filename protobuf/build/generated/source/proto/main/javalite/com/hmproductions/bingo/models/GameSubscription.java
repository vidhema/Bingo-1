// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: models/GameSubscription.proto

package com.hmproductions.bingo.models;

/**
 * Protobuf type {@code com.hmproductions.bingo.models.GameSubscription}
 */
public  final class GameSubscription extends
    com.google.protobuf.GeneratedMessageLite<
        GameSubscription, GameSubscription.Builder> implements
    // @@protoc_insertion_point(message_implements:com.hmproductions.bingo.models.GameSubscription)
    GameSubscriptionOrBuilder {
  private GameSubscription() {
  }
  public static final int ROOM_ID_FIELD_NUMBER = 1;
  private int roomId_;
  /**
   * <code>optional uint32 room_id = 1;</code>
   */
  public int getRoomId() {
    return roomId_;
  }
  /**
   * <code>optional uint32 room_id = 1;</code>
   */
  private void setRoomId(int value) {
    
    roomId_ = value;
  }
  /**
   * <code>optional uint32 room_id = 1;</code>
   */
  private void clearRoomId() {
    
    roomId_ = 0;
  }

  public static final int PLAYER_ID_FIELD_NUMBER = 2;
  private int playerId_;
  /**
   * <code>optional uint32 player_id = 2;</code>
   */
  public int getPlayerId() {
    return playerId_;
  }
  /**
   * <code>optional uint32 player_id = 2;</code>
   */
  private void setPlayerId(int value) {
    
    playerId_ = value;
  }
  /**
   * <code>optional uint32 player_id = 2;</code>
   */
  private void clearPlayerId() {
    
    playerId_ = 0;
  }

  public static final int CELL_CLICKED_FIELD_NUMBER = 3;
  private int cellClicked_;
  /**
   * <code>optional uint32 cell_clicked = 3;</code>
   */
  public int getCellClicked() {
    return cellClicked_;
  }
  /**
   * <code>optional uint32 cell_clicked = 3;</code>
   */
  private void setCellClicked(int value) {
    
    cellClicked_ = value;
  }
  /**
   * <code>optional uint32 cell_clicked = 3;</code>
   */
  private void clearCellClicked() {
    
    cellClicked_ = 0;
  }

  public static final int WINNER_ID_FIELD_NUMBER = 4;
  private int winnerId_;
  /**
   * <code>optional uint32 winner_id = 4;</code>
   */
  public int getWinnerId() {
    return winnerId_;
  }
  /**
   * <code>optional uint32 winner_id = 4;</code>
   */
  private void setWinnerId(int value) {
    
    winnerId_ = value;
  }
  /**
   * <code>optional uint32 winner_id = 4;</code>
   */
  private void clearWinnerId() {
    
    winnerId_ = 0;
  }

  public static final int FIRST_SUBSCRIPTION_FIELD_NUMBER = 5;
  private boolean firstSubscription_;
  /**
   * <code>optional bool first_subscription = 5;</code>
   */
  public boolean getFirstSubscription() {
    return firstSubscription_;
  }
  /**
   * <code>optional bool first_subscription = 5;</code>
   */
  private void setFirstSubscription(boolean value) {
    
    firstSubscription_ = value;
  }
  /**
   * <code>optional bool first_subscription = 5;</code>
   */
  private void clearFirstSubscription() {
    
    firstSubscription_ = false;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (roomId_ != 0) {
      output.writeUInt32(1, roomId_);
    }
    if (playerId_ != 0) {
      output.writeUInt32(2, playerId_);
    }
    if (cellClicked_ != 0) {
      output.writeUInt32(3, cellClicked_);
    }
    if (winnerId_ != 0) {
      output.writeUInt32(4, winnerId_);
    }
    if (firstSubscription_ != false) {
      output.writeBool(5, firstSubscription_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (roomId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, roomId_);
    }
    if (playerId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, playerId_);
    }
    if (cellClicked_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, cellClicked_);
    }
    if (winnerId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, winnerId_);
    }
    if (firstSubscription_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, firstSubscription_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.hmproductions.bingo.models.GameSubscription parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.hmproductions.bingo.models.GameSubscription parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.hmproductions.bingo.models.GameSubscription parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.hmproductions.bingo.models.GameSubscription parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.hmproductions.bingo.models.GameSubscription parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.hmproductions.bingo.models.GameSubscription parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.hmproductions.bingo.models.GameSubscription parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.hmproductions.bingo.models.GameSubscription parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.hmproductions.bingo.models.GameSubscription parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.hmproductions.bingo.models.GameSubscription parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.hmproductions.bingo.models.GameSubscription prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code com.hmproductions.bingo.models.GameSubscription}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.hmproductions.bingo.models.GameSubscription, Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hmproductions.bingo.models.GameSubscription)
      com.hmproductions.bingo.models.GameSubscriptionOrBuilder {
    // Construct using com.hmproductions.bingo.models.GameSubscription.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional uint32 room_id = 1;</code>
     */
    public int getRoomId() {
      return instance.getRoomId();
    }
    /**
     * <code>optional uint32 room_id = 1;</code>
     */
    public Builder setRoomId(int value) {
      copyOnWrite();
      instance.setRoomId(value);
      return this;
    }
    /**
     * <code>optional uint32 room_id = 1;</code>
     */
    public Builder clearRoomId() {
      copyOnWrite();
      instance.clearRoomId();
      return this;
    }

    /**
     * <code>optional uint32 player_id = 2;</code>
     */
    public int getPlayerId() {
      return instance.getPlayerId();
    }
    /**
     * <code>optional uint32 player_id = 2;</code>
     */
    public Builder setPlayerId(int value) {
      copyOnWrite();
      instance.setPlayerId(value);
      return this;
    }
    /**
     * <code>optional uint32 player_id = 2;</code>
     */
    public Builder clearPlayerId() {
      copyOnWrite();
      instance.clearPlayerId();
      return this;
    }

    /**
     * <code>optional uint32 cell_clicked = 3;</code>
     */
    public int getCellClicked() {
      return instance.getCellClicked();
    }
    /**
     * <code>optional uint32 cell_clicked = 3;</code>
     */
    public Builder setCellClicked(int value) {
      copyOnWrite();
      instance.setCellClicked(value);
      return this;
    }
    /**
     * <code>optional uint32 cell_clicked = 3;</code>
     */
    public Builder clearCellClicked() {
      copyOnWrite();
      instance.clearCellClicked();
      return this;
    }

    /**
     * <code>optional uint32 winner_id = 4;</code>
     */
    public int getWinnerId() {
      return instance.getWinnerId();
    }
    /**
     * <code>optional uint32 winner_id = 4;</code>
     */
    public Builder setWinnerId(int value) {
      copyOnWrite();
      instance.setWinnerId(value);
      return this;
    }
    /**
     * <code>optional uint32 winner_id = 4;</code>
     */
    public Builder clearWinnerId() {
      copyOnWrite();
      instance.clearWinnerId();
      return this;
    }

    /**
     * <code>optional bool first_subscription = 5;</code>
     */
    public boolean getFirstSubscription() {
      return instance.getFirstSubscription();
    }
    /**
     * <code>optional bool first_subscription = 5;</code>
     */
    public Builder setFirstSubscription(boolean value) {
      copyOnWrite();
      instance.setFirstSubscription(value);
      return this;
    }
    /**
     * <code>optional bool first_subscription = 5;</code>
     */
    public Builder clearFirstSubscription() {
      copyOnWrite();
      instance.clearFirstSubscription();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:com.hmproductions.bingo.models.GameSubscription)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.hmproductions.bingo.models.GameSubscription();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.hmproductions.bingo.models.GameSubscription other = (com.hmproductions.bingo.models.GameSubscription) arg1;
        roomId_ = visitor.visitInt(roomId_ != 0, roomId_,
            other.roomId_ != 0, other.roomId_);
        playerId_ = visitor.visitInt(playerId_ != 0, playerId_,
            other.playerId_ != 0, other.playerId_);
        cellClicked_ = visitor.visitInt(cellClicked_ != 0, cellClicked_,
            other.cellClicked_ != 0, other.cellClicked_);
        winnerId_ = visitor.visitInt(winnerId_ != 0, winnerId_,
            other.winnerId_ != 0, other.winnerId_);
        firstSubscription_ = visitor.visitBoolean(firstSubscription_ != false, firstSubscription_,
            other.firstSubscription_ != false, other.firstSubscription_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 8: {

                roomId_ = input.readUInt32();
                break;
              }
              case 16: {

                playerId_ = input.readUInt32();
                break;
              }
              case 24: {

                cellClicked_ = input.readUInt32();
                break;
              }
              case 32: {

                winnerId_ = input.readUInt32();
                break;
              }
              case 40: {

                firstSubscription_ = input.readBool();
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.hmproductions.bingo.models.GameSubscription.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:com.hmproductions.bingo.models.GameSubscription)
  private static final com.hmproductions.bingo.models.GameSubscription DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GameSubscription();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.hmproductions.bingo.models.GameSubscription getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GameSubscription> PARSER;

  public static com.google.protobuf.Parser<GameSubscription> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
