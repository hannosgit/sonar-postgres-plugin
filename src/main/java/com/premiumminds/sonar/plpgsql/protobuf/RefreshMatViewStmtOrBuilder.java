// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface RefreshMatViewStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.RefreshMatViewStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool concurrent = 1 [json_name = "concurrent"];</code>
   * @return The concurrent.
   */
  boolean getConcurrent();

  /**
   * <code>bool skip_data = 2 [json_name = "skipData"];</code>
   * @return The skipData.
   */
  boolean getSkipData();

  /**
   * <code>.pg_query.RangeVar relation = 3 [json_name = "relation"];</code>
   * @return Whether the relation field is set.
   */
  boolean hasRelation();
  /**
   * <code>.pg_query.RangeVar relation = 3 [json_name = "relation"];</code>
   * @return The relation.
   */
  com.premiumminds.sonar.plpgsql.protobuf.RangeVar getRelation();
  /**
   * <code>.pg_query.RangeVar relation = 3 [json_name = "relation"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.RangeVarOrBuilder getRelationOrBuilder();
}
