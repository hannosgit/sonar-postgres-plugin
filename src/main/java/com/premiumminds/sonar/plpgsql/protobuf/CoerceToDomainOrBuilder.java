// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface CoerceToDomainOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.CoerceToDomain)
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
   * <code>uint32 resulttype = 3 [json_name = "resulttype"];</code>
   * @return The resulttype.
   */
  int getResulttype();

  /**
   * <code>int32 resulttypmod = 4 [json_name = "resulttypmod"];</code>
   * @return The resulttypmod.
   */
  int getResulttypmod();

  /**
   * <code>uint32 resultcollid = 5 [json_name = "resultcollid"];</code>
   * @return The resultcollid.
   */
  int getResultcollid();

  /**
   * <code>.pg_query.CoercionForm coercionformat = 6 [json_name = "coercionformat"];</code>
   * @return The enum numeric value on the wire for coercionformat.
   */
  int getCoercionformatValue();
  /**
   * <code>.pg_query.CoercionForm coercionformat = 6 [json_name = "coercionformat"];</code>
   * @return The coercionformat.
   */
  com.premiumminds.sonar.plpgsql.protobuf.CoercionForm getCoercionformat();

  /**
   * <code>int32 location = 7 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}
