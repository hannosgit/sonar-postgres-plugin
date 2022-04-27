// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

/**
 * Protobuf type {@code pg_query.TruncateStmt}
 */
public final class TruncateStmt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.TruncateStmt)
    TruncateStmtOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TruncateStmt.newBuilder() to construct.
  private TruncateStmt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TruncateStmt() {
    relations_ = java.util.Collections.emptyList();
    behavior_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TruncateStmt();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TruncateStmt(
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
              relations_ = new java.util.ArrayList<com.premiumminds.sonar.plpgsql.protobuf.Node>();
              mutable_bitField0_ |= 0x00000001;
            }
            relations_.add(
                input.readMessage(com.premiumminds.sonar.plpgsql.protobuf.Node.parser(), extensionRegistry));
            break;
          }
          case 16: {

            restartSeqs_ = input.readBool();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            behavior_ = rawValue;
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
        relations_ = java.util.Collections.unmodifiableList(relations_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_TruncateStmt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_TruncateStmt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt.class, com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt.Builder.class);
  }

  public static final int RELATIONS_FIELD_NUMBER = 1;
  private java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> relations_;
  /**
   * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
   */
  @java.lang.Override
  public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> getRelationsList() {
    return relations_;
  }
  /**
   * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
      getRelationsOrBuilderList() {
    return relations_;
  }
  /**
   * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
   */
  @java.lang.Override
  public int getRelationsCount() {
    return relations_.size();
  }
  /**
   * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.Node getRelations(int index) {
    return relations_.get(index);
  }
  /**
   * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getRelationsOrBuilder(
      int index) {
    return relations_.get(index);
  }

  public static final int RESTART_SEQS_FIELD_NUMBER = 2;
  private boolean restartSeqs_;
  /**
   * <code>bool restart_seqs = 2 [json_name = "restart_seqs"];</code>
   * @return The restartSeqs.
   */
  @java.lang.Override
  public boolean getRestartSeqs() {
    return restartSeqs_;
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
    for (int i = 0; i < relations_.size(); i++) {
      output.writeMessage(1, relations_.get(i));
    }
    if (restartSeqs_ != false) {
      output.writeBool(2, restartSeqs_);
    }
    if (behavior_ != com.premiumminds.sonar.plpgsql.protobuf.DropBehavior.DROP_BEHAVIOR_UNDEFINED.getNumber()) {
      output.writeEnum(3, behavior_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < relations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, relations_.get(i));
    }
    if (restartSeqs_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, restartSeqs_);
    }
    if (behavior_ != com.premiumminds.sonar.plpgsql.protobuf.DropBehavior.DROP_BEHAVIOR_UNDEFINED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, behavior_);
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
    if (!(obj instanceof com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt other = (com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt) obj;

    if (!getRelationsList()
        .equals(other.getRelationsList())) return false;
    if (getRestartSeqs()
        != other.getRestartSeqs()) return false;
    if (behavior_ != other.behavior_) return false;
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
    if (getRelationsCount() > 0) {
      hash = (37 * hash) + RELATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getRelationsList().hashCode();
    }
    hash = (37 * hash) + RESTART_SEQS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRestartSeqs());
    hash = (37 * hash) + BEHAVIOR_FIELD_NUMBER;
    hash = (53 * hash) + behavior_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt prototype) {
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
   * Protobuf type {@code pg_query.TruncateStmt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.TruncateStmt)
      com.premiumminds.sonar.plpgsql.protobuf.TruncateStmtOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_TruncateStmt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_TruncateStmt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt.class, com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt.Builder.class);
    }

    // Construct using com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt.newBuilder()
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
        getRelationsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (relationsBuilder_ == null) {
        relations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        relationsBuilder_.clear();
      }
      restartSeqs_ = false;

      behavior_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_TruncateStmt_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt getDefaultInstanceForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt build() {
      com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt buildPartial() {
      com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt result = new com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt(this);
      int from_bitField0_ = bitField0_;
      if (relationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          relations_ = java.util.Collections.unmodifiableList(relations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.relations_ = relations_;
      } else {
        result.relations_ = relationsBuilder_.build();
      }
      result.restartSeqs_ = restartSeqs_;
      result.behavior_ = behavior_;
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
      if (other instanceof com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt) {
        return mergeFrom((com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt other) {
      if (other == com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt.getDefaultInstance()) return this;
      if (relationsBuilder_ == null) {
        if (!other.relations_.isEmpty()) {
          if (relations_.isEmpty()) {
            relations_ = other.relations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRelationsIsMutable();
            relations_.addAll(other.relations_);
          }
          onChanged();
        }
      } else {
        if (!other.relations_.isEmpty()) {
          if (relationsBuilder_.isEmpty()) {
            relationsBuilder_.dispose();
            relationsBuilder_ = null;
            relations_ = other.relations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            relationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRelationsFieldBuilder() : null;
          } else {
            relationsBuilder_.addAllMessages(other.relations_);
          }
        }
      }
      if (other.getRestartSeqs() != false) {
        setRestartSeqs(other.getRestartSeqs());
      }
      if (other.behavior_ != 0) {
        setBehaviorValue(other.getBehaviorValue());
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
      com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> relations_ =
      java.util.Collections.emptyList();
    private void ensureRelationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        relations_ = new java.util.ArrayList<com.premiumminds.sonar.plpgsql.protobuf.Node>(relations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> relationsBuilder_;

    /**
     * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
     */
    public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node> getRelationsList() {
      if (relationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(relations_);
      } else {
        return relationsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
     */
    public int getRelationsCount() {
      if (relationsBuilder_ == null) {
        return relations_.size();
      } else {
        return relationsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node getRelations(int index) {
      if (relationsBuilder_ == null) {
        return relations_.get(index);
      } else {
        return relationsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
     */
    public Builder setRelations(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (relationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRelationsIsMutable();
        relations_.set(index, value);
        onChanged();
      } else {
        relationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
     */
    public Builder setRelations(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (relationsBuilder_ == null) {
        ensureRelationsIsMutable();
        relations_.set(index, builderForValue.build());
        onChanged();
      } else {
        relationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
     */
    public Builder addRelations(com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (relationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRelationsIsMutable();
        relations_.add(value);
        onChanged();
      } else {
        relationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
     */
    public Builder addRelations(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (relationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRelationsIsMutable();
        relations_.add(index, value);
        onChanged();
      } else {
        relationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
     */
    public Builder addRelations(
        com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (relationsBuilder_ == null) {
        ensureRelationsIsMutable();
        relations_.add(builderForValue.build());
        onChanged();
      } else {
        relationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
     */
    public Builder addRelations(
        int index, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (relationsBuilder_ == null) {
        ensureRelationsIsMutable();
        relations_.add(index, builderForValue.build());
        onChanged();
      } else {
        relationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
     */
    public Builder addAllRelations(
        java.lang.Iterable<? extends com.premiumminds.sonar.plpgsql.protobuf.Node> values) {
      if (relationsBuilder_ == null) {
        ensureRelationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, relations_);
        onChanged();
      } else {
        relationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
     */
    public Builder clearRelations() {
      if (relationsBuilder_ == null) {
        relations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        relationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
     */
    public Builder removeRelations(int index) {
      if (relationsBuilder_ == null) {
        ensureRelationsIsMutable();
        relations_.remove(index);
        onChanged();
      } else {
        relationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder getRelationsBuilder(
        int index) {
      return getRelationsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getRelationsOrBuilder(
        int index) {
      if (relationsBuilder_ == null) {
        return relations_.get(index);  } else {
        return relationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
     */
    public java.util.List<? extends com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
         getRelationsOrBuilderList() {
      if (relationsBuilder_ != null) {
        return relationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(relations_);
      }
    }
    /**
     * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder addRelationsBuilder() {
      return getRelationsFieldBuilder().addBuilder(
          com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder addRelationsBuilder(
        int index) {
      return getRelationsFieldBuilder().addBuilder(
          index, com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance());
    }
    /**
     * <code>repeated .pg_query.Node relations = 1 [json_name = "relations"];</code>
     */
    public java.util.List<com.premiumminds.sonar.plpgsql.protobuf.Node.Builder> 
         getRelationsBuilderList() {
      return getRelationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
        getRelationsFieldBuilder() {
      if (relationsBuilder_ == null) {
        relationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder>(
                relations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        relations_ = null;
      }
      return relationsBuilder_;
    }

    private boolean restartSeqs_ ;
    /**
     * <code>bool restart_seqs = 2 [json_name = "restart_seqs"];</code>
     * @return The restartSeqs.
     */
    @java.lang.Override
    public boolean getRestartSeqs() {
      return restartSeqs_;
    }
    /**
     * <code>bool restart_seqs = 2 [json_name = "restart_seqs"];</code>
     * @param value The restartSeqs to set.
     * @return This builder for chaining.
     */
    public Builder setRestartSeqs(boolean value) {
      
      restartSeqs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool restart_seqs = 2 [json_name = "restart_seqs"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRestartSeqs() {
      
      restartSeqs_ = false;
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


    // @@protoc_insertion_point(builder_scope:pg_query.TruncateStmt)
  }

  // @@protoc_insertion_point(class_scope:pg_query.TruncateStmt)
  private static final com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt();
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TruncateStmt>
      PARSER = new com.google.protobuf.AbstractParser<TruncateStmt>() {
    @java.lang.Override
    public TruncateStmt parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TruncateStmt(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TruncateStmt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TruncateStmt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.TruncateStmt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

