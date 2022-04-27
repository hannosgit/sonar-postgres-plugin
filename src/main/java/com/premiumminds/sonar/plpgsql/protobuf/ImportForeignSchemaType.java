// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

/**
 * Protobuf enum {@code pg_query.ImportForeignSchemaType}
 */
public enum ImportForeignSchemaType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>IMPORT_FOREIGN_SCHEMA_TYPE_UNDEFINED = 0;</code>
   */
  IMPORT_FOREIGN_SCHEMA_TYPE_UNDEFINED(0),
  /**
   * <code>FDW_IMPORT_SCHEMA_ALL = 1;</code>
   */
  FDW_IMPORT_SCHEMA_ALL(1),
  /**
   * <code>FDW_IMPORT_SCHEMA_LIMIT_TO = 2;</code>
   */
  FDW_IMPORT_SCHEMA_LIMIT_TO(2),
  /**
   * <code>FDW_IMPORT_SCHEMA_EXCEPT = 3;</code>
   */
  FDW_IMPORT_SCHEMA_EXCEPT(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>IMPORT_FOREIGN_SCHEMA_TYPE_UNDEFINED = 0;</code>
   */
  public static final int IMPORT_FOREIGN_SCHEMA_TYPE_UNDEFINED_VALUE = 0;
  /**
   * <code>FDW_IMPORT_SCHEMA_ALL = 1;</code>
   */
  public static final int FDW_IMPORT_SCHEMA_ALL_VALUE = 1;
  /**
   * <code>FDW_IMPORT_SCHEMA_LIMIT_TO = 2;</code>
   */
  public static final int FDW_IMPORT_SCHEMA_LIMIT_TO_VALUE = 2;
  /**
   * <code>FDW_IMPORT_SCHEMA_EXCEPT = 3;</code>
   */
  public static final int FDW_IMPORT_SCHEMA_EXCEPT_VALUE = 3;


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
  public static ImportForeignSchemaType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ImportForeignSchemaType forNumber(int value) {
    switch (value) {
      case 0: return IMPORT_FOREIGN_SCHEMA_TYPE_UNDEFINED;
      case 1: return FDW_IMPORT_SCHEMA_ALL;
      case 2: return FDW_IMPORT_SCHEMA_LIMIT_TO;
      case 3: return FDW_IMPORT_SCHEMA_EXCEPT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ImportForeignSchemaType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ImportForeignSchemaType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ImportForeignSchemaType>() {
          public ImportForeignSchemaType findValueByNumber(int number) {
            return ImportForeignSchemaType.forNumber(number);
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
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.getDescriptor().getEnumTypes().get(20);
  }

  private static final ImportForeignSchemaType[] VALUES = values();

  public static ImportForeignSchemaType valueOf(
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

  private ImportForeignSchemaType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pg_query.ImportForeignSchemaType)
}

