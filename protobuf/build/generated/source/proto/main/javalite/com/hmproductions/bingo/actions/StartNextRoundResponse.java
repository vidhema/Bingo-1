// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: actions/StartNextRound.proto

package com.hmproductions.bingo.actions;

/**
 * Protobuf type {@code com.hmproductions.bingo.actions.StartNextRoundResponse}
 */
public  final class StartNextRoundResponse extends
    com.google.protobuf.GeneratedMessageLite<
        StartNextRoundResponse, StartNextRoundResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:com.hmproductions.bingo.actions.StartNextRoundResponse)
    StartNextRoundResponseOrBuilder {
  private StartNextRoundResponse() {
    statusMessage_ = "";
  }
  /**
   * Protobuf enum {@code com.hmproductions.bingo.actions.StartNextRoundResponse.StatusCode}
   */
  public enum StatusCode
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>OK = 0;</code>
     */
    OK(0),
    /**
     * <code>ROOM_NOT_EXIST = 1;</code>
     */
    ROOM_NOT_EXIST(1),
    /**
     * <code>INTERNAL_SERVER_ERROR = 2;</code>
     */
    INTERNAL_SERVER_ERROR(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>OK = 0;</code>
     */
    public static final int OK_VALUE = 0;
    /**
     * <code>ROOM_NOT_EXIST = 1;</code>
     */
    public static final int ROOM_NOT_EXIST_VALUE = 1;
    /**
     * <code>INTERNAL_SERVER_ERROR = 2;</code>
     */
    public static final int INTERNAL_SERVER_ERROR_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static StatusCode valueOf(int value) {
      return forNumber(value);
    }

    public static StatusCode forNumber(int value) {
      switch (value) {
        case 0: return OK;
        case 1: return ROOM_NOT_EXIST;
        case 2: return INTERNAL_SERVER_ERROR;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<StatusCode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        StatusCode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<StatusCode>() {
            public StatusCode findValueByNumber(int number) {
              return StatusCode.forNumber(number);
            }
          };

    private final int value;

    private StatusCode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.hmproductions.bingo.actions.StartNextRoundResponse.StatusCode)
  }

  public static final int STATUS_CODE_FIELD_NUMBER = 1;
  private int statusCode_;
  /**
   * <code>optional .com.hmproductions.bingo.actions.StartNextRoundResponse.StatusCode status_code = 1;</code>
   */
  public int getStatusCodeValue() {
    return statusCode_;
  }
  /**
   * <code>optional .com.hmproductions.bingo.actions.StartNextRoundResponse.StatusCode status_code = 1;</code>
   */
  public com.hmproductions.bingo.actions.StartNextRoundResponse.StatusCode getStatusCode() {
    com.hmproductions.bingo.actions.StartNextRoundResponse.StatusCode result = com.hmproductions.bingo.actions.StartNextRoundResponse.StatusCode.forNumber(statusCode_);
    return result == null ? com.hmproductions.bingo.actions.StartNextRoundResponse.StatusCode.UNRECOGNIZED : result;
  }
  /**
   * <code>optional .com.hmproductions.bingo.actions.StartNextRoundResponse.StatusCode status_code = 1;</code>
   */
  private void setStatusCodeValue(int value) {
      statusCode_ = value;
  }
  /**
   * <code>optional .com.hmproductions.bingo.actions.StartNextRoundResponse.StatusCode status_code = 1;</code>
   */
  private void setStatusCode(com.hmproductions.bingo.actions.StartNextRoundResponse.StatusCode value) {
    if (value == null) {
      throw new NullPointerException();
    }
    
    statusCode_ = value.getNumber();
  }
  /**
   * <code>optional .com.hmproductions.bingo.actions.StartNextRoundResponse.StatusCode status_code = 1;</code>
   */
  private void clearStatusCode() {
    
    statusCode_ = 0;
  }

  public static final int STATUS_MESSAGE_FIELD_NUMBER = 2;
  private java.lang.String statusMessage_;
  /**
   * <code>optional string status_message = 2;</code>
   */
  public java.lang.String getStatusMessage() {
    return statusMessage_;
  }
  /**
   * <code>optional string status_message = 2;</code>
   */
  public com.google.protobuf.ByteString
      getStatusMessageBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(statusMessage_);
  }
  /**
   * <code>optional string status_message = 2;</code>
   */
  private void setStatusMessage(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    statusMessage_ = value;
  }
  /**
   * <code>optional string status_message = 2;</code>
   */
  private void clearStatusMessage() {
    
    statusMessage_ = getDefaultInstance().getStatusMessage();
  }
  /**
   * <code>optional string status_message = 2;</code>
   */
  private void setStatusMessageBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    statusMessage_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (statusCode_ != com.hmproductions.bingo.actions.StartNextRoundResponse.StatusCode.OK.getNumber()) {
      output.writeEnum(1, statusCode_);
    }
    if (!statusMessage_.isEmpty()) {
      output.writeString(2, getStatusMessage());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (statusCode_ != com.hmproductions.bingo.actions.StartNextRoundResponse.StatusCode.OK.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, statusCode_);
    }
    if (!statusMessage_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getStatusMessage());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.hmproductions.bingo.actions.StartNextRoundResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.hmproductions.bingo.actions.StartNextRoundResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.hmproductions.bingo.actions.StartNextRoundResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.hmproductions.bingo.actions.StartNextRoundResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.hmproductions.bingo.actions.StartNextRoundResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.hmproductions.bingo.actions.StartNextRoundResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.hmproductions.bingo.actions.StartNextRoundResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.hmproductions.bingo.actions.StartNextRoundResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.hmproductions.bingo.actions.StartNextRoundResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.hmproductions.bingo.actions.StartNextRoundResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.hmproductions.bingo.actions.StartNextRoundResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code com.hmproductions.bingo.actions.StartNextRoundResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.hmproductions.bingo.actions.StartNextRoundResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hmproductions.bingo.actions.StartNextRoundResponse)
      com.hmproductions.bingo.actions.StartNextRoundResponseOrBuilder {
    // Construct using com.hmproductions.bingo.actions.StartNextRoundResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional .com.hmproductions.bingo.actions.StartNextRoundResponse.StatusCode status_code = 1;</code>
     */
    public int getStatusCodeValue() {
      return instance.getStatusCodeValue();
    }
    /**
     * <code>optional .com.hmproductions.bingo.actions.StartNextRoundResponse.StatusCode status_code = 1;</code>
     */
    public Builder setStatusCodeValue(int value) {
      copyOnWrite();
      instance.setStatusCodeValue(value);
      return this;
    }
    /**
     * <code>optional .com.hmproductions.bingo.actions.StartNextRoundResponse.StatusCode status_code = 1;</code>
     */
    public com.hmproductions.bingo.actions.StartNextRoundResponse.StatusCode getStatusCode() {
      return instance.getStatusCode();
    }
    /**
     * <code>optional .com.hmproductions.bingo.actions.StartNextRoundResponse.StatusCode status_code = 1;</code>
     */
    public Builder setStatusCode(com.hmproductions.bingo.actions.StartNextRoundResponse.StatusCode value) {
      copyOnWrite();
      instance.setStatusCode(value);
      return this;
    }
    /**
     * <code>optional .com.hmproductions.bingo.actions.StartNextRoundResponse.StatusCode status_code = 1;</code>
     */
    public Builder clearStatusCode() {
      copyOnWrite();
      instance.clearStatusCode();
      return this;
    }

    /**
     * <code>optional string status_message = 2;</code>
     */
    public java.lang.String getStatusMessage() {
      return instance.getStatusMessage();
    }
    /**
     * <code>optional string status_message = 2;</code>
     */
    public com.google.protobuf.ByteString
        getStatusMessageBytes() {
      return instance.getStatusMessageBytes();
    }
    /**
     * <code>optional string status_message = 2;</code>
     */
    public Builder setStatusMessage(
        java.lang.String value) {
      copyOnWrite();
      instance.setStatusMessage(value);
      return this;
    }
    /**
     * <code>optional string status_message = 2;</code>
     */
    public Builder clearStatusMessage() {
      copyOnWrite();
      instance.clearStatusMessage();
      return this;
    }
    /**
     * <code>optional string status_message = 2;</code>
     */
    public Builder setStatusMessageBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setStatusMessageBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:com.hmproductions.bingo.actions.StartNextRoundResponse)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.hmproductions.bingo.actions.StartNextRoundResponse();
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
        com.hmproductions.bingo.actions.StartNextRoundResponse other = (com.hmproductions.bingo.actions.StartNextRoundResponse) arg1;
        statusCode_ = visitor.visitInt(statusCode_ != 0, statusCode_,    other.statusCode_ != 0, other.statusCode_);
        statusMessage_ = visitor.visitString(!statusMessage_.isEmpty(), statusMessage_,
            !other.statusMessage_.isEmpty(), other.statusMessage_);
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
                int rawValue = input.readEnum();

                statusCode_ = rawValue;
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();

                statusMessage_ = s;
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
        if (PARSER == null) {    synchronized (com.hmproductions.bingo.actions.StartNextRoundResponse.class) {
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


  // @@protoc_insertion_point(class_scope:com.hmproductions.bingo.actions.StartNextRoundResponse)
  private static final com.hmproductions.bingo.actions.StartNextRoundResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new StartNextRoundResponse();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.hmproductions.bingo.actions.StartNextRoundResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<StartNextRoundResponse> PARSER;

  public static com.google.protobuf.Parser<StartNextRoundResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

