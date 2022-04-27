// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

/**
 * Protobuf type {@code pg_query.AlterOperatorStmt}
 */
public final class AlterOperatorStmt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.AlterOperatorStmt)
    AlterOperatorStmtOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlterOperatorStmt.newBuilder() to construct.
  private AlterOperatorStmt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlterOperatorStmt() {
    options_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AlterOperatorStmt();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AlterOperatorStmt(
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
            com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgs.Builder subBuilder = null;
            if (opername_ != null) {
              subBuilder = opername_.toBuilder();
            }
            opername_ = input.readMessage(com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgs.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(opername_);
              opername_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              options_ = new java.util.ArrayList<com.premiumminds.sonar.plpgsql.protobuf.Node>();
              mutable_bitField0_ |= 0x00000001;
            }
            options_.add(
                input.readMessage(com.premiumminds.sonar.plpgsql.protobuf.Node.parser(), extensionRegistry));
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
        options_ = java.util.Collections.unmodifiableList(options_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_AlterOperatorStmt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_AlterOperatorStmt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt.class, com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt.Builder.class);
  }

  public static final int OPERNAME_FIELD_NUMBER = 1;
  private com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgs opername_;
  /**
   * <code>.pg_query.ObjectWithArgs opername = 1 [json_name = "opername"];</code>
   * @return Whether the opername field is set.
   */
  @java.lang.Override
  public boolean hasOpername() {
    return opername_ != null;
  }
  /**
   * <code>.pg_query.ObjectWithArgs opername = 1 [json_name = "opername"];</code>
   * @return The opername.
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgs getOpername() {
    return opername_ == null ? com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgs.getDefaultInstance() : opername_;
  }
  /**
   * <code>.pg_query.ObjectWithArgs opername = 1 [json_name = "opername"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgsOrBuilder getOpernameOrBuilder() {
    return getOpername();
  }

  public static final int OPTIONS_FIELD_NUMBER = 2;
  private java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> options_;
  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  @java.lang.Override
  public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> getOptionsList() {
    return options_;
  }
  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getOptionsOrBuilderList() {
    return options_;
  }
  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  @java.lang.Override
  public int getOptionsCount() {
    return options_.size();
  }
  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.Node getOptions(int index) {
    return options_.get(index);
  }
  /**
   * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getOptionsOrBuilder(
      int index) {
    return options_.get(index);
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
    if (opername_ != null) {
      output.writeMessage(1, getOpername());
    }
    for (int i = 0; i < options_.size(); i++) {
      output.writeMessage(2, options_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (opername_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOpername());
    }
    for (int i = 0; i < options_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, options_.get(i));
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
    if (!(obj instanceof com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt other = (com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt) obj;

    if (hasOpername() != other.hasOpername()) return false;
    if (hasOpername()) {
      if (!getOpername()
          .equals(other.getOpername())) return false;
    }
    if (!getOptionsList()
        .equals(other.getOptionsList())) return false;
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
    if (hasOpername()) {
      hash = (37 * hash) + OPERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getOpername().hashCode();
    }
    if (getOptionsCount() > 0) {
      hash = (37 * hash) + OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOptionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt prototype) {
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
   * Protobuf type {@code pg_query.AlterOperatorStmt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.AlterOperatorStmt)
      com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmtOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_AlterOperatorStmt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_AlterOperatorStmt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt.class, com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt.Builder.class);
    }

    // Construct using com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt.newBuilder()
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
        getOptionsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (opernameBuilder_ == null) {
        opername_ = null;
      } else {
        opername_ = null;
        opernameBuilder_ = null;
      }
      if (optionsBuilder_ == null) {
        options_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        optionsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_AlterOperatorStmt_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt getDefaultInstanceForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt build() {
      com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt buildPartial() {
      com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt result = new com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt(this);
      int from_bitField0_ = bitField0_;
      if (opernameBuilder_ == null) {
        result.opername_ = opername_;
      } else {
        result.opername_ = opernameBuilder_.build();
      }
      if (optionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          options_ = java.util.Collections.unmodifiableList(options_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.options_ = options_;
      } else {
        result.options_ = optionsBuilder_.build();
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
      if (other instanceof com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt) {
        return mergeFrom((com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt other) {
      if (other == com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt.getDefaultInstance()) return this;
      if (other.hasOpername()) {
        mergeOpername(other.getOpername());
      }
      if (optionsBuilder_ == null) {
        if (!other.options_.isEmpty()) {
          if (options_.isEmpty()) {
            options_ = other.options_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOptionsIsMutable();
            options_.addAll(other.options_);
          }
          onChanged();
        }
      } else {
        if (!other.options_.isEmpty()) {
          if (optionsBuilder_.isEmpty()) {
            optionsBuilder_.dispose();
            optionsBuilder_ = null;
            options_ = other.options_;
            bitField0_ = (bitField0_ & ~0x00000001);
            optionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOptionsFieldBuilder() : null;
          } else {
            optionsBuilder_.addAllMessages(other.options_);
          }
        }
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
      com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgs opername_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgs, com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgs.Builder, com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgsOrBuilder> opernameBuilder_;
    /**
     * <code>.pg_query.ObjectWithArgs opername = 1 [json_name = "opername"];</code>
     * @return Whether the opername field is set.
     */
    public boolean hasOpername() {
      return opernameBuilder_ != null || opername_ != null;
    }
    /**
     * <code>.pg_query.ObjectWithArgs opername = 1 [json_name = "opername"];</code>
     * @return The opername.
     */
    public com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgs getOpername() {
      if (opernameBuilder_ == null) {
        return opername_ == null ? com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgs.getDefaultInstance() : opername_;
      } else {
        return opernameBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.ObjectWithArgs opername = 1 [json_name = "opername"];</code>
     */
    public Builder setOpername(com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgs value) {
      if (opernameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        opername_ = value;
        onChanged();
      } else {
        opernameBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.ObjectWithArgs opername = 1 [json_name = "opername"];</code>
     */
    public Builder setOpername(
        com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgs.Builder builderForValue) {
      if (opernameBuilder_ == null) {
        opername_ = builderForValue.build();
        onChanged();
      } else {
        opernameBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pg_query.ObjectWithArgs opername = 1 [json_name = "opername"];</code>
     */
    public Builder mergeOpername(com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgs value) {
      if (opernameBuilder_ == null) {
        if (opername_ != null) {
          opername_ =
            com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgs.newBuilder(opername_).mergeFrom(value).buildPartial();
        } else {
          opername_ = value;
        }
        onChanged();
      } else {
        opernameBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.ObjectWithArgs opername = 1 [json_name = "opername"];</code>
     */
    public Builder clearOpername() {
      if (opernameBuilder_ == null) {
        opername_ = null;
        onChanged();
      } else {
        opername_ = null;
        opernameBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pg_query.ObjectWithArgs opername = 1 [json_name = "opername"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgs.Builder getOpernameBuilder() {
      
      onChanged();
      return getOpernameFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.ObjectWithArgs opername = 1 [json_name = "opername"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgsOrBuilder getOpernameOrBuilder() {
      if (opernameBuilder_ != null) {
        return opernameBuilder_.getMessageOrBuilder();
      } else {
        return opername_ == null ?
            com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgs.getDefaultInstance() : opername_;
      }
    }
    /**
     * <code>.pg_query.ObjectWithArgs opername = 1 [json_name = "opername"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgs, com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgs.Builder, com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgsOrBuilder> 
        getOpernameFieldBuilder() {
      if (opernameBuilder_ == null) {
        opernameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgs, com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgs.Builder, com.premiumminds.sonar.plpgsql.protobuf.ObjectWithArgsOrBuilder>(
                getOpername(),
                getParentForChildren(),
                isClean());
        opername_ = null;
      }
      return opernameBuilder_;
    }

    private java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> options_ =
      java.util.Collections.emptyList();
    private void ensureOptionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        options_ = new java.util.ArrayList<com.premiumminds.sonar.plpgsql.protobuf.Node>(options_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> optionsBuilder_;

    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> getOptionsList() {
      if (optionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(options_);
      } else {
        return optionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public int getOptionsCount() {
      if (optionsBuilder_ == null) {
        return options_.size();
      } else {
        return optionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node getOptions(int index) {
      if (optionsBuilder_ == null) {
        return options_.get(index);
      } else {
        return optionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public Builder setOptions(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (optionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOptionsIsMutable();
        options_.set(index, value);
        onChanged();
      } else {
        optionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public Builder setOptions(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (optionsBuilder_ == null) {
        ensureOptionsIsMutable();
        options_.set(index, builderForValue.build());
        onChanged();
      } else {
        optionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public Builder addOptions(com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (optionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOptionsIsMutable();
        options_.add(value);
        onChanged();
      } else {
        optionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public Builder addOptions(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (optionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOptionsIsMutable();
        options_.add(index, value);
        onChanged();
      } else {
        optionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public Builder addOptions(
        com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (optionsBuilder_ == null) {
        ensureOptionsIsMutable();
        options_.add(builderForValue.build());
        onChanged();
      } else {
        optionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public Builder addOptions(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (optionsBuilder_ == null) {
        ensureOptionsIsMutable();
        options_.add(index, builderForValue.build());
        onChanged();
      } else {
        optionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public Builder addAllOptions(
        java.lang.Iterable<? extends com.premiumminds.sonar.plpgsql.protobuf.Node> values) {
      if (optionsBuilder_ == null) {
        ensureOptionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, options_);
        onChanged();
      } else {
        optionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public Builder clearOptions() {
      if (optionsBuilder_ == null) {
        options_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        optionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public Builder removeOptions(int index) {
      if (optionsBuilder_ == null) {
        ensureOptionsIsMutable();
        options_.remove(index);
        onChanged();
      } else {
        optionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder getOptionsBuilder(
        int index) {
      return getOptionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getOptionsOrBuilder(
        int index) {
      if (optionsBuilder_ == null) {
        return options_.get(index);  } else {
        return optionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
         getOptionsOrBuilderList() {
      if (optionsBuilder_ != null) {
        return optionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(options_);
      }
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder addOptionsBuilder() {
      return getOptionsFieldBuilder().addBuilder(
          com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder addOptionsBuilder(
        int index) {
      return getOptionsFieldBuilder().addBuilder(
          index, com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node options = 2 [json_name = "options"];</code>
     */
    public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node.Builder> 
         getOptionsBuilderList() {
      return getOptionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
        getOptionsFieldBuilder() {
      if (optionsBuilder_ == null) {
        optionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder>(
                options_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        options_ = null;
      }
      return optionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pg_query.AlterOperatorStmt)
  }

  // @@protoc_insertion_point(class_scope:pg_query.AlterOperatorStmt)
  private static final com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt();
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlterOperatorStmt>
      PARSER = new com.google.protobuf.AbstractParser<AlterOperatorStmt>() {
    @java.lang.Override
    public AlterOperatorStmt parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AlterOperatorStmt(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AlterOperatorStmt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlterOperatorStmt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.AlterOperatorStmt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

