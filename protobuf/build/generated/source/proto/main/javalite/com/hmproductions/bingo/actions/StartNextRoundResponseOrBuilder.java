// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: actions/StartNextRound.proto

package com.hmproductions.bingo.actions;

public interface StartNextRoundResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hmproductions.bingo.actions.StartNextRoundResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional .com.hmproductions.bingo.actions.StartNextRoundResponse.StatusCode status_code = 1;</code>
   */
  int getStatusCodeValue();
  /**
   * <code>optional .com.hmproductions.bingo.actions.StartNextRoundResponse.StatusCode status_code = 1;</code>
   */
  com.hmproductions.bingo.actions.StartNextRoundResponse.StatusCode getStatusCode();

  /**
   * <code>optional string status_message = 2;</code>
   */
  java.lang.String getStatusMessage();
  /**
   * <code>optional string status_message = 2;</code>
   */
  com.google.protobuf.ByteString
      getStatusMessageBytes();
}
