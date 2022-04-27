// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pg_query.proto

package com.premiumminds.sonar.plpgsql.protobuf;

/**
 * Protobuf type {@code pg_query.CaseWhen}
 */
public final class CaseWhen extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pg_query.CaseWhen)
    CaseWhenOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CaseWhen.newBuilder() to construct.
  private CaseWhen(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CaseWhen() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CaseWhen();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CaseWhen(
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
            if (expr_ != null) {
              subBuilder = expr_.toBuilder();
            }
            expr_ = input.readMessage(com.premiumminds.sonar.plpgsql.protobuf.Node.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(expr_);
              expr_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.premiumminds.sonar.plpgsql.protobuf.Node.Builder subBuilder = null;
            if (result_ != null) {
              subBuilder = result_.toBuilder();
            }
            result_ = input.readMessage(com.premiumminds.sonar.plpgsql.protobuf.Node.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(result_);
              result_ = subBuilder.buildPartial();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_CaseWhen_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_CaseWhen_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.premiumminds.sonar.plpgsql.protobuf.CaseWhen.class, com.premiumminds.sonar.plpgsql.protobuf.CaseWhen.Builder.class);
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

  public static final int EXPR_FIELD_NUMBER = 2;
  private com.premiumminds.sonar.plpgsql.protobuf.Node expr_;
  /**
   * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
   * @return Whether the expr field is set.
   */
  @java.lang.Override
  public boolean hasExpr() {
    return expr_ != null;
  }
  /**
   * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
   * @return The expr.
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.Node getExpr() {
    return expr_ == null ? com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance() : expr_;
  }
  /**
   * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getExprOrBuilder() {
    return getExpr();
  }

  public static final int RESULT_FIELD_NUMBER = 3;
  private com.premiumminds.sonar.plpgsql.protobuf.Node result_;
  /**
   * <code>.pg_query.Node result = 3 [json_name = "result"];</code>
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return result_ != null;
  }
  /**
   * <code>.pg_query.Node result = 3 [json_name = "result"];</code>
   * @return The result.
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.Node getResult() {
    return result_ == null ? com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance() : result_;
  }
  /**
   * <code>.pg_query.Node result = 3 [json_name = "result"];</code>
   */
  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getResultOrBuilder() {
    return getResult();
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
    if (xpr_ != null) {
      output.writeMessage(1, getXpr());
    }
    if (expr_ != null) {
      output.writeMessage(2, getExpr());
    }
    if (result_ != null) {
      output.writeMessage(3, getResult());
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
    if (xpr_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getXpr());
    }
    if (expr_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getExpr());
    }
    if (result_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getResult());
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
    if (!(obj instanceof com.premiumminds.sonar.plpgsql.protobuf.CaseWhen)) {
      return super.equals(obj);
    }
    com.premiumminds.sonar.plpgsql.protobuf.CaseWhen other = (com.premiumminds.sonar.plpgsql.protobuf.CaseWhen) obj;

    if (hasXpr() != other.hasXpr()) return false;
    if (hasXpr()) {
      if (!getXpr()
          .equals(other.getXpr())) return false;
    }
    if (hasExpr() != other.hasExpr()) return false;
    if (hasExpr()) {
      if (!getExpr()
          .equals(other.getExpr())) return false;
    }
    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult()
          .equals(other.getResult())) return false;
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
    if (hasXpr()) {
      hash = (37 * hash) + XPR_FIELD_NUMBER;
      hash = (53 * hash) + getXpr().hashCode();
    }
    if (hasExpr()) {
      hash = (37 * hash) + EXPR_FIELD_NUMBER;
      hash = (53 * hash) + getExpr().hashCode();
    }
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.CaseWhen parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CaseWhen parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CaseWhen parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CaseWhen parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CaseWhen parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CaseWhen parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CaseWhen parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CaseWhen parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CaseWhen parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CaseWhen parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CaseWhen parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.premiumminds.sonar.plpgsql.protobuf.CaseWhen parseFrom(
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
  public static Builder newBuilder(com.premiumminds.sonar.plpgsql.protobuf.CaseWhen prototype) {
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
   * Protobuf type {@code pg_query.CaseWhen}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pg_query.CaseWhen)
      com.premiumminds.sonar.plpgsql.protobuf.CaseWhenOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_CaseWhen_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_CaseWhen_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.premiumminds.sonar.plpgsql.protobuf.CaseWhen.class, com.premiumminds.sonar.plpgsql.protobuf.CaseWhen.Builder.class);
    }

    // Construct using com.premiumminds.sonar.plpgsql.protobuf.CaseWhen.newBuilder()
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
      if (exprBuilder_ == null) {
        expr_ = null;
      } else {
        expr_ = null;
        exprBuilder_ = null;
      }
      if (resultBuilder_ == null) {
        result_ = null;
      } else {
        result_ = null;
        resultBuilder_ = null;
      }
      location_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.PgQuery.internal_static_pg_query_CaseWhen_descriptor;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.CaseWhen getDefaultInstanceForType() {
      return com.premiumminds.sonar.plpgsql.protobuf.CaseWhen.getDefaultInstance();
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.CaseWhen build() {
      com.premiumminds.sonar.plpgsql.protobuf.CaseWhen result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.premiumminds.sonar.plpgsql.protobuf.CaseWhen buildPartial() {
      com.premiumminds.sonar.plpgsql.protobuf.CaseWhen result = new com.premiumminds.sonar.plpgsql.protobuf.CaseWhen(this);
      if (xprBuilder_ == null) {
        result.xpr_ = xpr_;
      } else {
        result.xpr_ = xprBuilder_.build();
      }
      if (exprBuilder_ == null) {
        result.expr_ = expr_;
      } else {
        result.expr_ = exprBuilder_.build();
      }
      if (resultBuilder_ == null) {
        result.result_ = result_;
      } else {
        result.result_ = resultBuilder_.build();
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
      if (other instanceof com.premiumminds.sonar.plpgsql.protobuf.CaseWhen) {
        return mergeFrom((com.premiumminds.sonar.plpgsql.protobuf.CaseWhen)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.premiumminds.sonar.plpgsql.protobuf.CaseWhen other) {
      if (other == com.premiumminds.sonar.plpgsql.protobuf.CaseWhen.getDefaultInstance()) return this;
      if (other.hasXpr()) {
        mergeXpr(other.getXpr());
      }
      if (other.hasExpr()) {
        mergeExpr(other.getExpr());
      }
      if (other.hasResult()) {
        mergeResult(other.getResult());
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
      com.premiumminds.sonar.plpgsql.protobuf.CaseWhen parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.premiumminds.sonar.plpgsql.protobuf.CaseWhen) e.getUnfinishedMessage();
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

    private com.premiumminds.sonar.plpgsql.protobuf.Node expr_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> exprBuilder_;
    /**
     * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
     * @return Whether the expr field is set.
     */
    public boolean hasExpr() {
      return exprBuilder_ != null || expr_ != null;
    }
    /**
     * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
     * @return The expr.
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node getExpr() {
      if (exprBuilder_ == null) {
        return expr_ == null ? com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance() : expr_;
      } else {
        return exprBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
     */
    public Builder setExpr(com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (exprBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expr_ = value;
        onChanged();
      } else {
        exprBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
     */
    public Builder setExpr(
        com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (exprBuilder_ == null) {
        expr_ = builderForValue.build();
        onChanged();
      } else {
        exprBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
     */
    public Builder mergeExpr(com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (exprBuilder_ == null) {
        if (expr_ != null) {
          expr_ =
            com.premiumminds.sonar.plpgsql.protobuf.Node.newBuilder(expr_).mergeFrom(value).buildPartial();
        } else {
          expr_ = value;
        }
        onChanged();
      } else {
        exprBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
     */
    public Builder clearExpr() {
      if (exprBuilder_ == null) {
        expr_ = null;
        onChanged();
      } else {
        expr_ = null;
        exprBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder getExprBuilder() {
      
      onChanged();
      return getExprFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getExprOrBuilder() {
      if (exprBuilder_ != null) {
        return exprBuilder_.getMessageOrBuilder();
      } else {
        return expr_ == null ?
            com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance() : expr_;
      }
    }
    /**
     * <code>.pg_query.Node expr = 2 [json_name = "expr"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
        getExprFieldBuilder() {
      if (exprBuilder_ == null) {
        exprBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder>(
                getExpr(),
                getParentForChildren(),
                isClean());
        expr_ = null;
      }
      return exprBuilder_;
    }

    private com.premiumminds.sonar.plpgsql.protobuf.Node result_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> resultBuilder_;
    /**
     * <code>.pg_query.Node result = 3 [json_name = "result"];</code>
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return resultBuilder_ != null || result_ != null;
    }
    /**
     * <code>.pg_query.Node result = 3 [json_name = "result"];</code>
     * @return The result.
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <code>.pg_query.Node result = 3 [json_name = "result"];</code>
     */
    public Builder setResult(com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        resultBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.Node result = 3 [json_name = "result"];</code>
     */
    public Builder setResult(
        com.premiumminds.sonar.plpgsql.protobuf.Node.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pg_query.Node result = 3 [json_name = "result"];</code>
     */
    public Builder mergeResult(com.premiumminds.sonar.plpgsql.protobuf.Node value) {
      if (resultBuilder_ == null) {
        if (result_ != null) {
          result_ =
            com.premiumminds.sonar.plpgsql.protobuf.Node.newBuilder(result_).mergeFrom(value).buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        resultBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pg_query.Node result = 3 [json_name = "result"];</code>
     */
    public Builder clearResult() {
      if (resultBuilder_ == null) {
        result_ = null;
        onChanged();
      } else {
        result_ = null;
        resultBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pg_query.Node result = 3 [json_name = "result"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.Node.Builder getResultBuilder() {
      
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <code>.pg_query.Node result = 3 [json_name = "result"];</code>
     */
    public com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            com.premiumminds.sonar.plpgsql.protobuf.Node.getDefaultInstance() : result_;
      }
    }
    /**
     * <code>.pg_query.Node result = 3 [json_name = "result"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.premiumminds.sonar.plpgsql.protobuf.Node, com.premiumminds.sonar.plpgsql.protobuf.Node.Builder, com.premiumminds.sonar.plpgsql.protobuf.NodeOrBuilder>(
                getResult(),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pg_query.CaseWhen)
  }

  // @@protoc_insertion_point(class_scope:pg_query.CaseWhen)
  private static final com.premiumminds.sonar.plpgsql.protobuf.CaseWhen DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.premiumminds.sonar.plpgsql.protobuf.CaseWhen();
  }

  public static com.premiumminds.sonar.plpgsql.protobuf.CaseWhen getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CaseWhen>
      PARSER = new com.google.protobuf.AbstractParser<CaseWhen>() {
    @java.lang.Override
    public CaseWhen parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CaseWhen(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CaseWhen> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CaseWhen> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.premiumminds.sonar.plpgsql.protobuf.CaseWhen getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

