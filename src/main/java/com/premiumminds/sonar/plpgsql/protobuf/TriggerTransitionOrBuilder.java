// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface TriggerTransitionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.TriggerTransition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>bool is_new = 2 [json_name = "isNew"];</code>
   * @return The isNew.
   */
  boolean getIsNew();

  /**
   * <code>bool is_table = 3 [json_name = "isTable"];</code>
   * @return The isTable.
   */
  boolean getIsTable();
}
