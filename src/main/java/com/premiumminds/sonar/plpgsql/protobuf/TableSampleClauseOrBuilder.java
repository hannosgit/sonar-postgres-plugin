// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface TableSampleClauseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.TableSampleClause)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 tsmhandler = 1 [json_name = "tsmhandler"];</code>
   * @return The tsmhandler.
   */
  int getTsmhandler();

  /**
   * <code>repeated .pg_query.Node args = 2 [json_name = "args"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getArgsList();
  /**
   * <code>repeated .pg_query.Node args = 2 [json_name = "args"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getArgs(int index);
  /**
   * <code>repeated .pg_query.Node args = 2 [json_name = "args"];</code>
   */
  int getArgsCount();
  /**
   * <code>repeated .pg_query.Node args = 2 [json_name = "args"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getArgsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node args = 2 [json_name = "args"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getArgsOrBuilder(
      int index);

  /**
   * <code>.pg_query.Node repeatable = 3 [json_name = "repeatable"];</code>
   * @return Whether the repeatable field is set.
   */
  boolean hasRepeatable();
  /**
   * <code>.pg_query.Node repeatable = 3 [json_name = "repeatable"];</code>
   * @return The repeatable.
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getRepeatable();
  /**
   * <code>.pg_query.Node repeatable = 3 [json_name = "repeatable"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getRepeatableOrBuilder();
}
