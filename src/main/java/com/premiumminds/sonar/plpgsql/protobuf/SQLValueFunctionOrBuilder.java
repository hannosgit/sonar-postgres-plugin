// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface SQLValueFunctionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.SQLValueFunction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
   * @return Whether the xpr field is set.
   */
  boolean hasXpr();
  /**
   * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
   * @return The xpr.
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getXpr();
  /**
   * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getXprOrBuilder();

  /**
   * <code>.pg_query.SQLValueFunctionOp op = 2 [json_name = "op"];</code>
   * @return The enum numeric value on the wire for op.
   */
  int getOpValue();
  /**
   * <code>.pg_query.SQLValueFunctionOp op = 2 [json_name = "op"];</code>
   * @return The op.
   */
  com.premiumminds.sonar.plpgsql.protobuf.SQLValueFunctionOp getOp();

  /**
   * <code>uint32 type = 3 [json_name = "type"];</code>
   * @return The type.
   */
  int getType();

  /**
   * <code>int32 typmod = 4 [json_name = "typmod"];</code>
   * @return The typmod.
   */
  int getTypmod();

  /**
   * <code>int32 location = 5 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}
