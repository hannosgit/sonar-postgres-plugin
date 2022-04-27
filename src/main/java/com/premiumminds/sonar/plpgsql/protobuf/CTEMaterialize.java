// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

/**
 * Protobuf enum {@code pg_query.CTEMaterialize}
 */
public enum CTEMaterialize
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CTEMATERIALIZE_UNDEFINED = 0;</code>
   */
  CTEMATERIALIZE_UNDEFINED(0),
  /**
   * <code>CTEMaterializeDefault = 1;</code>
   */
  CTEMaterializeDefault(1),
  /**
   * <code>CTEMaterializeAlways = 2;</code>
   */
  CTEMaterializeAlways(2),
  /**
   * <code>CTEMaterializeNever = 3;</code>
   */
  CTEMaterializeNever(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CTEMATERIALIZE_UNDEFINED = 0;</code>
   */
  public static final int CTEMATERIALIZE_UNDEFINED_VALUE = 0;
  /**
   * <code>CTEMaterializeDefault = 1;</code>
   */
  public static final int CTEMaterializeDefault_VALUE = 1;
  /**
   * <code>CTEMaterializeAlways = 2;</code>
   */
  public static final int CTEMaterializeAlways_VALUE = 2;
  /**
   * <code>CTEMaterializeNever = 3;</code>
   */
  public static final int CTEMaterializeNever_VALUE = 3;


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
  public static CTEMaterialize valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CTEMaterialize forNumber(int value) {
    switch (value) {
      case 0: return CTEMATERIALIZE_UNDEFINED;
      case 1: return CTEMaterializeDefault;
      case 2: return CTEMaterializeAlways;
      case 3: return CTEMaterializeNever;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CTEMaterialize>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CTEMaterialize> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CTEMaterialize>() {
          public CTEMaterialize findValueByNumber(int number) {
            return CTEMaterialize.forNumber(number);
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
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.getDescriptor().getEnumTypes().get(12);
  }

  private static final CTEMaterialize[] VALUES = values();

  public static CTEMaterialize valueOf(
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

  private CTEMaterialize(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.CTEMaterialize)
}

