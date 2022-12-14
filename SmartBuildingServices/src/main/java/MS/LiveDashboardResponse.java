// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MS.proto

package MS;

/**
 * Protobuf type {@code MonitoringSystem.LiveDashboardResponse}
 */
public  final class LiveDashboardResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:MonitoringSystem.LiveDashboardResponse)
    LiveDashboardResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LiveDashboardResponse.newBuilder() to construct.
  private LiveDashboardResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LiveDashboardResponse() {
    val2_ = "";
    temp2_ = 0;
    occupant2_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LiveDashboardResponse(
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

            val2_ = s;
            break;
          }
          case 16: {

            temp2_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            occupant2_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
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
    return MS.MSServiceImpl.internal_static_MonitoringSystem_LiveDashboardResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return MS.MSServiceImpl.internal_static_MonitoringSystem_LiveDashboardResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            MS.LiveDashboardResponse.class, MS.LiveDashboardResponse.Builder.class);
  }

  public static final int VAL2_FIELD_NUMBER = 1;
  private volatile java.lang.Object val2_;
  /**
   * <code>string val2 = 1;</code>
   */
  public java.lang.String getVal2() {
    java.lang.Object ref = val2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      val2_ = s;
      return s;
    }
  }
  /**
   * <code>string val2 = 1;</code>
   */
  public com.google.protobuf.ByteString
      getVal2Bytes() {
    java.lang.Object ref = val2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      val2_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEMP2_FIELD_NUMBER = 2;
  private int temp2_;
  /**
   * <code>int32 temp2 = 2;</code>
   */
  public int getTemp2() {
    return temp2_;
  }

  public static final int OCCUPANT2_FIELD_NUMBER = 3;
  private volatile java.lang.Object occupant2_;
  /**
   * <code>string occupant2 = 3;</code>
   */
  public java.lang.String getOccupant2() {
    java.lang.Object ref = occupant2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      occupant2_ = s;
      return s;
    }
  }
  /**
   * <code>string occupant2 = 3;</code>
   */
  public com.google.protobuf.ByteString
      getOccupant2Bytes() {
    java.lang.Object ref = occupant2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      occupant2_ = b;
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
    if (!getVal2Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, val2_);
    }
    if (temp2_ != 0) {
      output.writeInt32(2, temp2_);
    }
    if (!getOccupant2Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, occupant2_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getVal2Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, val2_);
    }
    if (temp2_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, temp2_);
    }
    if (!getOccupant2Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, occupant2_);
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
    if (!(obj instanceof MS.LiveDashboardResponse)) {
      return super.equals(obj);
    }
    MS.LiveDashboardResponse other = (MS.LiveDashboardResponse) obj;

    boolean result = true;
    result = result && getVal2()
        .equals(other.getVal2());
    result = result && (getTemp2()
        == other.getTemp2());
    result = result && getOccupant2()
        .equals(other.getOccupant2());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + VAL2_FIELD_NUMBER;
    hash = (53 * hash) + getVal2().hashCode();
    hash = (37 * hash) + TEMP2_FIELD_NUMBER;
    hash = (53 * hash) + getTemp2();
    hash = (37 * hash) + OCCUPANT2_FIELD_NUMBER;
    hash = (53 * hash) + getOccupant2().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static MS.LiveDashboardResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MS.LiveDashboardResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MS.LiveDashboardResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MS.LiveDashboardResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MS.LiveDashboardResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MS.LiveDashboardResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MS.LiveDashboardResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MS.LiveDashboardResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static MS.LiveDashboardResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static MS.LiveDashboardResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static MS.LiveDashboardResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MS.LiveDashboardResponse parseFrom(
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
  public static Builder newBuilder(MS.LiveDashboardResponse prototype) {
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
   * Protobuf type {@code MonitoringSystem.LiveDashboardResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:MonitoringSystem.LiveDashboardResponse)
      MS.LiveDashboardResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MS.MSServiceImpl.internal_static_MonitoringSystem_LiveDashboardResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MS.MSServiceImpl.internal_static_MonitoringSystem_LiveDashboardResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MS.LiveDashboardResponse.class, MS.LiveDashboardResponse.Builder.class);
    }

    // Construct using MS.LiveDashboardResponse.newBuilder()
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
      val2_ = "";

      temp2_ = 0;

      occupant2_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return MS.MSServiceImpl.internal_static_MonitoringSystem_LiveDashboardResponse_descriptor;
    }

    @java.lang.Override
    public MS.LiveDashboardResponse getDefaultInstanceForType() {
      return MS.LiveDashboardResponse.getDefaultInstance();
    }

    @java.lang.Override
    public MS.LiveDashboardResponse build() {
      MS.LiveDashboardResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public MS.LiveDashboardResponse buildPartial() {
      MS.LiveDashboardResponse result = new MS.LiveDashboardResponse(this);
      result.val2_ = val2_;
      result.temp2_ = temp2_;
      result.occupant2_ = occupant2_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof MS.LiveDashboardResponse) {
        return mergeFrom((MS.LiveDashboardResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(MS.LiveDashboardResponse other) {
      if (other == MS.LiveDashboardResponse.getDefaultInstance()) return this;
      if (!other.getVal2().isEmpty()) {
        val2_ = other.val2_;
        onChanged();
      }
      if (other.getTemp2() != 0) {
        setTemp2(other.getTemp2());
      }
      if (!other.getOccupant2().isEmpty()) {
        occupant2_ = other.occupant2_;
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
      MS.LiveDashboardResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (MS.LiveDashboardResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object val2_ = "";
    /**
     * <code>string val2 = 1;</code>
     */
    public java.lang.String getVal2() {
      java.lang.Object ref = val2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        val2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string val2 = 1;</code>
     */
    public com.google.protobuf.ByteString
        getVal2Bytes() {
      java.lang.Object ref = val2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        val2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string val2 = 1;</code>
     */
    public Builder setVal2(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      val2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string val2 = 1;</code>
     */
    public Builder clearVal2() {
      
      val2_ = getDefaultInstance().getVal2();
      onChanged();
      return this;
    }
    /**
     * <code>string val2 = 1;</code>
     */
    public Builder setVal2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      val2_ = value;
      onChanged();
      return this;
    }

    private int temp2_ ;
    /**
     * <code>int32 temp2 = 2;</code>
     */
    public int getTemp2() {
      return temp2_;
    }
    /**
     * <code>int32 temp2 = 2;</code>
     */
    public Builder setTemp2(int value) {
      
      temp2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 temp2 = 2;</code>
     */
    public Builder clearTemp2() {
      
      temp2_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object occupant2_ = "";
    /**
     * <code>string occupant2 = 3;</code>
     */
    public java.lang.String getOccupant2() {
      java.lang.Object ref = occupant2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        occupant2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string occupant2 = 3;</code>
     */
    public com.google.protobuf.ByteString
        getOccupant2Bytes() {
      java.lang.Object ref = occupant2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        occupant2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string occupant2 = 3;</code>
     */
    public Builder setOccupant2(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      occupant2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string occupant2 = 3;</code>
     */
    public Builder clearOccupant2() {
      
      occupant2_ = getDefaultInstance().getOccupant2();
      onChanged();
      return this;
    }
    /**
     * <code>string occupant2 = 3;</code>
     */
    public Builder setOccupant2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      occupant2_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:MonitoringSystem.LiveDashboardResponse)
  }

  // @@protoc_insertion_point(class_scope:MonitoringSystem.LiveDashboardResponse)
  private static final MS.LiveDashboardResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new MS.LiveDashboardResponse();
  }

  public static MS.LiveDashboardResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LiveDashboardResponse>
      PARSER = new com.google.protobuf.AbstractParser<LiveDashboardResponse>() {
    @java.lang.Override
    public LiveDashboardResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LiveDashboardResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LiveDashboardResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LiveDashboardResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public MS.LiveDashboardResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

