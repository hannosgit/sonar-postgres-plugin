// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

/**
 * Protobuf type {@code pg_query.DropStmt}
 */
public final class DropStmt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.DropStmt)
    DropStmtOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DropStmt.newBuilder() to construct.
  private DropStmt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DropStmt() {
    objects_ = java.util.Collections.emptyList();
    removeType_ = 0;
    behavior_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DropStmt();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DropStmt(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              objects_ = new java.util.ArrayList<com.premiumminds.sonar.plpgsql.protobuf.Node>();
              mutable_bitField0_ |= 0x00000001;
            }
            objects_.add(
                input.readMessage(com.premiumminds.sonar.plpgsql.protobuf.Node.parser(), extensionRegistry));
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            removeType_ = rawValue;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            behavior_ = rawValue;
            break;
          }
          case 32: {

            missingOk_ = input.readBool();
            break;
          }
          case 40: {

            concurrent_ = input.readBool();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        objects_ = java.util.Collections.unmodifiableList(objects_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_DropStmt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_DropStmt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.plpgsql.protobuf.DropStmt.class, com.premiumminds.sonar.plpgsql.protobuf.DropStmt.Builder.class);
  }

  public static final int OBJECTS_FIELD_NUMBER = 1;
  private java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> objects_;
  /**
   * <code>repeated .pg_query.Node objects = 1 [json_name = "objects"];</code>
   */
  @java.lang.Override
  public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> getObjectsList() {
    return objects_;
  }
  /**
   * <code>repeated .pg_query.Node objects = 1 [json_name = "objects"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getObjectsOrBuilderList() {
    return objects_;
  }
  /**
   * <code>repeated .pg_query.Node objects = 1 [json_name = "objects"];</code>
   */
  @java.lang.Override
  public int getObjectsCount() {
    return objects_.size();
  }
  /**
   * <code>repeated .pg_query.Node objects = 1 [json_name = "objects"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.Node getObjects(int index) {
    return objects_.get(index);
  }
  /**
   * <code>repeated .pg_query.Node objects = 1 [json_name = "objects"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getObjectsOrBuilder(
      int index) {
    return objects_.get(index);
  }

  public static final int REMOVE_TYPE_FIELD_NUMBER = 2;
  private int removeType_;
  /**
   * <code>.pg_query.ObjectType remove_type = 2 [json_name = "removeType"];</code>
   * @return The enum numeric value on the wire for removeType.
   */
  @java.lang.Override public int getRemoveTypeValue() {
    return removeType_;
  }
  /**
   * <code>.pg_query.ObjectType remove_type = 2 [json_name = "removeType"];</code>
   * @return The removeType.
   */
  @java.lang.Override public com.premiumminds.sonar.plpgsql.protobuf.ObjectType getRemoveType() {
    @SuppressWarnings("deprecation")
    com.premiumminds.sonar.plpgsql.protobuf.ObjectType result = com.premiumminds.sonar.plpgsql.protobuf.ObjectType.valueOf(removeType_);
    return result == null ? com.premiumminds.sonar.plpgsql.protobuf.ObjectType.UNRECOGNIZED : result;
  }

  public static final int BEHAVIOR_FIELD_NUMBER = 3;
  private int behavior_;
  /**
   * <code>.pg_query.DropBehavior behavior = 3 [json_name = "behavior"];</code>
   * @return The enum numeric value on the wire for behavior.
   */
  @java.lang.Override public int getBehaviorValue() {
    return behavior_;
  }
  /**
   * <code>.pg_query.DropBehavior behavior = 3 [json_name = "behavior"];</code>
   * @return The behavior.
   */
  @java.lang.Override public com.premiumminds.sonar.plpgsql.protobuf.DropBehavior getBehavior() {
    @SuppressWarnings("deprecation")
    com.premiumminds.sonar.plpgsql.protobuf.DropBehavior result = com.premiumminds.sonar.plpgsql.protobuf.DropBehavior.valueOf(behavior_);
    return result == null ? com.premiumminds.sonar.plpgsql.protobuf.DropBehavior.UNRECOGNIZED : result;
  }

  public static final int MISSING_OK_FIELD_NUMBER = 4;
  private boolean missingOk_;
  /**
   * <code>bool missing_ok = 4 [json_name = "missing_ok"];</code>
   * @return The missingOk.
   */
  @java.lang.Override
  public boolean getMissingOk() {
    return missingOk_;
  }

  public static final int CONCURRENT_FIELD_NUMBER = 5;
  private boolean concurrent_;
  /**
   * <code>bool concurrent = 5 [json_name = "concurrent"];</code>
   * @return The concurrent.
   */
  @java.lang.Override
  public boolean getConcurrent() {
    return concurrent_;
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
    for (int i = 0; i < objects_.size(); i++) {
      output.writeMessage(1, objects_.get(i));
    }
    if (removeType_ != com.premiumminds.sonar.plpgsql.protobuf.ObjectType.OBJECT_TYPE_UNDEFINED.getNumber()) {
      output.writeEnum(2, removeType_);
    }
    if (behavior_ != com.premiumminds.sonar.plpgsql.protobuf.DropBehavior.DROP_BEHAVIOR_UNDEFINED.getNumber()) {
      output.writeEnum(3, behavior_);
    }
    if (missingOk_ != false) {
      output.writeBool(4, missingOk_);
    }
    if (concurrent_ != false) {
      output.writeBool(5, concurrent_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < objects_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, objects_.get(i));
    }
    if (removeType_ != com.premiumminds.sonar.plpgsql.protobuf.ObjectType.OBJECT_TYPE_UNDEFINED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, removeType_);
    }
    if (behavior_ != com.premiumminds.sonar.plpgsql.protobuf.DropBehavior.DROP_BEHAVIOR_UNDEFINED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, behavior_);
    }
    if (missingOk_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, missingOk_);
    }
    if (concurrent_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, concurrent_);
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
    if (!(obj instanceof com.premiumminds.sonar.plpgsql.protobuf.DropStmt)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.plpgsql.protobuf.DropStmt other = (com.premiumminds.sonar.plpgsql.protobuf.DropStmt) obj;

    if (!getObjectsList()
        .equals(other.getObjectsList())) return false;
    if (removeType_ != other.removeType_) return false;
    if (behavior_ != other.behavior_) return false;
    if (getMissingOk()
        != other.getMissingOk()) return false;
    if (getConcurrent()
        != other.getConcurrent()) return false;
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
    if (getObjectsCount() > 0) {
      hash = (37 * hash) + OBJECTS_FIELD_NUMBER;
      hash = (53 * hash) + getObjectsList().hashCode();
    }
    hash = (37 * hash) + REMOVE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + removeType_;
    hash = (37 * hash) + BEHAVIOR_FIELD_NUMBER;
    hash = (53 * hash) + behavior_;
    hash = (37 * hash) + MISSING_OK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMissingOk());
    hash = (37 * hash) + CONCURRENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getConcurrent());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.DropStmt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.DropStmt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.DropStmt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.DropStmt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.DropStmt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.DropStmt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.DropStmt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.DropStmt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.DropStmt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.DropStmt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.DropStmt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.DropStmt parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.plpgsql.protobuf.DropStmt prototype) {
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
   * Protobuf type {@code pg_query.DropStmt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.DropStmt)
      com.premiumminds.sonar.plpgsql.protobuf.DropStmtOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_DropStmt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_DropStmt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.plpgsql.protobuf.DropStmt.class, com.premiumminds.sonar.plpgsql.protobuf.DropStmt.Builder.class);
    }

    // Construct using com.premiumminds.sonar.plpgsql.protobuf.DropStmt.newBuilder()
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
        getObjectsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (objectsBuilder_ == null) {
        objects_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        objectsBuilder_.clear();
      }
      removeType_ = 0;

      behavior_ = 0;

      missingOk_ = false;

      concurrent_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_DropStmt_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.DropStmt getDefaultInstanceForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.DropStmt.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.DropStmt build() {
      com.premiumminds.sonar.plpgsql.protobuf.DropStmt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.DropStmt buildPartial() {
      com.premiumminds.sonar.plpgsql.protobuf.DropStmt result = new com.premiumminds.sonar.plpgsql.protobuf.DropStmt(this);
      int from_bitField0_ = bitField0_;
      if (objectsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          objects_ = java.util.Collections.unmodifiableList(objects_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.objects_ = objects_;
      } else {
        result.objects_ = objectsBuilder_.build();
      }
      result.removeType_ = removeType_;
      result.behavior_ = behavior_;
      result.missingOk_ = missingOk_;
      result.concurrent_ = concurrent_;
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
      if (other instanceof com.premiumminds.sonar.plpgsql.protobuf.DropStmt) {
        return mergeFrom((com.premiumminds.sonar.plpgsql.protobuf.DropStmt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.plpgsql.protobuf.DropStmt other) {
      if (other == com.premiumminds.sonar.plpgsql.protobuf.DropStmt.getDefaultInstance()) return this;
      if (objectsBuilder_ == null) {
        if (!other.objects_.isEmpty()) {
          if (objects_.isEmpty()) {
            objects_ = other.objects_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureObjectsIsMutable();
            objects_.addAll(other.objects_);
          }
          onChanged();
        }
      } else {
        if (!other.objects_.isEmpty()) {
          if (objectsBuilder_.isEmpty()) {
            objectsBuilder_.dispose();
            objectsBuilder_ = null;
            objects_ = other.objects_;
            bitField0_ = (bitField0_ & ~0x00000001);
            objectsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getObjectsFieldBuilder() : null;
          } else {
            objectsBuilder_.addAllMessages(other.objects_);
          }
        }
      }
      if (other.removeType_ != 0) {
        setRemoveTypeValue(other.getRemoveTypeValue());
      }
      if (other.behavior_ != 0) {
        setBehaviorValue(other.getBehaviorValue());
      }
      if (other.getMissingOk() != false) {
        setMissingOk(other.getMissingOk());
      }
      if (other.getConcurrent() != false) {
        setConcurrent(other.getConcurrent());
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
      com.premiumminds.sonar.plpgsql.protobuf.DropStmt parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.premiumminds.sonar.plpgsql.protobuf.DropStmt) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> objects_ =
      java.util.Collections.emptyList();
    private void ensureObjectsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        objects_ = new java.util.ArrayList<com.premiumminds.sonar.plpgsql.protobuf.Node>(objects_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> objectsBuilder_;

    /**
     * <code>repeated .pg_query.Node objects = 1 [json_name = "objects"];</code>
     */
    public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> getObjectsList() {
      if (objectsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(objects_);
      } else {
        return objectsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pg_query.Node objects = 1 [json_name = "objects"];</code>
     */
    public int getObjectsCount() {
      if (objectsBuilder_ == null) {
        return objects_.size();
      } else {
        return objectsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pg_query.Node objects = 1 [json_name = "objects"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node getObjects(int index) {
      if (objectsBuilder_ == null) {
        return objects_.get(index);
      } else {
        return objectsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node objects = 1 [json_name = "objects"];</code>
     */
    public Builder setObjects(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (objectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureObjectsIsMutable();
        objects_.set(index, value);
        onChanged();
      } else {
        objectsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node objects = 1 [json_name = "objects"];</code>
     */
    public Builder setObjects(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (objectsBuilder_ == null) {
        ensureObjectsIsMutable();
        objects_.set(index, builderForValue.build());
        onChanged();
      } else {
        objectsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node objects = 1 [json_name = "objects"];</code>
     */
    public Builder addObjects(com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (objectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureObjectsIsMutable();
        objects_.add(value);
        onChanged();
      } else {
        objectsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node objects = 1 [json_name = "objects"];</code>
     */
    public Builder addObjects(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (objectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureObjectsIsMutable();
        objects_.add(index, value);
        onChanged();
      } else {
        objectsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node objects = 1 [json_name = "objects"];</code>
     */
    public Builder addObjects(
        com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (objectsBuilder_ == null) {
        ensureObjectsIsMutable();
        objects_.add(builderForValue.build());
        onChanged();
      } else {
        objectsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node objects = 1 [json_name = "objects"];</code>
     */
    public Builder addObjects(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (objectsBuilder_ == null) {
        ensureObjectsIsMutable();
        objects_.add(index, builderForValue.build());
        onChanged();
      } else {
        objectsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node objects = 1 [json_name = "objects"];</code>
     */
    public Builder addAllObjects(
        java.lang.Iterable<? extends com.premiumminds.sonar.plpgsql.protobuf.Node> values) {
      if (objectsBuilder_ == null) {
        ensureObjectsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, objects_);
        onChanged();
      } else {
        objectsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node objects = 1 [json_name = "objects"];</code>
     */
    public Builder clearObjects() {
      if (objectsBuilder_ == null) {
        objects_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        objectsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node objects = 1 [json_name = "objects"];</code>
     */
    public Builder removeObjects(int index) {
      if (objectsBuilder_ == null) {
        ensureObjectsIsMutable();
        objects_.remove(index);
        onChanged();
      } else {
        objectsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node objects = 1 [json_name = "objects"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder getObjectsBuilder(
        int index) {
      return getObjectsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pg_query.Node objects = 1 [json_name = "objects"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getObjectsOrBuilder(
        int index) {
      if (objectsBuilder_ == null) {
        return objects_.get(index);  } else {
        return objectsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node objects = 1 [json_name = "objects"];</code>
     */
    public java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
         getObjectsOrBuilderList() {
      if (objectsBuilder_ != null) {
        return objectsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(objects_);
      }
    }
    /**
     * <code>repeated .pg_query.Node objects = 1 [json_name = "objects"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder addObjectsBuilder() {
      return getObjectsFieldBuilder().addBuilder(
          com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node objects = 1 [json_name = "objects"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder addObjectsBuilder(
        int index) {
      return getObjectsFieldBuilder().addBuilder(
          index, com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node objects = 1 [json_name = "objects"];</code>
     */
    public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node.Builder> 
         getObjectsBuilderList() {
      return getObjectsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
        getObjectsFieldBuilder() {
      if (objectsBuilder_ == null) {
        objectsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder>(
                objects_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        objects_ = null;
      }
      return objectsBuilder_;
    }

    private int removeType_ = 0;
    /**
     * <code>.pg_query.ObjectType remove_type = 2 [json_name = "removeType"];</code>
     * @return The enum numeric value on the wire for removeType.
     */
    @java.lang.Override public int getRemoveTypeValue() {
      return removeType_;
    }
    /**
     * <code>.pg_query.ObjectType remove_type = 2 [json_name = "removeType"];</code>
     * @param value The enum numeric value on the wire for removeType to set.
     * @return This builder for chaining.
     */
    public Builder setRemoveTypeValue(int value) {
      
      removeType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.ObjectType remove_type = 2 [json_name = "removeType"];</code>
     * @return The removeType.
     */
    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.ObjectType getRemoveType() {
      @SuppressWarnings("deprecation")
      com.premiumminds.sonar.plpgsql.protobuf.ObjectType result = com.premiumminds.sonar.plpgsql.protobuf.ObjectType.valueOf(removeType_);
      return result == null ? com.premiumminds.sonar.plpgsql.protobuf.ObjectType.UNRECOGNIZED : result;
    }
    /**
     * <code>.pg_query.ObjectType remove_type = 2 [json_name = "removeType"];</code>
     * @param value The removeType to set.
     * @return This builder for chaining.
     */
    public Builder setRemoveType(com.premiumminds.sonar.plpgsql.protobuf.ObjectType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      removeType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.ObjectType remove_type = 2 [json_name = "removeType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRemoveType() {
      
      removeType_ = 0;
      onChanged();
      return this;
    }

    private int behavior_ = 0;
    /**
     * <code>.pg_query.DropBehavior behavior = 3 [json_name = "behavior"];</code>
     * @return The enum numeric value on the wire for behavior.
     */
    @java.lang.Override public int getBehaviorValue() {
      return behavior_;
    }
    /**
     * <code>.pg_query.DropBehavior behavior = 3 [json_name = "behavior"];</code>
     * @param value The enum numeric value on the wire for behavior to set.
     * @return This builder for chaining.
     */
    public Builder setBehaviorValue(int value) {
      
      behavior_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.DropBehavior behavior = 3 [json_name = "behavior"];</code>
     * @return The behavior.
     */
    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.DropBehavior getBehavior() {
      @SuppressWarnings("deprecation")
      com.premiumminds.sonar.plpgsql.protobuf.DropBehavior result = com.premiumminds.sonar.plpgsql.protobuf.DropBehavior.valueOf(behavior_);
      return result == null ? com.premiumminds.sonar.plpgsql.protobuf.DropBehavior.UNRECOGNIZED : result;
    }
    /**
     * <code>.pg_query.DropBehavior behavior = 3 [json_name = "behavior"];</code>
     * @param value The behavior to set.
     * @return This builder for chaining.
     */
    public Builder setBehavior(com.premiumminds.sonar.plpgsql.protobuf.DropBehavior value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      behavior_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.DropBehavior behavior = 3 [json_name = "behavior"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBehavior() {
      
      behavior_ = 0;
      onChanged();
      return this;
    }

    private boolean missingOk_ ;
    /**
     * <code>bool missing_ok = 4 [json_name = "missing_ok"];</code>
     * @return The missingOk.
     */
    @java.lang.Override
    public boolean getMissingOk() {
      return missingOk_;
    }
    /**
     * <code>bool missing_ok = 4 [json_name = "missing_ok"];</code>
     * @param value The missingOk to set.
     * @return This builder for chaining.
     */
    public Builder setMissingOk(boolean value) {
      
      missingOk_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool missing_ok = 4 [json_name = "missing_ok"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMissingOk() {
      
      missingOk_ = false;
      onChanged();
      return this;
    }

    private boolean concurrent_ ;
    /**
     * <code>bool concurrent = 5 [json_name = "concurrent"];</code>
     * @return The concurrent.
     */
    @java.lang.Override
    public boolean getConcurrent() {
      return concurrent_;
    }
    /**
     * <code>bool concurrent = 5 [json_name = "concurrent"];</code>
     * @param value The concurrent to set.
     * @return This builder for chaining.
     */
    public Builder setConcurrent(boolean value) {
      
      concurrent_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool concurrent = 5 [json_name = "concurrent"];</code>
     * @return This builder for chaining.
     */
    public Builder clearConcurrent() {
      
      concurrent_ = false;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:pg_query.DropStmt)
  }

  // @@protoc_insertion_point(class_scope:pg_query.DropStmt)
  private static final com.premiumminds.sonar.plpgsql.protobuf.DropStmt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.plpgsql.protobuf.DropStmt();
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.DropStmt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DropStmt>
      PARSER = new com.google.protobuf.AbstractParser<DropStmt>() {
    @java.lang.Override
    public DropStmt parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DropStmt(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DropStmt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DropStmt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.DropStmt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

