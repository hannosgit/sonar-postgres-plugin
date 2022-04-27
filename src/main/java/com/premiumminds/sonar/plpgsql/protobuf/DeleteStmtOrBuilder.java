// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface DeleteStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.DeleteStmt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.RangeVar relation = 1 [json_name = "relation"];</code>
   * @return Whether the relation field is set.
   */
  boolean hasRelation();
  /**
   * <code>.pg_query.RangeVar relation = 1 [json_name = "relation"];</code>
   * @return The relation.
   */
  com.premiumminds.sonar.plpgsql.protobuf.RangeVar getRelation();
  /**
   * <code>.pg_query.RangeVar relation = 1 [json_name = "relation"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.RangeVarOrBuilder getRelationOrBuilder();

  /**
   * <code>repeated .pg_query.Node using_clause = 2 [json_name = "usingClause"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getUsingClauseList();
  /**
   * <code>repeated .pg_query.Node using_clause = 2 [json_name = "usingClause"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getUsingClause(int index);
  /**
   * <code>repeated .pg_query.Node using_clause = 2 [json_name = "usingClause"];</code>
   */
  int getUsingClauseCount();
  /**
   * <code>repeated .pg_query.Node using_clause = 2 [json_name = "usingClause"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getUsingClauseOrBuilderList();
  /**
   * <code>repeated .pg_query.Node using_clause = 2 [json_name = "usingClause"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getUsingClauseOrBuilder(
      int index);

  /**
   * <code>.pg_query.Node where_clause = 3 [json_name = "whereClause"];</code>
   * @return Whether the whereClause field is set.
   */
  boolean hasWhereClause();
  /**
   * <code>.pg_query.Node where_clause = 3 [json_name = "whereClause"];</code>
   * @return The whereClause.
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getWhereClause();
  /**
   * <code>.pg_query.Node where_clause = 3 [json_name = "whereClause"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getWhereClauseOrBuilder();

  /**
   * <code>repeated .pg_query.Node returning_list = 4 [json_name = "returningList"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getReturningListList();
  /**
   * <code>repeated .pg_query.Node returning_list = 4 [json_name = "returningList"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getReturningList(int index);
  /**
   * <code>repeated .pg_query.Node returning_list = 4 [json_name = "returningList"];</code>
   */
  int getReturningListCount();
  /**
   * <code>repeated .pg_query.Node returning_list = 4 [json_name = "returningList"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getReturningListOrBuilderList();
  /**
   * <code>repeated .pg_query.Node returning_list = 4 [json_name = "returningList"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getReturningListOrBuilder(
      int index);

  /**
   * <code>.pg_query.WithClause with_clause = 5 [json_name = "withClause"];</code>
   * @return Whether the withClause field is set.
   */
  boolean hasWithClause();
  /**
   * <code>.pg_query.WithClause with_clause = 5 [json_name = "withClause"];</code>
   * @return The withClause.
   */
  com.premiumminds.sonar.plpgsql.protobuf.WithClause getWithClause();
  /**
   * <code>.pg_query.WithClause with_clause = 5 [json_name = "withClause"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.WithClauseOrBuilder getWithClauseOrBuilder();
}
