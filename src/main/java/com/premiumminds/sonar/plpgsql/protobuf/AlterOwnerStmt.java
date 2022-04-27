// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

/**
 * Protobuf type {@code pg_query.AlterOwnerStmt}
 */
public final class AlterOwnerStmt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.AlterOwnerStmt)
    AlterOwnerStmtOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlterOwnerStmt.newBuilder() to construct.
  private AlterOwnerStmt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlterOwnerStmt() {
    objectType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AlterOwnerStmt();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AlterOwnerStmt(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            objectType_ = rawValue;
            break;
          }
          case 18: {
            com.premiumminds.sonar.plpgsql.protobuf.RangeVar.Builder subBuilder = null;
            if (relation_ != null) {
              subBuilder = relation_.toBuilder();
            }
            relation_ = input.readMessage(com.premiumminds.sonar.plpgsql.protobuf.RangeVar.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(relation_);
              relation_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.premiumminds.sonar.plpgsql.protobuf.Node.Builder subBuilder = null;
            if (object_ != null) {
              subBuilder = object_.toBuilder();
            }
            object_ = input.readMessage(com.premiumminds.sonar.plpgsql.protobuf.Node.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(object_);
              object_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            com.premiumminds.sonar.plpgsql.protobuf.RoleSpec.Builder subBuilder = null;
            if (newowner_ != null) {
              subBuilder = newowner_.toBuilder();
            }
            newowner_ = input.readMessage(com.premiumminds.sonar.plpgsql.protobuf.RoleSpec.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(newowner_);
              newowner_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_AlterOwnerStmt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_AlterOwnerStmt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt.class, com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt.Builder.class);
  }

  public static final int OBJECT_TYPE_FIELD_NUMBER = 1;
  private int objectType_;
  /**
   * <code>.pg_query.ObjectType object_type = 1 [json_name = "objectType"];</code>
   * @return The enum numeric value on the wire for objectType.
   */
  @java.lang.Override public int getObjectTypeValue() {
    return objectType_;
  }
  /**
   * <code>.pg_query.ObjectType object_type = 1 [json_name = "objectType"];</code>
   * @return The objectType.
   */
  @java.lang.Override public com.premiumminds.sonar.plpgsql.protobuf.ObjectType getObjectType() {
    @SuppressWarnings("deprecation")
    com.premiumminds.sonar.plpgsql.protobuf.ObjectType result = com.premiumminds.sonar.plpgsql.protobuf.ObjectType.valueOf(objectType_);
    return result == null ? com.premiumminds.sonar.plpgsql.protobuf.ObjectType.UNRECOGNIZED : result;
  }

  public static final int RELATION_FIELD_NUMBER = 2;
  private com.premiumminds.sonar.plpgsql.protobuf.RangeVar relation_;
  /**
   * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
   * @return Whether the relation field is set.
   */
  @java.lang.Override
  public boolean hasRelation() {
    return relation_ != null;
  }
  /**
   * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
   * @return The relation.
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.RangeVar getRelation() {
    return relation_ == null ? com.premiumminds.sonar.plpgsql.protobuf.RangeVar.getDefaultInstance() : relation_;
  }
  /**
   * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.RangeVarOrBuilder getRelationOrBuilder() {
    return getRelation();
  }

  public static final int OBJECT_FIELD_NUMBER = 3;
  private com.premiumminds.sonar.plpgsql.protobuf.Node object_;
  /**
   * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
   * @return Whether the object field is set.
   */
  @java.lang.Override
  public boolean hasObject() {
    return object_ != null;
  }
  /**
   * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
   * @return The object.
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.Node getObject() {
    return object_ == null ? com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance() : object_;
  }
  /**
   * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getObjectOrBuilder() {
    return getObject();
  }

  public static final int NEWOWNER_FIELD_NUMBER = 4;
  private com.premiumminds.sonar.plpgsql.protobuf.RoleSpec newowner_;
  /**
   * <code>.pg_query.RoleSpec newowner = 4 [json_name = "newowner"];</code>
   * @return Whether the newowner field is set.
   */
  @java.lang.Override
  public boolean hasNewowner() {
    return newowner_ != null;
  }
  /**
   * <code>.pg_query.RoleSpec newowner = 4 [json_name = "newowner"];</code>
   * @return The newowner.
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.RoleSpec getNewowner() {
    return newowner_ == null ? com.premiumminds.sonar.plpgsql.protobuf.RoleSpec.getDefaultInstance() : newowner_;
  }
  /**
   * <code>.pg_query.RoleSpec newowner = 4 [json_name = "newowner"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.RoleSpecOrBuilder getNewownerOrBuilder() {
    return getNewowner();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (objectType_ != com.premiumminds.sonar.plpgsql.protobuf.ObjectType.OBJECT_TYPE_UNDEFINED.getNumber()) {
      output.writeEnum(1, objectType_);
    }
    if (relation_ != null) {
      output.writeMessage(2, getRelation());
    }
    if (object_ != null) {
      output.writeMessage(3, getObject());
    }
    if (newowner_ != null) {
      output.writeMessage(4, getNewowner());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (objectType_ != com.premiumminds.sonar.plpgsql.protobuf.ObjectType.OBJECT_TYPE_UNDEFINED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, objectType_);
    }
    if (relation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRelation());
    }
    if (object_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getObject());
    }
    if (newowner_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getNewowner());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt other = (com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt) obj;

    if (objectType_ != other.objectType_) return false;
    if (hasRelation() != other.hasRelation()) return false;
    if (hasRelation()) {
      if (!getRelation()
          .equals(other.getRelation())) return false;
    }
    if (hasObject() != other.hasObject()) return false;
    if (hasObject()) {
      if (!getObject()
          .equals(other.getObject())) return false;
    }
    if (hasNewowner() != other.hasNewowner()) return false;
    if (hasNewowner()) {
      if (!getNewowner()
          .equals(other.getNewowner())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + OBJECT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + objectType_;
    if (hasRelation()) {
      hash = (37 * hash) + RELATION_FIELD_NUMBER;
      hash = (53 * hash) + getRelation().hashCode();
    }
    if (hasObject()) {
      hash = (37 * hash) + OBJECT_FIELD_NUMBER;
      hash = (53 * hash) + getObject().hashCode();
    }
    if (hasNewowner()) {
      hash = (37 * hash) + NEWOWNER_FIELD_NUMBER;
      hash = (53 * hash) + getNewowner().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code pg_query.AlterOwnerStmt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.AlterOwnerStmt)
      com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmtOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_AlterOwnerStmt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_AlterOwnerStmt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt.class, com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt.Builder.class);
    }

    // Construct using com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      objectType_ = 0;

      if (relationBuilder_ == null) {
        relation_ = null;
      } else {
        relation_ = null;
        relationBuilder_ = null;
      }
      if (objectBuilder_ == null) {
        object_ = null;
      } else {
        object_ = null;
        objectBuilder_ = null;
      }
      if (newownerBuilder_ == null) {
        newowner_ = null;
      } else {
        newowner_ = null;
        newownerBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_AlterOwnerStmt_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt getDefaultInstanceForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt build() {
      com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt buildPartial() {
      com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt result = new com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt(this);
      result.objectType_ = objectType_;
      if (relationBuilder_ == null) {
        result.relation_ = relation_;
      } else {
        result.relation_ = relationBuilder_.build();
      }
      if (objectBuilder_ == null) {
        result.object_ = object_;
      } else {
        result.object_ = objectBuilder_.build();
      }
      if (newownerBuilder_ == null) {
        result.newowner_ = newowner_;
      } else {
        result.newowner_ = newownerBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt) {
        return mergeFrom((com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt other) {
      if (other == com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt.getDefaultInstance()) return this;
      if (other.objectType_ != 0) {
        setObjectTypeValue(other.getObjectTypeValue());
      }
      if (other.hasRelation()) {
        mergeRelation(other.getRelation());
      }
      if (other.hasObject()) {
        mergeObject(other.getObject());
      }
      if (other.hasNewowner()) {
        mergeNewowner(other.getNewowner());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int objectType_ = 0;
    /**
     * <code>.pg_query.ObjectType object_type = 1 [json_name = "objectType"];</code>
     * @return The enum numeric value on the wire for objectType.
     */
    @java.lang.Override public int getObjectTypeValue() {
      return objectType_;
    }
    /**
     * <code>.pg_query.ObjectType object_type = 1 [json_name = "objectType"];</code>
     * @param value The enum numeric value on the wire for objectType to set.
     * @return This builder for chaining.
     */
    public Builder setObjectTypeValue(int value) {
      
      objectType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.ObjectType object_type = 1 [json_name = "objectType"];</code>
     * @return The objectType.
     */
    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.ObjectType getObjectType() {
      @SuppressWarnings("deprecation")
      com.premiumminds.sonar.plpgsql.protobuf.ObjectType result = com.premiumminds.sonar.plpgsql.protobuf.ObjectType.valueOf(objectType_);
      return result == null ? com.premiumminds.sonar.plpgsql.protobuf.ObjectType.UNRECOGNIZED : result;
    }
    /**
     * <code>.pg_query.ObjectType object_type = 1 [json_name = "objectType"];</code>
     * @param value The objectType to set.
     * @return This builder for chaining.
     */
    public Builder setObjectType(com.premiumminds.sonar.plpgsql.protobuf.ObjectType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      objectType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.ObjectType object_type = 1 [json_name = "objectType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearObjectType() {
      
      objectType_ = 0;
      onChanged();
      return this;
    }

    private com.premiumminds.sonar.plpgsql.protobuf.RangeVar relation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.RangeVar, com.premiumminds.sonar.plpgsql.protobuf.RangeVar.Builder, com.premiumminds.sonar.plpgsql.protobuf.RangeVarOrBuilder> relationBuilder_;
    /**
     * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
     * @return Whether the relation field is set.
     */
    public boolean hasRelation() {
      return relationBuilder_ != null || relation_ != null;
    }
    /**
     * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
     * @return The relation.
     */
    public com.premiumminds.sonar.plpgsql.protobuf.RangeVar getRelation() {
      if (relationBuilder_ == null) {
        return relation_ == null ? com.premiumminds.sonar.plpgsql.protobuf.RangeVar.getDefaultInstance() : relation_;
      } else {
        return relationBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
     */
    public Builder setRelation(com.premiumminds.sonar.plpgsql.protobuf.RangeVar value) {
      if (relationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        relation_ = value;
        onChanged();
      } else {
        relationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
     */
    public Builder setRelation(
        com.premiumminds.sonar.plpgsql.protobuf.RangeVar.Builder builderForValue) {
      if (relationBuilder_ == null) {
        relation_ = builderForValue.build();
        onChanged();
      } else {
        relationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
     */
    public Builder mergeRelation(com.premiumminds.sonar.plpgsql.protobuf.RangeVar value) {
      if (relationBuilder_ == null) {
        if (relation_ != null) {
          relation_ =
            com.premiumminds.sonar.plpgsql.protobuf.RangeVar.newBuilder(relation_).mergeFrom(value).buildPartial();
        } else {
          relation_ = value;
        }
        onChanged();
      } else {
        relationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
     */
    public Builder clearRelation() {
      if (relationBuilder_ == null) {
        relation_ = null;
        onChanged();
      } else {
        relation_ = null;
        relationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.RangeVar.Builder getRelationBuilder() {
      
      onChanged();
      return getRelationFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.RangeVarOrBuilder getRelationOrBuilder() {
      if (relationBuilder_ != null) {
        return relationBuilder_.getMessageOrBuilder();
      } else {
        return relation_ == null ?
            com.premiumminds.sonar.plpgsql.protobuf.RangeVar.getDefaultInstance() : relation_;
      }
    }
    /**
     * <code>.pg_query.RangeVar relation = 2 [json_name = "relation"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.RangeVar, com.premiumminds.sonar.plpgsql.protobuf.RangeVar.Builder, com.premiumminds.sonar.plpgsql.protobuf.RangeVarOrBuilder> 
        getRelationFieldBuilder() {
      if (relationBuilder_ == null) {
        relationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.plpgsql.protobuf.RangeVar, com.premiumminds.sonar.plpgsql.protobuf.RangeVar.Builder, com.premiumminds.sonar.plpgsql.protobuf.RangeVarOrBuilder>(
                getRelation(),
                getParentForChildren(),
                isClean());
        relation_ = null;
      }
      return relationBuilder_;
    }

    private com.premiumminds.sonar.plpgsql.protobuf.Node object_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> objectBuilder_;
    /**
     * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
     * @return Whether the object field is set.
     */
    public boolean hasObject() {
      return objectBuilder_ != null || object_ != null;
    }
    /**
     * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
     * @return The object.
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node getObject() {
      if (objectBuilder_ == null) {
        return object_ == null ? com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance() : object_;
      } else {
        return objectBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
     */
    public Builder setObject(com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (objectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        object_ = value;
        onChanged();
      } else {
        objectBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
     */
    public Builder setObject(
        com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (objectBuilder_ == null) {
        object_ = builderForValue.build();
        onChanged();
      } else {
        objectBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
     */
    public Builder mergeObject(com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (objectBuilder_ == null) {
        if (object_ != null) {
          object_ =
            com.premiumminds.sonar.plpgsql.protobuf.Node.newBuilder(object_).mergeFrom(value).buildPartial();
        } else {
          object_ = value;
        }
        onChanged();
      } else {
        objectBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
     */
    public Builder clearObject() {
      if (objectBuilder_ == null) {
        object_ = null;
        onChanged();
      } else {
        object_ = null;
        objectBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder getObjectBuilder() {
      
      onChanged();
      return getObjectFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getObjectOrBuilder() {
      if (objectBuilder_ != null) {
        return objectBuilder_.getMessageOrBuilder();
      } else {
        return object_ == null ?
            com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance() : object_;
      }
    }
    /**
     * <code>.pg_query.Node object = 3 [json_name = "object"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
        getObjectFieldBuilder() {
      if (objectBuilder_ == null) {
        objectBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder>(
                getObject(),
                getParentForChildren(),
                isClean());
        object_ = null;
      }
      return objectBuilder_;
    }

    private com.premiumminds.sonar.plpgsql.protobuf.RoleSpec newowner_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.RoleSpec, com.premiumminds.sonar.plpgsql.protobuf.RoleSpec.Builder, com.premiumminds.sonar.plpgsql.protobuf.RoleSpecOrBuilder> newownerBuilder_;
    /**
     * <code>.pg_query.RoleSpec newowner = 4 [json_name = "newowner"];</code>
     * @return Whether the newowner field is set.
     */
    public boolean hasNewowner() {
      return newownerBuilder_ != null || newowner_ != null;
    }
    /**
     * <code>.pg_query.RoleSpec newowner = 4 [json_name = "newowner"];</code>
     * @return The newowner.
     */
    public com.premiumminds.sonar.plpgsql.protobuf.RoleSpec getNewowner() {
      if (newownerBuilder_ == null) {
        return newowner_ == null ? com.premiumminds.sonar.plpgsql.protobuf.RoleSpec.getDefaultInstance() : newowner_;
      } else {
        return newownerBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.RoleSpec newowner = 4 [json_name = "newowner"];</code>
     */
    public Builder setNewowner(com.premiumminds.sonar.plpgsql.protobuf.RoleSpec value) {
      if (newownerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        newowner_ = value;
        onChanged();
      } else {
        newownerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.RoleSpec newowner = 4 [json_name = "newowner"];</code>
     */
    public Builder setNewowner(
        com.premiumminds.sonar.plpgsql.protobuf.RoleSpec.Builder builderForValue) {
      if (newownerBuilder_ == null) {
        newowner_ = builderForValue.build();
        onChanged();
      } else {
        newownerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pg_query.RoleSpec newowner = 4 [json_name = "newowner"];</code>
     */
    public Builder mergeNewowner(com.premiumminds.sonar.plpgsql.protobuf.RoleSpec value) {
      if (newownerBuilder_ == null) {
        if (newowner_ != null) {
          newowner_ =
            com.premiumminds.sonar.plpgsql.protobuf.RoleSpec.newBuilder(newowner_).mergeFrom(value).buildPartial();
        } else {
          newowner_ = value;
        }
        onChanged();
      } else {
        newownerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.RoleSpec newowner = 4 [json_name = "newowner"];</code>
     */
    public Builder clearNewowner() {
      if (newownerBuilder_ == null) {
        newowner_ = null;
        onChanged();
      } else {
        newowner_ = null;
        newownerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pg_query.RoleSpec newowner = 4 [json_name = "newowner"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.RoleSpec.Builder getNewownerBuilder() {
      
      onChanged();
      return getNewownerFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.RoleSpec newowner = 4 [json_name = "newowner"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.RoleSpecOrBuilder getNewownerOrBuilder() {
      if (newownerBuilder_ != null) {
        return newownerBuilder_.getMessageOrBuilder();
      } else {
        return newowner_ == null ?
            com.premiumminds.sonar.plpgsql.protobuf.RoleSpec.getDefaultInstance() : newowner_;
      }
    }
    /**
     * <code>.pg_query.RoleSpec newowner = 4 [json_name = "newowner"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.RoleSpec, com.premiumminds.sonar.plpgsql.protobuf.RoleSpec.Builder, com.premiumminds.sonar.plpgsql.protobuf.RoleSpecOrBuilder> 
        getNewownerFieldBuilder() {
      if (newownerBuilder_ == null) {
        newownerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.plpgsql.protobuf.RoleSpec, com.premiumminds.sonar.plpgsql.protobuf.RoleSpec.Builder, com.premiumminds.sonar.plpgsql.protobuf.RoleSpecOrBuilder>(
                getNewowner(),
                getParentForChildren(),
                isClean());
        newowner_ = null;
      }
      return newownerBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:pg_query.AlterOwnerStmt)
  }

  // @@protoc_insertion_point(class_scope:pg_query.AlterOwnerStmt)
  private static final com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt();
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlterOwnerStmt>
      PARSER = new com.google.protobuf.AbstractParser<AlterOwnerStmt>() {
    @java.lang.Override
    public AlterOwnerStmt parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AlterOwnerStmt(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AlterOwnerStmt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlterOwnerStmt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.AlterOwnerStmt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

