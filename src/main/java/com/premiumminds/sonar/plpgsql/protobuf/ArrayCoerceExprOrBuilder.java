// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface ArrayCoerceExprOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.ArrayCoerceExpr)
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
   * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
   * @return Whether the arg field is set.
   */
  boolean hasArg();
  /**
   * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
   * @return The arg.
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getArg();
  /**
   * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getArgOrBuilder();

  /**
   * <code>.pg_query.Node elemexpr = 3 [json_name = "elemexpr"];</code>
   * @return Whether the elemexpr field is set.
   */
  boolean hasElemexpr();
  /**
   * <code>.pg_query.Node elemexpr = 3 [json_name = "elemexpr"];</code>
   * @return The elemexpr.
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getElemexpr();
  /**
   * <code>.pg_query.Node elemexpr = 3 [json_name = "elemexpr"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getElemexprOrBuilder();

  /**
   * <code>uint32 resulttype = 4 [json_name = "resulttype"];</code>
   * @return The resulttype.
   */
  int getResulttype();

  /**
   * <code>int32 resulttypmod = 5 [json_name = "resulttypmod"];</code>
   * @return The resulttypmod.
   */
  int getResulttypmod();

  /**
   * <code>uint32 resultcollid = 6 [json_name = "resultcollid"];</code>
   * @return The resultcollid.
   */
  int getResultcollid();

  /**
   * <code>.pg_query.CoercionForm coerceformat = 7 [json_name = "coerceformat"];</code>
   * @return The enum numeric value on the wire for coerceformat.
   */
  int getCoerceformatValue();
  /**
   * <code>.pg_query.CoercionForm coerceformat = 7 [json_name = "coerceformat"];</code>
   * @return The coerceformat.
   */
  com.premiumminds.sonar.plpgsql.protobuf.CoercionForm getCoerceformat();

  /**
   * <code>int32 location = 8 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}
