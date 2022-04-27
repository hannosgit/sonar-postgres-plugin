// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

public interface TypeNameOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pg_query.TypeName)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .pg_query.Node names = 1 [json_name = "names"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getNamesList();
  /**
   * <code>repeated .pg_query.Node names = 1 [json_name = "names"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getNames(int index);
  /**
   * <code>repeated .pg_query.Node names = 1 [json_name = "names"];</code>
   */
  int getNamesCount();
  /**
   * <code>repeated .pg_query.Node names = 1 [json_name = "names"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getNamesOrBuilderList();
  /**
   * <code>repeated .pg_query.Node names = 1 [json_name = "names"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getNamesOrBuilder(
      int index);

  /**
   * <code>uint32 type_oid = 2 [json_name = "typeOid"];</code>
   * @return The typeOid.
   */
  int getTypeOid();

  /**
   * <code>bool setof = 3 [json_name = "setof"];</code>
   * @return The setof.
   */
  boolean getSetof();

  /**
   * <code>bool pct_type = 4 [json_name = "pct_type"];</code>
   * @return The pctType.
   */
  boolean getPctType();

  /**
   * <code>repeated .pg_query.Node typmods = 5 [json_name = "typmods"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getTypmodsList();
  /**
   * <code>repeated .pg_query.Node typmods = 5 [json_name = "typmods"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getTypmods(int index);
  /**
   * <code>repeated .pg_query.Node typmods = 5 [json_name = "typmods"];</code>
   */
  int getTypmodsCount();
  /**
   * <code>repeated .pg_query.Node typmods = 5 [json_name = "typmods"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getTypmodsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node typmods = 5 [json_name = "typmods"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getTypmodsOrBuilder(
      int index);

  /**
   * <code>int32 typemod = 6 [json_name = "typemod"];</code>
   * @return The typemod.
   */
  int getTypemod();

  /**
   * <code>repeated .pg_query.Node array_bounds = 7 [json_name = "arrayBounds"];</code>
   */
  java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> 
      getArrayBoundsList();
  /**
   * <code>repeated .pg_query.Node array_bounds = 7 [json_name = "arrayBounds"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.Node getArrayBounds(int index);
  /**
   * <code>repeated .pg_query.Node array_bounds = 7 [json_name = "arrayBounds"];</code>
   */
  int getArrayBoundsCount();
  /**
   * <code>repeated .pg_query.Node array_bounds = 7 [json_name = "arrayBounds"];</code>
   */
  java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getArrayBoundsOrBuilderList();
  /**
   * <code>repeated .pg_query.Node array_bounds = 7 [json_name = "arrayBounds"];</code>
   */
  com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getArrayBoundsOrBuilder(
      int index);

  /**
   * <code>int32 location = 8 [json_name = "location"];</code>
   * @return The location.
   */
  int getLocation();
}
