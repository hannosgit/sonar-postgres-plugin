// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface ConstraintsSetStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.ConstraintsSetStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getConstraintsList();
  /**
   * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getConstraints(int index);
  /**
   * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
   */
  int getConstraintsCount();
  /**
   * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getConstraintsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node constraints = 1 [json_name = "constraints"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getConstraintsOrBuilder(
      int index);

  /**
   * <code>bool deferred = 2 [json_name = "deferred"];</code>
   * @return The deferred.
   */
  boolean getDeferred();
}
