// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface CommentStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.CommentStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.ObjectType objtype = 1 [json_name = "objtype"];</code>
   * @return The enum numeric value on the wire for objtype.
   */
  int getObjtypeValue();
  /**
   * <code>.pg_query.ObjectType objtype = 1 [json_name = "objtype"];</code>
   * @return The objtype.
   */
  com.premiumminds.sonar.plpgsql.protobuf.ObjectType getObjtype();

  /**
   * <code>.pg_query.Node object = 2 [json_name = "object"];</code>
   * @return Whether the object field is set.
   */
  boolean hasObject();
  /**
   * <code>.pg_query.Node object = 2 [json_name = "object"];</code>
   * @return The object.
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getObject();
  /**
   * <code>.pg_query.Node object = 2 [json_name = "object"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getObjectOrBuilder();

  /**
   * <code>string comment = 3 [json_name = "comment"];</code>
   * @return The comment.
   */
  java.lang.String getComment();
  /**
   * <code>string comment = 3 [json_name = "comment"];</code>
   * @return The bytes for comment.
   */
  com.google.protobuf.ByteString
      getCommentBytes();
}
