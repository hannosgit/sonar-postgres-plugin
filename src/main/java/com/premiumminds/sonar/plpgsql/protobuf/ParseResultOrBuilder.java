// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface ParseResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.ParseResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 version = 1;</code>
   * @return The version.
   */
  int getVersion();

  /**
   * <code>repeated .pg_query.RawStmt stmts = 2;</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.RawStmt> 
      getStmtsList();
  /**
   * <code>repeated .pg_query.RawStmt stmts = 2;</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.RawStmt getStmts(int index);
  /**
   * <code>repeated .pg_query.RawStmt stmts = 2;</code>
   */
  int getStmtsCount();
  /**
   * <code>repeated .pg_query.RawStmt stmts = 2;</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.RawStmtOrBuilder> 
      getStmtsOrBuilderList();
  /**
   * <code>repeated .pg_query.RawStmt stmts = 2;</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.RawStmtOrBuilder getStmtsOrBuilder(
      int index);
}
