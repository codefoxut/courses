// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf_examples/protos/date.proto

public final class DateOuterClass {
  private DateOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Date)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 year = 1;</code>
     * @return The year.
     */
    int getYear();

    /**
     * <code>int32 month = 2;</code>
     * @return The month.
     */
    int getMonth();

    /**
     * <code>int32 day = 3;</code>
     * @return The day.
     */
    int getDay();
  }
  /**
   * Protobuf type {@code Date}
   */
  public static final class Date extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Date)
      DateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Date.newBuilder() to construct.
    private Date(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Date() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Date();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Date(
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

              year_ = input.readInt32();
              break;
            }
            case 16: {

              month_ = input.readInt32();
              break;
            }
            case 24: {

              day_ = input.readInt32();
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
      return DateOuterClass.internal_static_Date_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DateOuterClass.internal_static_Date_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DateOuterClass.Date.class, DateOuterClass.Date.Builder.class);
    }

    public static final int YEAR_FIELD_NUMBER = 1;
    private int year_;
    /**
     * <code>int32 year = 1;</code>
     * @return The year.
     */
    @java.lang.Override
    public int getYear() {
      return year_;
    }

    public static final int MONTH_FIELD_NUMBER = 2;
    private int month_;
    /**
     * <code>int32 month = 2;</code>
     * @return The month.
     */
    @java.lang.Override
    public int getMonth() {
      return month_;
    }

    public static final int DAY_FIELD_NUMBER = 3;
    private int day_;
    /**
     * <code>int32 day = 3;</code>
     * @return The day.
     */
    @java.lang.Override
    public int getDay() {
      return day_;
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
      if (year_ != 0) {
        output.writeInt32(1, year_);
      }
      if (month_ != 0) {
        output.writeInt32(2, month_);
      }
      if (day_ != 0) {
        output.writeInt32(3, day_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (year_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, year_);
      }
      if (month_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, month_);
      }
      if (day_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, day_);
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
      if (!(obj instanceof DateOuterClass.Date)) {
        return super.equals(obj);
      }
      DateOuterClass.Date other = (DateOuterClass.Date) obj;

      if (getYear()
          != other.getYear()) return false;
      if (getMonth()
          != other.getMonth()) return false;
      if (getDay()
          != other.getDay()) return false;
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
      hash = (37 * hash) + YEAR_FIELD_NUMBER;
      hash = (53 * hash) + getYear();
      hash = (37 * hash) + MONTH_FIELD_NUMBER;
      hash = (53 * hash) + getMonth();
      hash = (37 * hash) + DAY_FIELD_NUMBER;
      hash = (53 * hash) + getDay();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static DateOuterClass.Date parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DateOuterClass.Date parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DateOuterClass.Date parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DateOuterClass.Date parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DateOuterClass.Date parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DateOuterClass.Date parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DateOuterClass.Date parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static DateOuterClass.Date parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static DateOuterClass.Date parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static DateOuterClass.Date parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static DateOuterClass.Date parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static DateOuterClass.Date parseFrom(
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
    public static Builder newBuilder(DateOuterClass.Date prototype) {
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
     * Protobuf type {@code Date}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Date)
        DateOuterClass.DateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return DateOuterClass.internal_static_Date_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return DateOuterClass.internal_static_Date_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                DateOuterClass.Date.class, DateOuterClass.Date.Builder.class);
      }

      // Construct using DateOuterClass.Date.newBuilder()
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
        year_ = 0;

        month_ = 0;

        day_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return DateOuterClass.internal_static_Date_descriptor;
      }

      @java.lang.Override
      public DateOuterClass.Date getDefaultInstanceForType() {
        return DateOuterClass.Date.getDefaultInstance();
      }

      @java.lang.Override
      public DateOuterClass.Date build() {
        DateOuterClass.Date result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public DateOuterClass.Date buildPartial() {
        DateOuterClass.Date result = new DateOuterClass.Date(this);
        result.year_ = year_;
        result.month_ = month_;
        result.day_ = day_;
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
        if (other instanceof DateOuterClass.Date) {
          return mergeFrom((DateOuterClass.Date)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(DateOuterClass.Date other) {
        if (other == DateOuterClass.Date.getDefaultInstance()) return this;
        if (other.getYear() != 0) {
          setYear(other.getYear());
        }
        if (other.getMonth() != 0) {
          setMonth(other.getMonth());
        }
        if (other.getDay() != 0) {
          setDay(other.getDay());
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
        DateOuterClass.Date parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (DateOuterClass.Date) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int year_ ;
      /**
       * <code>int32 year = 1;</code>
       * @return The year.
       */
      @java.lang.Override
      public int getYear() {
        return year_;
      }
      /**
       * <code>int32 year = 1;</code>
       * @param value The year to set.
       * @return This builder for chaining.
       */
      public Builder setYear(int value) {
        
        year_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 year = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearYear() {
        
        year_ = 0;
        onChanged();
        return this;
      }

      private int month_ ;
      /**
       * <code>int32 month = 2;</code>
       * @return The month.
       */
      @java.lang.Override
      public int getMonth() {
        return month_;
      }
      /**
       * <code>int32 month = 2;</code>
       * @param value The month to set.
       * @return This builder for chaining.
       */
      public Builder setMonth(int value) {
        
        month_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 month = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMonth() {
        
        month_ = 0;
        onChanged();
        return this;
      }

      private int day_ ;
      /**
       * <code>int32 day = 3;</code>
       * @return The day.
       */
      @java.lang.Override
      public int getDay() {
        return day_;
      }
      /**
       * <code>int32 day = 3;</code>
       * @param value The day to set.
       * @return This builder for chaining.
       */
      public Builder setDay(int value) {
        
        day_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 day = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearDay() {
        
        day_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Date)
    }

    // @@protoc_insertion_point(class_scope:Date)
    private static final DateOuterClass.Date DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new DateOuterClass.Date();
    }

    public static DateOuterClass.Date getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Date>
        PARSER = new com.google.protobuf.AbstractParser<Date>() {
      @java.lang.Override
      public Date parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Date(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Date> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Date> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public DateOuterClass.Date getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Date_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Date_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#protobuf_examples/protos/date.proto\"0\n" +
      "\004Date\022\014\n\004year\030\001 \001(\005\022\r\n\005month\030\002 \001(\005\022\013\n\003da" +
      "y\030\003 \001(\005b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Date_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Date_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Date_descriptor,
        new java.lang.String[] { "Year", "Month", "Day", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
