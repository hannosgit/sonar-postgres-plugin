// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface GroupingSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.GroupingSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.GroupingSetKind kind = 1 [json_name = "kind"];</code>
   * @return The enum numeric value on the wire for kind.
   */
  int getKindValue();
  /**
   * <code>.pg_query.GroupingSetKind kind = 1 [json_name = "kind"];</code>
   * @return The kind.
   */
  com.premiumminds.sonar.plpgsql.protobuf.GroupingSetKind getKind();

  /**
   * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getContentList();
  /**
   * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getContent(int index);
  /**
   * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
   */
  int getContentCount();
  /**
   * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getContentOrBuilderList();
  /**
   * <code>repeated .pg_query.Node content = 2 [json_name = "content"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getContentOrBuilder(
      int index);

  /**
   * <code>int32 location = 3 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}
