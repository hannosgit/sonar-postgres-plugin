// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

/**
 * Protobuf enum {@code pg_query.A_Expr_Kind}
 */
public enum A_Expr_Kind
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>A_EXPR_KIND_UNDEFINED = 0;</code>
   */
  A_EXPR_KIND_UNDEFINED(0),
  /**
   * <code>AEXPR_OP = 1;</code>
   */
  AEXPR_OP(1),
  /**
   * <code>AEXPR_OP_ANY = 2;</code>
   */
  AEXPR_OP_ANY(2),
  /**
   * <code>AEXPR_OP_ALL = 3;</code>
   */
  AEXPR_OP_ALL(3),
  /**
   * <code>AEXPR_DISTINCT = 4;</code>
   */
  AEXPR_DISTINCT(4),
  /**
   * <code>AEXPR_NOT_DISTINCT = 5;</code>
   */
  AEXPR_NOT_DISTINCT(5),
  /**
   * <code>AEXPR_NULLIF = 6;</code>
   */
  AEXPR_NULLIF(6),
  /**
   * <code>AEXPR_OF = 7;</code>
   */
  AEXPR_OF(7),
  /**
   * <code>AEXPR_IN = 8;</code>
   */
  AEXPR_IN(8),
  /**
   * <code>AEXPR_LIKE = 9;</code>
   */
  AEXPR_LIKE(9),
  /**
   * <code>AEXPR_ILIKE = 10;</code>
   */
  AEXPR_ILIKE(10),
  /**
   * <code>AEXPR_SIMILAR = 11;</code>
   */
  AEXPR_SIMILAR(11),
  /**
   * <code>AEXPR_BETWEEN = 12;</code>
   */
  AEXPR_BETWEEN(12),
  /**
   * <code>AEXPR_NOT_BETWEEN = 13;</code>
   */
  AEXPR_NOT_BETWEEN(13),
  /**
   * <code>AEXPR_BETWEEN_SYM = 14;</code>
   */
  AEXPR_BETWEEN_SYM(14),
  /**
   * <code>AEXPR_NOT_BETWEEN_SYM = 15;</code>
   */
  AEXPR_NOT_BETWEEN_SYM(15),
  /**
   * <code>AEXPR_PAREN = 16;</code>
   */
  AEXPR_PAREN(16),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>A_EXPR_KIND_UNDEFINED = 0;</code>
   */
  public static final int A_EXPR_KIND_UNDEFINED_VALUE = 0;
  /**
   * <code>AEXPR_OP = 1;</code>
   */
  public static final int AEXPR_OP_VALUE = 1;
  /**
   * <code>AEXPR_OP_ANY = 2;</code>
   */
  public static final int AEXPR_OP_ANY_VALUE = 2;
  /**
   * <code>AEXPR_OP_ALL = 3;</code>
   */
  public static final int AEXPR_OP_ALL_VALUE = 3;
  /**
   * <code>AEXPR_DISTINCT = 4;</code>
   */
  public static final int AEXPR_DISTINCT_VALUE = 4;
  /**
   * <code>AEXPR_NOT_DISTINCT = 5;</code>
   */
  public static final int AEXPR_NOT_DISTINCT_VALUE = 5;
  /**
   * <code>AEXPR_NULLIF = 6;</code>
   */
  public static final int AEXPR_NULLIF_VALUE = 6;
  /**
   * <code>AEXPR_OF = 7;</code>
   */
  public static final int AEXPR_OF_VALUE = 7;
  /**
   * <code>AEXPR_IN = 8;</code>
   */
  public static final int AEXPR_IN_VALUE = 8;
  /**
   * <code>AEXPR_LIKE = 9;</code>
   */
  public static final int AEXPR_LIKE_VALUE = 9;
  /**
   * <code>AEXPR_ILIKE = 10;</code>
   */
  public static final int AEXPR_ILIKE_VALUE = 10;
  /**
   * <code>AEXPR_SIMILAR = 11;</code>
   */
  public static final int AEXPR_SIMILAR_VALUE = 11;
  /**
   * <code>AEXPR_BETWEEN = 12;</code>
   */
  public static final int AEXPR_BETWEEN_VALUE = 12;
  /**
   * <code>AEXPR_NOT_BETWEEN = 13;</code>
   */
  public static final int AEXPR_NOT_BETWEEN_VALUE = 13;
  /**
   * <code>AEXPR_BETWEEN_SYM = 14;</code>
   */
  public static final int AEXPR_BETWEEN_SYM_VALUE = 14;
  /**
   * <code>AEXPR_NOT_BETWEEN_SYM = 15;</code>
   */
  public static final int AEXPR_NOT_BETWEEN_SYM_VALUE = 15;
  /**
   * <code>AEXPR_PAREN = 16;</code>
   */
  public static final int AEXPR_PAREN_VALUE = 16;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static A_Expr_Kind valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static A_Expr_Kind forNumber(int value) {
    switch (value) {
      case 0: return A_EXPR_KIND_UNDEFINED;
      case 1: return AEXPR_OP;
      case 2: return AEXPR_OP_ANY;
      case 3: return AEXPR_OP_ALL;
      case 4: return AEXPR_DISTINCT;
      case 5: return AEXPR_NOT_DISTINCT;
      case 6: return AEXPR_NULLIF;
      case 7: return AEXPR_OF;
      case 8: return AEXPR_IN;
      case 9: return AEXPR_LIKE;
      case 10: return AEXPR_ILIKE;
      case 11: return AEXPR_SIMILAR;
      case 12: return AEXPR_BETWEEN;
      case 13: return AEXPR_NOT_BETWEEN;
      case 14: return AEXPR_BETWEEN_SYM;
      case 15: return AEXPR_NOT_BETWEEN_SYM;
      case 16: return AEXPR_PAREN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<A_Expr_Kind>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      A_Expr_Kind> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<A_Expr_Kind>() {
          public A_Expr_Kind findValueByNumber(int number) {
            return A_Expr_Kind.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.getDescriptor().getEnumTypes().get(4);
  }

  private static final A_Expr_Kind[] VALUES = values();

  public static A_Expr_Kind valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private A_Expr_Kind(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.A_Expr_Kind)
}

