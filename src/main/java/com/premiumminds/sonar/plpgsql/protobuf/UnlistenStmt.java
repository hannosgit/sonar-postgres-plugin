// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

/**
 * Protobuf type {@code pg_query.UnlistenStmt}
 */
public final class UnlistenStmt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.UnlistenStmt)
    UnlistenStmtOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UnlistenStmt.newBuilder() to construct.
  private UnlistenStmt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UnlistenStmt() {
    conditionname_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UnlistenStmt();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UnlistenStmt(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            conditionname_ = s;
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
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_UnlistenStmt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_UnlistenStmt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt.class, com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt.Builder.class);
  }

  public static final int CONDITIONNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object conditionname_;
  /**
   * <code>string conditionname = 1 [json_name = "conditionname"];</code>
   * @return The conditionname.
   */
  @java.lang.Override
  public java.lang.String getConditionname() {
    java.lang.Object ref = conditionname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      conditionname_ = s;
      return s;
    }
  }
  /**
   * <code>string conditionname = 1 [json_name = "conditionname"];</code>
   * @return The bytes for conditionname.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConditionnameBytes() {
    java.lang.Object ref = conditionname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      conditionname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(conditionname_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, conditionname_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(conditionname_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, conditionname_);
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
    if (!(obj instanceof com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt other = (com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt) obj;

    if (!getConditionname()
        .equals(other.getConditionname())) return false;
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
    hash = (37 * hash) + CONDITIONNAME_FIELD_NUMBER;
    hash = (53 * hash) + getConditionname().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt prototype) {
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
   * Protobuf type {@code pg_query.UnlistenStmt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.UnlistenStmt)
      com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmtOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_UnlistenStmt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_UnlistenStmt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt.class, com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt.Builder.class);
    }

    // Construct using com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt.newBuilder()
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
      conditionname_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_UnlistenStmt_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt getDefaultInstanceForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt build() {
      com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt buildPartial() {
      com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt result = new com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt(this);
      result.conditionname_ = conditionname_;
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
      if (other instanceof com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt) {
        return mergeFrom((com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt other) {
      if (other == com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt.getDefaultInstance()) return this;
      if (!other.getConditionname().isEmpty()) {
        conditionname_ = other.conditionname_;
        onChanged();
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
      com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object conditionname_ = "";
    /**
     * <code>string conditionname = 1 [json_name = "conditionname"];</code>
     * @return The conditionname.
     */
    public java.lang.String getConditionname() {
      java.lang.Object ref = conditionname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        conditionname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string conditionname = 1 [json_name = "conditionname"];</code>
     * @return The bytes for conditionname.
     */
    public com.google.protobuf.ByteString
        getConditionnameBytes() {
      java.lang.Object ref = conditionname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        conditionname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string conditionname = 1 [json_name = "conditionname"];</code>
     * @param value The conditionname to set.
     * @return This builder for chaining.
     */
    public Builder setConditionname(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      conditionname_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string conditionname = 1 [json_name = "conditionname"];</code>
     * @return This builder for chaining.
     */
    public Builder clearConditionname() {
      
      conditionname_ = getDefaultInstance().getConditionname();
      onChanged();
      return this;
    }
    /**
     * <code>string conditionname = 1 [json_name = "conditionname"];</code>
     * @param value The bytes for conditionname to set.
     * @return This builder for chaining.
     */
    public Builder setConditionnameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      conditionname_ = value;
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


    // @@protoc_insertion_point(builder_scope:pg_query.UnlistenStmt)
  }

  // @@protoc_insertion_point(class_scope:pg_query.UnlistenStmt)
  private static final com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt();
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UnlistenStmt>
      PARSER = new com.google.protobuf.AbstractParser<UnlistenStmt>() {
    @java.lang.Override
    public UnlistenStmt parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UnlistenStmt(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UnlistenStmt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UnlistenStmt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.UnlistenStmt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

