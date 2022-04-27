// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface AlterTableCmdOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.AlterTableCmd)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pg_query.AlterTableType subtype = 1 [json_name = "subtype"];</code>
   * @return The enum numeric value on the wire for subtype.
   */
  int getSubtypeValue();
  /**
   * <code>.pg_query.AlterTableType subtype = 1 [json_name = "subtype"];</code>
   * @return The subtype.
   */
  com.premiumminds.sonar.plpgsql.protobuf.AlterTableType getSubtype();

  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 num = 3 [json_name = "num"];</code>
   * @return The num.
   */
  int getNum();

  /**
   * <code>.pg_query.RoleSpec newowner = 4 [json_name = "newowner"];</code>
   * @return Whether the newowner field is set.
   */
  boolean hasNewowner();
  /**
   * <code>.pg_query.RoleSpec newowner = 4 [json_name = "newowner"];</code>
   * @return The newowner.
   */
  com.premiumminds.sonar.plpgsql.protobuf.RoleSpec getNewowner();
  /**
   * <code>.pg_query.RoleSpec newowner = 4 [json_name = "newowner"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.RoleSpecOrBuilder getNewownerOrBuilder();

  /**
   * <code>.pg_query.Node def = 5 [json_name = "def"];</code>
   * @return Whether the def field is set.
   */
  boolean hasDef();
  /**
   * <code>.pg_query.Node def = 5 [json_name = "def"];</code>
   * @return The def.
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getDef();
  /**
   * <code>.pg_query.Node def = 5 [json_name = "def"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getDefOrBuilder();

  /**
   * <code>.pg_query.DropBehavior behavior = 6 [json_name = "behavior"];</code>
   * @return The enum numeric value on the wire for behavior.
   */
  int getBehaviorValue();
  /**
   * <code>.pg_query.DropBehavior behavior = 6 [json_name = "behavior"];</code>
   * @return The behavior.
   */
  com.premiumminds.sonar.plpgsql.protobuf.DropBehavior getBehavior();

  /**
   * <code>bool missing_ok = 7 [json_name = "missing_ok"];</code>
   * @return The missingOk.
   */
  boolean getMissingOk();
}
