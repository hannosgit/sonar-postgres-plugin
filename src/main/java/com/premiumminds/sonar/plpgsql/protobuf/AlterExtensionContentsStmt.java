// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

/**
 * Protobuf type {@code pg_query.AlterExtensionContentsStmt}
 */
public final class AlterExtensionContentsStmt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.AlterExtensionContentsStmt)
    AlterExtensionContentsStmtOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlterExtensionContentsStmt.newBuilder() to construct.
  private AlterExtensionContentsStmt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlterExtensionContentsStmt() {
    extname_ = "";
    objtype_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AlterExtensionContentsStmt();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AlterExtensionContentsStmt(
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

            extname_ = s;
            break;
          }
          case 16: {

            action_ = input.readInt32();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            objtype_ = rawValue;
            break;
          }
          case 34: {
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
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_AlterExtensionContentsStmt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_AlterExtensionContentsStmt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt.class, com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt.Builder.class);
  }

  public static final int EXTNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object extname_;
  /**
   * <code>string extname = 1 [json_name = "extname"];</code>
   * @return The extname.
   */
  @java.lang.Override
  public java.lang.String getExtname() {
    java.lang.Object ref = extname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      extname_ = s;
      return s;
    }
  }
  /**
   * <code>string extname = 1 [json_name = "extname"];</code>
   * @return The bytes for extname.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExtnameBytes() {
    java.lang.Object ref = extname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      extname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTION_FIELD_NUMBER = 2;
  private int action_;
  /**
   * <code>int32 action = 2 [json_name = "action"];</code>
   * @return The action.
   */
  @java.lang.Override
  public int getAction() {
    return action_;
  }

  public static final int OBJTYPE_FIELD_NUMBER = 3;
  private int objtype_;
  /**
   * <code>.pg_query.ObjectType objtype = 3 [json_name = "objtype"];</code>
   * @return The enum numeric value on the wire for objtype.
   */
  @java.lang.Override public int getObjtypeValue() {
    return objtype_;
  }
  /**
   * <code>.pg_query.ObjectType objtype = 3 [json_name = "objtype"];</code>
   * @return The objtype.
   */
  @java.lang.Override public com.premiumminds.sonar.plpgsql.protobuf.ObjectType getObjtype() {
    @SuppressWarnings("deprecation")
    com.premiumminds.sonar.plpgsql.protobuf.ObjectType result = com.premiumminds.sonar.plpgsql.protobuf.ObjectType.valueOf(objtype_);
    return result == null ? com.premiumminds.sonar.plpgsql.protobuf.ObjectType.UNRECOGNIZED : result;
  }

  public static final int OBJECT_FIELD_NUMBER = 4;
  private com.premiumminds.sonar.plpgsql.protobuf.Node object_;
  /**
   * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
   * @return Whether the object field is set.
   */
  @java.lang.Override
  public boolean hasObject() {
    return object_ != null;
  }
  /**
   * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
   * @return The object.
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.Node getObject() {
    return object_ == null ? com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance() : object_;
  }
  /**
   * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getObjectOrBuilder() {
    return getObject();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(extname_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, extname_);
    }
    if (action_ != 0) {
      output.writeInt32(2, action_);
    }
    if (objtype_ != com.premiumminds.sonar.plpgsql.protobuf.ObjectType.OBJECT_TYPE_UNDEFINED.getNumber()) {
      output.writeEnum(3, objtype_);
    }
    if (object_ != null) {
      output.writeMessage(4, getObject());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(extname_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, extname_);
    }
    if (action_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, action_);
    }
    if (objtype_ != com.premiumminds.sonar.plpgsql.protobuf.ObjectType.OBJECT_TYPE_UNDEFINED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, objtype_);
    }
    if (object_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getObject());
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
    if (!(obj instanceof com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt other = (com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt) obj;

    if (!getExtname()
        .equals(other.getExtname())) return false;
    if (getAction()
        != other.getAction()) return false;
    if (objtype_ != other.objtype_) return false;
    if (hasObject() != other.hasObject()) return false;
    if (hasObject()) {
      if (!getObject()
          .equals(other.getObject())) return false;
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
    hash = (37 * hash) + EXTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getExtname().hashCode();
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + getAction();
    hash = (37 * hash) + OBJTYPE_FIELD_NUMBER;
    hash = (53 * hash) + objtype_;
    if (hasObject()) {
      hash = (37 * hash) + OBJECT_FIELD_NUMBER;
      hash = (53 * hash) + getObject().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt prototype) {
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
   * Protobuf type {@code pg_query.AlterExtensionContentsStmt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.AlterExtensionContentsStmt)
      com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmtOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_AlterExtensionContentsStmt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_AlterExtensionContentsStmt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt.class, com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt.Builder.class);
    }

    // Construct using com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt.newBuilder()
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
      extname_ = "";

      action_ = 0;

      objtype_ = 0;

      if (objectBuilder_ == null) {
        object_ = null;
      } else {
        object_ = null;
        objectBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_AlterExtensionContentsStmt_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt getDefaultInstanceForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt build() {
      com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt buildPartial() {
      com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt result = new com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt(this);
      result.extname_ = extname_;
      result.action_ = action_;
      result.objtype_ = objtype_;
      if (objectBuilder_ == null) {
        result.object_ = object_;
      } else {
        result.object_ = objectBuilder_.build();
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
      if (other instanceof com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt) {
        return mergeFrom((com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt other) {
      if (other == com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt.getDefaultInstance()) return this;
      if (!other.getExtname().isEmpty()) {
        extname_ = other.extname_;
        onChanged();
      }
      if (other.getAction() != 0) {
        setAction(other.getAction());
      }
      if (other.objtype_ != 0) {
        setObjtypeValue(other.getObjtypeValue());
      }
      if (other.hasObject()) {
        mergeObject(other.getObject());
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
      com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object extname_ = "";
    /**
     * <code>string extname = 1 [json_name = "extname"];</code>
     * @return The extname.
     */
    public java.lang.String getExtname() {
      java.lang.Object ref = extname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        extname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string extname = 1 [json_name = "extname"];</code>
     * @return The bytes for extname.
     */
    public com.google.protobuf.ByteString
        getExtnameBytes() {
      java.lang.Object ref = extname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        extname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string extname = 1 [json_name = "extname"];</code>
     * @param value The extname to set.
     * @return This builder for chaining.
     */
    public Builder setExtname(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      extname_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string extname = 1 [json_name = "extname"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExtname() {
      
      extname_ = getDefaultInstance().getExtname();
      onChanged();
      return this;
    }
    /**
     * <code>string extname = 1 [json_name = "extname"];</code>
     * @param value The bytes for extname to set.
     * @return This builder for chaining.
     */
    public Builder setExtnameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      extname_ = value;
      onChanged();
      return this;
    }

    private int action_ ;
    /**
     * <code>int32 action = 2 [json_name = "action"];</code>
     * @return The action.
     */
    @java.lang.Override
    public int getAction() {
      return action_;
    }
    /**
     * <code>int32 action = 2 [json_name = "action"];</code>
     * @param value The action to set.
     * @return This builder for chaining.
     */
    public Builder setAction(int value) {
      
      action_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 action = 2 [json_name = "action"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAction() {
      
      action_ = 0;
      onChanged();
      return this;
    }

    private int objtype_ = 0;
    /**
     * <code>.pg_query.ObjectType objtype = 3 [json_name = "objtype"];</code>
     * @return The enum numeric value on the wire for objtype.
     */
    @java.lang.Override public int getObjtypeValue() {
      return objtype_;
    }
    /**
     * <code>.pg_query.ObjectType objtype = 3 [json_name = "objtype"];</code>
     * @param value The enum numeric value on the wire for objtype to set.
     * @return This builder for chaining.
     */
    public Builder setObjtypeValue(int value) {
      
      objtype_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.ObjectType objtype = 3 [json_name = "objtype"];</code>
     * @return The objtype.
     */
    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.ObjectType getObjtype() {
      @SuppressWarnings("deprecation")
      com.premiumminds.sonar.plpgsql.protobuf.ObjectType result = com.premiumminds.sonar.plpgsql.protobuf.ObjectType.valueOf(objtype_);
      return result == null ? com.premiumminds.sonar.plpgsql.protobuf.ObjectType.UNRECOGNIZED : result;
    }
    /**
     * <code>.pg_query.ObjectType objtype = 3 [json_name = "objtype"];</code>
     * @param value The objtype to set.
     * @return This builder for chaining.
     */
    public Builder setObjtype(com.premiumminds.sonar.plpgsql.protobuf.ObjectType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      objtype_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.pg_query.ObjectType objtype = 3 [json_name = "objtype"];</code>
     * @return This builder for chaining.
     */
    public Builder clearObjtype() {
      
      objtype_ = 0;
      onChanged();
      return this;
    }

    private com.premiumminds.sonar.plpgsql.protobuf.Node object_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> objectBuilder_;
    /**
     * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
     * @return Whether the object field is set.
     */
    public boolean hasObject() {
      return objectBuilder_ != null || object_ != null;
    }
    /**
     * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
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
     * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
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
     * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
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
     * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
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
     * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
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
     * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder getObjectBuilder() {
      
      onChanged();
      return getObjectFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
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
     * <code>.pg_query.Node object = 4 [json_name = "object"];</code>
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


    // @@protoc_insertion_point(builder_scope:pg_query.AlterExtensionContentsStmt)
  }

  // @@protoc_insertion_point(class_scope:pg_query.AlterExtensionContentsStmt)
  private static final com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt();
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlterExtensionContentsStmt>
      PARSER = new com.google.protobuf.AbstractParser<AlterExtensionContentsStmt>() {
    @java.lang.Override
    public AlterExtensionContentsStmt parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AlterExtensionContentsStmt(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AlterExtensionContentsStmt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlterExtensionContentsStmt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.AlterExtensionContentsStmt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

