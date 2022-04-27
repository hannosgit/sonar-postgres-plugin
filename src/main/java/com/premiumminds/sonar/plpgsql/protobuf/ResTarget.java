// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

/**
 * Protobuf type {@code pg_query.ResTarget}
 */
public final class ResTarget extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.ResTarget)
    ResTargetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResTarget.newBuilder() to construct.
  private ResTarget(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResTarget() {
    name_ = "";
    indirection_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResTarget();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResTarget(
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
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              indirection_ = new java.util.ArrayList<com.premiumminds.sonar.plpgsql.protobuf.Node>();
              mutable_bitField0_ |= 0x00000001;
            }
            indirection_.add(
                input.readMessage(com.premiumminds.sonar.plpgsql.protobuf.Node.parser(), extensionRegistry));
            break;
          }
          case 26: {
            com.premiumminds.sonar.plpgsql.protobuf.Node.Builder subBuilder = null;
            if (val_ != null) {
              subBuilder = val_.toBuilder();
            }
            val_ = input.readMessage(com.premiumminds.sonar.plpgsql.protobuf.Node.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(val_);
              val_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            location_ = input.readInt32();
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
        indirection_ = java.util.Collections.unmodifiableList(indirection_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_ResTarget_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_ResTarget_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.plpgsql.protobuf.ResTarget.class, com.premiumminds.sonar.plpgsql.protobuf.ResTarget.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INDIRECTION_FIELD_NUMBER = 2;
  private java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> indirection_;
  /**
   * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
   */
  @java.lang.Override
  public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> getIndirectionList() {
    return indirection_;
  }
  /**
   * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getIndirectionOrBuilderList() {
    return indirection_;
  }
  /**
   * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
   */
  @java.lang.Override
  public int getIndirectionCount() {
    return indirection_.size();
  }
  /**
   * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.Node getIndirection(int index) {
    return indirection_.get(index);
  }
  /**
   * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getIndirectionOrBuilder(
      int index) {
    return indirection_.get(index);
  }

  public static final int VAL_FIELD_NUMBER = 3;
  private com.premiumminds.sonar.plpgsql.protobuf.Node val_;
  /**
   * <code>.pg_query.Node val = 3 [json_name = "val"];</code>
   * @return Whether the val field is set.
   */
  @java.lang.Override
  public boolean hasVal() {
    return val_ != null;
  }
  /**
   * <code>.pg_query.Node val = 3 [json_name = "val"];</code>
   * @return The val.
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.Node getVal() {
    return val_ == null ? com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance() : val_;
  }
  /**
   * <code>.pg_query.Node val = 3 [json_name = "val"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getValOrBuilder() {
    return getVal();
  }

  public static final int LOCATION_FIELD_NUMBER = 4;
  private int location_;
  /**
   * <code>int32 location = 4 [json_name = "location"];</code>
   * @return The location.
   */
  @java.lang.Override
  public int getLocation() {
    return location_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < indirection_.size(); i++) {
      output.writeMessage(2, indirection_.get(i));
    }
    if (val_ != null) {
      output.writeMessage(3, getVal());
    }
    if (location_ != 0) {
      output.writeInt32(4, location_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (int i = 0; i < indirection_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, indirection_.get(i));
    }
    if (val_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getVal());
    }
    if (location_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, location_);
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
    if (!(obj instanceof com.premiumminds.sonar.plpgsql.protobuf.ResTarget)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.plpgsql.protobuf.ResTarget other = (com.premiumminds.sonar.plpgsql.protobuf.ResTarget) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getIndirectionList()
        .equals(other.getIndirectionList())) return false;
    if (hasVal() != other.hasVal()) return false;
    if (hasVal()) {
      if (!getVal()
          .equals(other.getVal())) return false;
    }
    if (getLocation()
        != other.getLocation()) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getIndirectionCount() > 0) {
      hash = (37 * hash) + INDIRECTION_FIELD_NUMBER;
      hash = (53 * hash) + getIndirectionList().hashCode();
    }
    if (hasVal()) {
      hash = (37 * hash) + VAL_FIELD_NUMBER;
      hash = (53 * hash) + getVal().hashCode();
    }
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.ResTarget parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.ResTarget parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.ResTarget parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.ResTarget parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.ResTarget parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.ResTarget parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.ResTarget parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.ResTarget parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.ResTarget parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.ResTarget parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.ResTarget parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.ResTarget parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.plpgsql.protobuf.ResTarget prototype) {
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
   * Protobuf type {@code pg_query.ResTarget}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.ResTarget)
      com.premiumminds.sonar.plpgsql.protobuf.ResTargetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_ResTarget_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_ResTarget_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.plpgsql.protobuf.ResTarget.class, com.premiumminds.sonar.plpgsql.protobuf.ResTarget.Builder.class);
    }

    // Construct using com.premiumminds.sonar.plpgsql.protobuf.ResTarget.newBuilder()
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
        getIndirectionFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (indirectionBuilder_ == null) {
        indirection_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        indirectionBuilder_.clear();
      }
      if (valBuilder_ == null) {
        val_ = null;
      } else {
        val_ = null;
        valBuilder_ = null;
      }
      location_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_ResTarget_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.ResTarget getDefaultInstanceForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.ResTarget.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.ResTarget build() {
      com.premiumminds.sonar.plpgsql.protobuf.ResTarget result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.ResTarget buildPartial() {
      com.premiumminds.sonar.plpgsql.protobuf.ResTarget result = new com.premiumminds.sonar.plpgsql.protobuf.ResTarget(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      if (indirectionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          indirection_ = java.util.Collections.unmodifiableList(indirection_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.indirection_ = indirection_;
      } else {
        result.indirection_ = indirectionBuilder_.build();
      }
      if (valBuilder_ == null) {
        result.val_ = val_;
      } else {
        result.val_ = valBuilder_.build();
      }
      result.location_ = location_;
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
      if (other instanceof com.premiumminds.sonar.plpgsql.protobuf.ResTarget) {
        return mergeFrom((com.premiumminds.sonar.plpgsql.protobuf.ResTarget)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.plpgsql.protobuf.ResTarget other) {
      if (other == com.premiumminds.sonar.plpgsql.protobuf.ResTarget.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (indirectionBuilder_ == null) {
        if (!other.indirection_.isEmpty()) {
          if (indirection_.isEmpty()) {
            indirection_ = other.indirection_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureIndirectionIsMutable();
            indirection_.addAll(other.indirection_);
          }
          onChanged();
        }
      } else {
        if (!other.indirection_.isEmpty()) {
          if (indirectionBuilder_.isEmpty()) {
            indirectionBuilder_.dispose();
            indirectionBuilder_ = null;
            indirection_ = other.indirection_;
            bitField0_ = (bitField0_ & ~0x00000001);
            indirectionBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getIndirectionFieldBuilder() : null;
          } else {
            indirectionBuilder_.addAllMessages(other.indirection_);
          }
        }
      }
      if (other.hasVal()) {
        mergeVal(other.getVal());
      }
      if (other.getLocation() != 0) {
        setLocation(other.getLocation());
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
      com.premiumminds.sonar.plpgsql.protobuf.ResTarget parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.premiumminds.sonar.plpgsql.protobuf.ResTarget) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> indirection_ =
      java.util.Collections.emptyList();
    private void ensureIndirectionIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        indirection_ = new java.util.ArrayList<com.premiumminds.sonar.plpgsql.protobuf.Node>(indirection_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> indirectionBuilder_;

    /**
     * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
     */
    public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> getIndirectionList() {
      if (indirectionBuilder_ == null) {
        return java.util.Collections.unmodifiableList(indirection_);
      } else {
        return indirectionBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
     */
    public int getIndirectionCount() {
      if (indirectionBuilder_ == null) {
        return indirection_.size();
      } else {
        return indirectionBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node getIndirection(int index) {
      if (indirectionBuilder_ == null) {
        return indirection_.get(index);
      } else {
        return indirectionBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
     */
    public Builder setIndirection(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (indirectionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIndirectionIsMutable();
        indirection_.set(index, value);
        onChanged();
      } else {
        indirectionBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
     */
    public Builder setIndirection(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (indirectionBuilder_ == null) {
        ensureIndirectionIsMutable();
        indirection_.set(index, builderForValue.build());
        onChanged();
      } else {
        indirectionBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
     */
    public Builder addIndirection(com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (indirectionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIndirectionIsMutable();
        indirection_.add(value);
        onChanged();
      } else {
        indirectionBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
     */
    public Builder addIndirection(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (indirectionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIndirectionIsMutable();
        indirection_.add(index, value);
        onChanged();
      } else {
        indirectionBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
     */
    public Builder addIndirection(
        com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (indirectionBuilder_ == null) {
        ensureIndirectionIsMutable();
        indirection_.add(builderForValue.build());
        onChanged();
      } else {
        indirectionBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
     */
    public Builder addIndirection(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (indirectionBuilder_ == null) {
        ensureIndirectionIsMutable();
        indirection_.add(index, builderForValue.build());
        onChanged();
      } else {
        indirectionBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
     */
    public Builder addAllIndirection(
        java.lang.Iterable<? extends com.premiumminds.sonar.plpgsql.protobuf.Node> values) {
      if (indirectionBuilder_ == null) {
        ensureIndirectionIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, indirection_);
        onChanged();
      } else {
        indirectionBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
     */
    public Builder clearIndirection() {
      if (indirectionBuilder_ == null) {
        indirection_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        indirectionBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
     */
    public Builder removeIndirection(int index) {
      if (indirectionBuilder_ == null) {
        ensureIndirectionIsMutable();
        indirection_.remove(index);
        onChanged();
      } else {
        indirectionBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder getIndirectionBuilder(
        int index) {
      return getIndirectionFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getIndirectionOrBuilder(
        int index) {
      if (indirectionBuilder_ == null) {
        return indirection_.get(index);  } else {
        return indirectionBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
     */
    public java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
         getIndirectionOrBuilderList() {
      if (indirectionBuilder_ != null) {
        return indirectionBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(indirection_);
      }
    }
    /**
     * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder addIndirectionBuilder() {
      return getIndirectionFieldBuilder().addBuilder(
          com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder addIndirectionBuilder(
        int index) {
      return getIndirectionFieldBuilder().addBuilder(
          index, com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node indirection = 2 [json_name = "indirection"];</code>
     */
    public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node.Builder> 
         getIndirectionBuilderList() {
      return getIndirectionFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
        getIndirectionFieldBuilder() {
      if (indirectionBuilder_ == null) {
        indirectionBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder>(
                indirection_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        indirection_ = null;
      }
      return indirectionBuilder_;
    }

    private com.premiumminds.sonar.plpgsql.protobuf.Node val_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> valBuilder_;
    /**
     * <code>.pg_query.Node val = 3 [json_name = "val"];</code>
     * @return Whether the val field is set.
     */
    public boolean hasVal() {
      return valBuilder_ != null || val_ != null;
    }
    /**
     * <code>.pg_query.Node val = 3 [json_name = "val"];</code>
     * @return The val.
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node getVal() {
      if (valBuilder_ == null) {
        return val_ == null ? com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance() : val_;
      } else {
        return valBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.Node val = 3 [json_name = "val"];</code>
     */
    public Builder setVal(com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (valBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        val_ = value;
        onChanged();
      } else {
        valBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.Node val = 3 [json_name = "val"];</code>
     */
    public Builder setVal(
        com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (valBuilder_ == null) {
        val_ = builderForValue.build();
        onChanged();
      } else {
        valBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pg_query.Node val = 3 [json_name = "val"];</code>
     */
    public Builder mergeVal(com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (valBuilder_ == null) {
        if (val_ != null) {
          val_ =
            com.premiumminds.sonar.plpgsql.protobuf.Node.newBuilder(val_).mergeFrom(value).buildPartial();
        } else {
          val_ = value;
        }
        onChanged();
      } else {
        valBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.Node val = 3 [json_name = "val"];</code>
     */
    public Builder clearVal() {
      if (valBuilder_ == null) {
        val_ = null;
        onChanged();
      } else {
        val_ = null;
        valBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pg_query.Node val = 3 [json_name = "val"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder getValBuilder() {
      
      onChanged();
      return getValFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.Node val = 3 [json_name = "val"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getValOrBuilder() {
      if (valBuilder_ != null) {
        return valBuilder_.getMessageOrBuilder();
      } else {
        return val_ == null ?
            com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance() : val_;
      }
    }
    /**
     * <code>.pg_query.Node val = 3 [json_name = "val"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
        getValFieldBuilder() {
      if (valBuilder_ == null) {
        valBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder>(
                getVal(),
                getParentForChildren(),
                isClean());
        val_ = null;
      }
      return valBuilder_;
    }

    private int location_ ;
    /**
     * <code>int32 location = 4 [json_name = "location"];</code>
     * @return The location.
     */
    @java.lang.Override
    public int getLocation() {
      return location_;
    }
    /**
     * <code>int32 location = 4 [json_name = "location"];</code>
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(int value) {
      
      location_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 location = 4 [json_name = "location"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      
      location_ = 0;
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


    // @@protoc_insertion_point(builder_scope:pg_query.ResTarget)
  }

  // @@protoc_insertion_point(class_scope:pg_query.ResTarget)
  private static final com.premiumminds.sonar.plpgsql.protobuf.ResTarget DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.plpgsql.protobuf.ResTarget();
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.ResTarget getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResTarget>
      PARSER = new com.google.protobuf.AbstractParser<ResTarget>() {
    @java.lang.Override
    public ResTarget parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResTarget(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResTarget> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResTarget> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.ResTarget getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

