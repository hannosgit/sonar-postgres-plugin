// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

/**
 * Protobuf type {@code pg_query.FieldSelect}
 */
public final class FieldSelect extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.FieldSelect)
    FieldSelectOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FieldSelect.newBuilder() to construct.
  private FieldSelect(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FieldSelect() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FieldSelect();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FieldSelect(
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
            com.premiumminds.sonar.plpgsql.protobuf.Node.Builder subBuilder = null;
            if (xpr_ != null) {
              subBuilder = xpr_.toBuilder();
            }
            xpr_ = input.readMessage(com.premiumminds.sonar.plpgsql.protobuf.Node.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(xpr_);
              xpr_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.premiumminds.sonar.plpgsql.protobuf.Node.Builder subBuilder = null;
            if (arg_ != null) {
              subBuilder = arg_.toBuilder();
            }
            arg_ = input.readMessage(com.premiumminds.sonar.plpgsql.protobuf.Node.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(arg_);
              arg_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            fieldnum_ = input.readInt32();
            break;
          }
          case 32: {

            resulttype_ = input.readUInt32();
            break;
          }
          case 40: {

            resulttypmod_ = input.readInt32();
            break;
          }
          case 48: {

            resultcollid_ = input.readUInt32();
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
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_FieldSelect_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_FieldSelect_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.plpgsql.protobuf.FieldSelect.class, com.premiumminds.sonar.plpgsql.protobuf.FieldSelect.Builder.class);
  }

  public static final int XPR_FIELD_NUMBER = 1;
  private com.premiumminds.sonar.plpgsql.protobuf.Node xpr_;
  /**
   * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
   * @return Whether the xpr field is set.
   */
  @java.lang.Override
  public boolean hasXpr() {
    return xpr_ != null;
  }
  /**
   * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
   * @return The xpr.
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.Node getXpr() {
    return xpr_ == null ? com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance() : xpr_;
  }
  /**
   * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getXprOrBuilder() {
    return getXpr();
  }

  public static final int ARG_FIELD_NUMBER = 2;
  private com.premiumminds.sonar.plpgsql.protobuf.Node arg_;
  /**
   * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
   * @return Whether the arg field is set.
   */
  @java.lang.Override
  public boolean hasArg() {
    return arg_ != null;
  }
  /**
   * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
   * @return The arg.
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.Node getArg() {
    return arg_ == null ? com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance() : arg_;
  }
  /**
   * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getArgOrBuilder() {
    return getArg();
  }

  public static final int FIELDNUM_FIELD_NUMBER = 3;
  private int fieldnum_;
  /**
   * <code>int32 fieldnum = 3 [json_name = "fieldnum"];</code>
   * @return The fieldnum.
   */
  @java.lang.Override
  public int getFieldnum() {
    return fieldnum_;
  }

  public static final int RESULTTYPE_FIELD_NUMBER = 4;
  private int resulttype_;
  /**
   * <code>uint32 resulttype = 4 [json_name = "resulttype"];</code>
   * @return The resulttype.
   */
  @java.lang.Override
  public int getResulttype() {
    return resulttype_;
  }

  public static final int RESULTTYPMOD_FIELD_NUMBER = 5;
  private int resulttypmod_;
  /**
   * <code>int32 resulttypmod = 5 [json_name = "resulttypmod"];</code>
   * @return The resulttypmod.
   */
  @java.lang.Override
  public int getResulttypmod() {
    return resulttypmod_;
  }

  public static final int RESULTCOLLID_FIELD_NUMBER = 6;
  private int resultcollid_;
  /**
   * <code>uint32 resultcollid = 6 [json_name = "resultcollid"];</code>
   * @return The resultcollid.
   */
  @java.lang.Override
  public int getResultcollid() {
    return resultcollid_;
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
    if (xpr_ != null) {
      output.writeMessage(1, getXpr());
    }
    if (arg_ != null) {
      output.writeMessage(2, getArg());
    }
    if (fieldnum_ != 0) {
      output.writeInt32(3, fieldnum_);
    }
    if (resulttype_ != 0) {
      output.writeUInt32(4, resulttype_);
    }
    if (resulttypmod_ != 0) {
      output.writeInt32(5, resulttypmod_);
    }
    if (resultcollid_ != 0) {
      output.writeUInt32(6, resultcollid_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (xpr_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getXpr());
    }
    if (arg_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getArg());
    }
    if (fieldnum_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, fieldnum_);
    }
    if (resulttype_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, resulttype_);
    }
    if (resulttypmod_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, resulttypmod_);
    }
    if (resultcollid_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, resultcollid_);
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
    if (!(obj instanceof com.premiumminds.sonar.plpgsql.protobuf.FieldSelect)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.plpgsql.protobuf.FieldSelect other = (com.premiumminds.sonar.plpgsql.protobuf.FieldSelect) obj;

    if (hasXpr() != other.hasXpr()) return false;
    if (hasXpr()) {
      if (!getXpr()
          .equals(other.getXpr())) return false;
    }
    if (hasArg() != other.hasArg()) return false;
    if (hasArg()) {
      if (!getArg()
          .equals(other.getArg())) return false;
    }
    if (getFieldnum()
        != other.getFieldnum()) return false;
    if (getResulttype()
        != other.getResulttype()) return false;
    if (getResulttypmod()
        != other.getResulttypmod()) return false;
    if (getResultcollid()
        != other.getResultcollid()) return false;
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
    if (hasXpr()) {
      hash = (37 * hash) + XPR_FIELD_NUMBER;
      hash = (53 * hash) + getXpr().hashCode();
    }
    if (hasArg()) {
      hash = (37 * hash) + ARG_FIELD_NUMBER;
      hash = (53 * hash) + getArg().hashCode();
    }
    hash = (37 * hash) + FIELDNUM_FIELD_NUMBER;
    hash = (53 * hash) + getFieldnum();
    hash = (37 * hash) + RESULTTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getResulttype();
    hash = (37 * hash) + RESULTTYPMOD_FIELD_NUMBER;
    hash = (53 * hash) + getResulttypmod();
    hash = (37 * hash) + RESULTCOLLID_FIELD_NUMBER;
    hash = (53 * hash) + getResultcollid();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.FieldSelect parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.FieldSelect parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.FieldSelect parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.FieldSelect parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.FieldSelect parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.FieldSelect parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.FieldSelect parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.FieldSelect parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.FieldSelect parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.FieldSelect parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.FieldSelect parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.FieldSelect parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.plpgsql.protobuf.FieldSelect prototype) {
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
   * Protobuf type {@code pg_query.FieldSelect}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.FieldSelect)
      com.premiumminds.sonar.plpgsql.protobuf.FieldSelectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_FieldSelect_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_FieldSelect_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.plpgsql.protobuf.FieldSelect.class, com.premiumminds.sonar.plpgsql.protobuf.FieldSelect.Builder.class);
    }

    // Construct using com.premiumminds.sonar.plpgsql.protobuf.FieldSelect.newBuilder()
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
      if (xprBuilder_ == null) {
        xpr_ = null;
      } else {
        xpr_ = null;
        xprBuilder_ = null;
      }
      if (argBuilder_ == null) {
        arg_ = null;
      } else {
        arg_ = null;
        argBuilder_ = null;
      }
      fieldnum_ = 0;

      resulttype_ = 0;

      resulttypmod_ = 0;

      resultcollid_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_FieldSelect_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.FieldSelect getDefaultInstanceForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.FieldSelect.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.FieldSelect build() {
      com.premiumminds.sonar.plpgsql.protobuf.FieldSelect result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.FieldSelect buildPartial() {
      com.premiumminds.sonar.plpgsql.protobuf.FieldSelect result = new com.premiumminds.sonar.plpgsql.protobuf.FieldSelect(this);
      if (xprBuilder_ == null) {
        result.xpr_ = xpr_;
      } else {
        result.xpr_ = xprBuilder_.build();
      }
      if (argBuilder_ == null) {
        result.arg_ = arg_;
      } else {
        result.arg_ = argBuilder_.build();
      }
      result.fieldnum_ = fieldnum_;
      result.resulttype_ = resulttype_;
      result.resulttypmod_ = resulttypmod_;
      result.resultcollid_ = resultcollid_;
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
      if (other instanceof com.premiumminds.sonar.plpgsql.protobuf.FieldSelect) {
        return mergeFrom((com.premiumminds.sonar.plpgsql.protobuf.FieldSelect)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.plpgsql.protobuf.FieldSelect other) {
      if (other == com.premiumminds.sonar.plpgsql.protobuf.FieldSelect.getDefaultInstance()) return this;
      if (other.hasXpr()) {
        mergeXpr(other.getXpr());
      }
      if (other.hasArg()) {
        mergeArg(other.getArg());
      }
      if (other.getFieldnum() != 0) {
        setFieldnum(other.getFieldnum());
      }
      if (other.getResulttype() != 0) {
        setResulttype(other.getResulttype());
      }
      if (other.getResulttypmod() != 0) {
        setResulttypmod(other.getResulttypmod());
      }
      if (other.getResultcollid() != 0) {
        setResultcollid(other.getResultcollid());
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
      com.premiumminds.sonar.plpgsql.protobuf.FieldSelect parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.premiumminds.sonar.plpgsql.protobuf.FieldSelect) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.premiumminds.sonar.plpgsql.protobuf.Node xpr_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> xprBuilder_;
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     * @return Whether the xpr field is set.
     */
    public boolean hasXpr() {
      return xprBuilder_ != null || xpr_ != null;
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     * @return The xpr.
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node getXpr() {
      if (xprBuilder_ == null) {
        return xpr_ == null ? com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance() : xpr_;
      } else {
        return xprBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    public Builder setXpr(com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (xprBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        xpr_ = value;
        onChanged();
      } else {
        xprBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    public Builder setXpr(
        com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (xprBuilder_ == null) {
        xpr_ = builderForValue.build();
        onChanged();
      } else {
        xprBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    public Builder mergeXpr(com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (xprBuilder_ == null) {
        if (xpr_ != null) {
          xpr_ =
            com.premiumminds.sonar.plpgsql.protobuf.Node.newBuilder(xpr_).mergeFrom(value).buildPartial();
        } else {
          xpr_ = value;
        }
        onChanged();
      } else {
        xprBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    public Builder clearXpr() {
      if (xprBuilder_ == null) {
        xpr_ = null;
        onChanged();
      } else {
        xpr_ = null;
        xprBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder getXprBuilder() {
      
      onChanged();
      return getXprFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getXprOrBuilder() {
      if (xprBuilder_ != null) {
        return xprBuilder_.getMessageOrBuilder();
      } else {
        return xpr_ == null ?
            com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance() : xpr_;
      }
    }
    /**
     * <code>.pg_query.Node xpr = 1 [json_name = "xpr"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
        getXprFieldBuilder() {
      if (xprBuilder_ == null) {
        xprBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder>(
                getXpr(),
                getParentForChildren(),
                isClean());
        xpr_ = null;
      }
      return xprBuilder_;
    }

    private com.premiumminds.sonar.plpgsql.protobuf.Node arg_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> argBuilder_;
    /**
     * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
     * @return Whether the arg field is set.
     */
    public boolean hasArg() {
      return argBuilder_ != null || arg_ != null;
    }
    /**
     * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
     * @return The arg.
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node getArg() {
      if (argBuilder_ == null) {
        return arg_ == null ? com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance() : arg_;
      } else {
        return argBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
     */
    public Builder setArg(com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (argBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        arg_ = value;
        onChanged();
      } else {
        argBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
     */
    public Builder setArg(
        com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (argBuilder_ == null) {
        arg_ = builderForValue.build();
        onChanged();
      } else {
        argBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
     */
    public Builder mergeArg(com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (argBuilder_ == null) {
        if (arg_ != null) {
          arg_ =
            com.premiumminds.sonar.plpgsql.protobuf.Node.newBuilder(arg_).mergeFrom(value).buildPartial();
        } else {
          arg_ = value;
        }
        onChanged();
      } else {
        argBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
     */
    public Builder clearArg() {
      if (argBuilder_ == null) {
        arg_ = null;
        onChanged();
      } else {
        arg_ = null;
        argBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder getArgBuilder() {
      
      onChanged();
      return getArgFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getArgOrBuilder() {
      if (argBuilder_ != null) {
        return argBuilder_.getMessageOrBuilder();
      } else {
        return arg_ == null ?
            com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance() : arg_;
      }
    }
    /**
     * <code>.pg_query.Node arg = 2 [json_name = "arg"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
        getArgFieldBuilder() {
      if (argBuilder_ == null) {
        argBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder>(
                getArg(),
                getParentForChildren(),
                isClean());
        arg_ = null;
      }
      return argBuilder_;
    }

    private int fieldnum_ ;
    /**
     * <code>int32 fieldnum = 3 [json_name = "fieldnum"];</code>
     * @return The fieldnum.
     */
    @java.lang.Override
    public int getFieldnum() {
      return fieldnum_;
    }
    /**
     * <code>int32 fieldnum = 3 [json_name = "fieldnum"];</code>
     * @param value The fieldnum to set.
     * @return This builder for chaining.
     */
    public Builder setFieldnum(int value) {
      
      fieldnum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 fieldnum = 3 [json_name = "fieldnum"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFieldnum() {
      
      fieldnum_ = 0;
      onChanged();
      return this;
    }

    private int resulttype_ ;
    /**
     * <code>uint32 resulttype = 4 [json_name = "resulttype"];</code>
     * @return The resulttype.
     */
    @java.lang.Override
    public int getResulttype() {
      return resulttype_;
    }
    /**
     * <code>uint32 resulttype = 4 [json_name = "resulttype"];</code>
     * @param value The resulttype to set.
     * @return This builder for chaining.
     */
    public Builder setResulttype(int value) {
      
      resulttype_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 resulttype = 4 [json_name = "resulttype"];</code>
     * @return This builder for chaining.
     */
    public Builder clearResulttype() {
      
      resulttype_ = 0;
      onChanged();
      return this;
    }

    private int resulttypmod_ ;
    /**
     * <code>int32 resulttypmod = 5 [json_name = "resulttypmod"];</code>
     * @return The resulttypmod.
     */
    @java.lang.Override
    public int getResulttypmod() {
      return resulttypmod_;
    }
    /**
     * <code>int32 resulttypmod = 5 [json_name = "resulttypmod"];</code>
     * @param value The resulttypmod to set.
     * @return This builder for chaining.
     */
    public Builder setResulttypmod(int value) {
      
      resulttypmod_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 resulttypmod = 5 [json_name = "resulttypmod"];</code>
     * @return This builder for chaining.
     */
    public Builder clearResulttypmod() {
      
      resulttypmod_ = 0;
      onChanged();
      return this;
    }

    private int resultcollid_ ;
    /**
     * <code>uint32 resultcollid = 6 [json_name = "resultcollid"];</code>
     * @return The resultcollid.
     */
    @java.lang.Override
    public int getResultcollid() {
      return resultcollid_;
    }
    /**
     * <code>uint32 resultcollid = 6 [json_name = "resultcollid"];</code>
     * @param value The resultcollid to set.
     * @return This builder for chaining.
     */
    public Builder setResultcollid(int value) {
      
      resultcollid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 resultcollid = 6 [json_name = "resultcollid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearResultcollid() {
      
      resultcollid_ = 0;
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


    // @@protoc_insertion_point(builder_scope:pg_query.FieldSelect)
  }

  // @@protoc_insertion_point(class_scope:pg_query.FieldSelect)
  private static final com.premiumminds.sonar.plpgsql.protobuf.FieldSelect DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.plpgsql.protobuf.FieldSelect();
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.FieldSelect getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FieldSelect>
      PARSER = new com.google.protobuf.AbstractParser<FieldSelect>() {
    @java.lang.Override
    public FieldSelect parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FieldSelect(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FieldSelect> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FieldSelect> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.FieldSelect getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

