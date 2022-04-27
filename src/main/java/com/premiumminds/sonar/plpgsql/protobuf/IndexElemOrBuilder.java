// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface IndexElemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.IndexElem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
   * @return Whether the expr field is set.
   */
  boolean hasExpr();
  /**
   * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
   * @return The expr.
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getExpr();
  /**
   * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getExprOrBuilder();

  /**
   * <code>string indexcolname = 3 [json_name = "indexcolname"];</code>
   * @return The indexcolname.
   */
  java.lang.String getIndexcolname();
  /**
   * <code>string indexcolname = 3 [json_name = "indexcolname"];</code>
   * @return The bytes for indexcolname.
   */
  com.google.protobuf.ByteString
      getIndexcolnameBytes();

  /**
   * <code>repeated .pg_query.Node collation = 4 [json_name = "collation"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getCollationList();
  /**
   * <code>repeated .pg_query.Node collation = 4 [json_name = "collation"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getCollation(int index);
  /**
   * <code>repeated .pg_query.Node collation = 4 [json_name = "collation"];</code>
   */
  int getCollationCount();
  /**
   * <code>repeated .pg_query.Node collation = 4 [json_name = "collation"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getCollationOrBuilderList();
  /**
   * <code>repeated .pg_query.Node collation = 4 [json_name = "collation"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getCollationOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node opclass = 5 [json_name = "opclass"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getOpclassList();
  /**
   * <code>repeated .pg_query.Node opclass = 5 [json_name = "opclass"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getOpclass(int index);
  /**
   * <code>repeated .pg_query.Node opclass = 5 [json_name = "opclass"];</code>
   */
  int getOpclassCount();
  /**
   * <code>repeated .pg_query.Node opclass = 5 [json_name = "opclass"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getOpclassOrBuilderList();
  /**
   * <code>repeated .pg_query.Node opclass = 5 [json_name = "opclass"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getOpclassOrBuilder(
      int index);

  /**
   * <code>repeated .pg_query.Node opclassopts = 6 [json_name = "opclassopts"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getOpclassoptsList();
  /**
   * <code>repeated .pg_query.Node opclassopts = 6 [json_name = "opclassopts"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getOpclassopts(int index);
  /**
   * <code>repeated .pg_query.Node opclassopts = 6 [json_name = "opclassopts"];</code>
   */
  int getOpclassoptsCount();
  /**
   * <code>repeated .pg_query.Node opclassopts = 6 [json_name = "opclassopts"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getOpclassoptsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node opclassopts = 6 [json_name = "opclassopts"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getOpclassoptsOrBuilder(
      int index);

  /**
   * <code>.pg_query.SortByDir ordering = 7 [json_name = "ordering"];</code>
   * @return The enum numeric value on the wire for ordering.
   */
  int getOrderingValue();
  /**
   * <code>.pg_query.SortByDir ordering = 7 [json_name = "ordering"];</code>
   * @return The ordering.
   */
  com.premiumminds.sonar.plpgsql.protobuf.SortByDir getOrdering();

  /**
   * <code>.pg_query.SortByNulls nulls_ordering = 8 [json_name = "nulls_ordering"];</code>
   * @return The enum numeric value on the wire for nullsOrdering.
   */
  int getNullsOrderingValue();
  /**
   * <code>.pg_query.SortByNulls nulls_ordering = 8 [json_name = "nulls_ordering"];</code>
   * @return The nullsOrdering.
   */
  com.premiumminds.sonar.plpgsql.protobuf.SortByNulls getNullsOrdering();
}
