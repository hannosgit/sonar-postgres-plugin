// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface LockingClauseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.LockingClause)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getLockedRelsList();
  /**
   * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getLockedRels(int index);
  /**
   * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
   */
  int getLockedRelsCount();
  /**
   * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getLockedRelsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node locked_rels = 1 [json_name = "lockedRels"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getLockedRelsOrBuilder(
      int index);

  /**
   * <code>.pg_query.LockClauseStrength strength = 2 [json_name = "strength"];</code>
   * @return The enum numeric value on the wire for strength.
   */
  int getStrengthValue();
  /**
   * <code>.pg_query.LockClauseStrength strength = 2 [json_name = "strength"];</code>
   * @return The strength.
   */
  com.premiumminds.sonar.plpgsql.protobuf.LockClauseStrength getStrength();

  /**
   * <code>.pg_query.LockWaitPolicy wait_policy = 3 [json_name = "waitPolicy"];</code>
   * @return The enum numeric value on the wire for waitPolicy.
   */
  int getWaitPolicyValue();
  /**
   * <code>.pg_query.LockWaitPolicy wait_policy = 3 [json_name = "waitPolicy"];</code>
   * @return The waitPolicy.
   */
  com.premiumminds.sonar.plpgsql.protobuf.LockWaitPolicy getWaitPolicy();
}
