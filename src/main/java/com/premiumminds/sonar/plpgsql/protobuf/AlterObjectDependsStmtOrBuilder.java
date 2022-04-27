// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface AlterObjectDependsStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.AlterObjectDependsStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.ObjectType object_type = 1 [json_name = "objectType"];</code>
   * @return The enum numeric value on the wire for objectType.
   */
  int getObjectTypeValue();
  /**
   * <code>.pg_query.ObjectType object_type = 1 [json_name = "objectType"];</code>
   * @return The objectType.
   */
  com.premiumminds.sonar.plpgsql.protobuf.ObjectType getObjectType();

  /**
   * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
   * @return Whether the relation field is set.
   */
  boolean hasRelation();
  /**
   * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
   * @return The relation.
   */
  com.premiumminds.sonar.plpgsql.protobuf.RangeVar getRelation();
  /**
   * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.RangeVarOrBuilder getRelationOrBuilder();

  /**
   * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
   * @return Whether the object field is set.
   */
  boolean hasObject();
  /**
   * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
   * @return The object.
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getObject();
  /**
   * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getObjectOrBuilder();

  /**
   * <code>.pg_query.Node extname = 4 [json_name = "extname"];</code>
   * @return Whether the extname field is set.
   */
  boolean hasExtname();
  /**
   * <code>.pg_query.Node extname = 4 [json_name = "extname"];</code>
   * @return The extname.
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getExtname();
  /**
   * <code>.pg_query.Node extname = 4 [json_name = "extname"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getExtnameOrBuilder();

  /**
   * <code>bool remove = 5 [json_name = "remove"];</code>
   * @return The remove.
   */
  boolean getRemove();
}
