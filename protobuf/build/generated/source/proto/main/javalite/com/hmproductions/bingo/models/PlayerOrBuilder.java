// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: models/Player.proto

package com.hmproductions.bingo.models;

public interface PlayerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hmproductions.bingo.models.Player)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional uint32 id = 1;</code>
   */
  int getId();

  /**
   * <code>optional string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string color = 3;</code>
   */
  java.lang.String getColor();
  /**
   * <code>optional string color = 3;</code>
   */
  com.google.protobuf.ByteString
      getColorBytes();

  /**
   * <code>optional bool ready = 4;</code>
   */
  boolean getReady();

  /**
   * <code>optional uint32 win_count = 5;</code>
   */
  int getWinCount();
}