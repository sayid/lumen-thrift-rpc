/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cecd.sdk.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-04-27")
public class ResponseData implements org.apache.thrift.TBase<ResponseData, ResponseData._Fields>, java.io.Serializable, Cloneable, Comparable<ResponseData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ResponseData");

  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField MSG_FIELD_DESC = new org.apache.thrift.protocol.TField("msg", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DEBUG_FIELD_DESC = new org.apache.thrift.protocol.TField("debug", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField EX_FIELD_DESC = new org.apache.thrift.protocol.TField("ex", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ResponseDataStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ResponseDataTupleSchemeFactory();

  public int code; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String data; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String msg; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String debug; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String ex; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CODE((short)1, "code"),
    DATA((short)2, "data"),
    MSG((short)3, "msg"),
    DEBUG((short)4, "debug"),
    EX((short)5, "ex");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CODE
          return CODE;
        case 2: // DATA
          return DATA;
        case 3: // MSG
          return MSG;
        case 4: // DEBUG
          return DEBUG;
        case 5: // EX
          return EX;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CODE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.DATA,_Fields.MSG,_Fields.DEBUG,_Fields.EX};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MSG, new org.apache.thrift.meta_data.FieldMetaData("msg", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DEBUG, new org.apache.thrift.meta_data.FieldMetaData("debug", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EX, new org.apache.thrift.meta_data.FieldMetaData("ex", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ResponseData.class, metaDataMap);
  }

  public ResponseData() {
  }

  public ResponseData(
    int code)
  {
    this();
    this.code = code;
    setCodeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ResponseData(ResponseData other) {
    __isset_bitfield = other.__isset_bitfield;
    this.code = other.code;
    if (other.isSetData()) {
      this.data = other.data;
    }
    if (other.isSetMsg()) {
      this.msg = other.msg;
    }
    if (other.isSetDebug()) {
      this.debug = other.debug;
    }
    if (other.isSetEx()) {
      this.ex = other.ex;
    }
  }

  public ResponseData deepCopy() {
    return new ResponseData(this);
  }

  @Override
  public void clear() {
    setCodeIsSet(false);
    this.code = 0;
    this.data = null;
    this.msg = null;
    this.debug = null;
    this.ex = null;
  }

  public int getCode() {
    return this.code;
  }

  public ResponseData setCode(int code) {
    this.code = code;
    setCodeIsSet(true);
    return this;
  }

  public void unsetCode() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CODE_ISSET_ID);
  }

  /** Returns true if field code is set (has been assigned a value) and false otherwise */
  public boolean isSetCode() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CODE_ISSET_ID);
  }

  public void setCodeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CODE_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getData() {
    return this.data;
  }

  public ResponseData setData(@org.apache.thrift.annotation.Nullable java.lang.String data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getMsg() {
    return this.msg;
  }

  public ResponseData setMsg(@org.apache.thrift.annotation.Nullable java.lang.String msg) {
    this.msg = msg;
    return this;
  }

  public void unsetMsg() {
    this.msg = null;
  }

  /** Returns true if field msg is set (has been assigned a value) and false otherwise */
  public boolean isSetMsg() {
    return this.msg != null;
  }

  public void setMsgIsSet(boolean value) {
    if (!value) {
      this.msg = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDebug() {
    return this.debug;
  }

  public ResponseData setDebug(@org.apache.thrift.annotation.Nullable java.lang.String debug) {
    this.debug = debug;
    return this;
  }

  public void unsetDebug() {
    this.debug = null;
  }

  /** Returns true if field debug is set (has been assigned a value) and false otherwise */
  public boolean isSetDebug() {
    return this.debug != null;
  }

  public void setDebugIsSet(boolean value) {
    if (!value) {
      this.debug = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getEx() {
    return this.ex;
  }

  public ResponseData setEx(@org.apache.thrift.annotation.Nullable java.lang.String ex) {
    this.ex = ex;
    return this;
  }

  public void unsetEx() {
    this.ex = null;
  }

  /** Returns true if field ex is set (has been assigned a value) and false otherwise */
  public boolean isSetEx() {
    return this.ex != null;
  }

  public void setExIsSet(boolean value) {
    if (!value) {
      this.ex = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((java.lang.Integer)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((java.lang.String)value);
      }
      break;

    case MSG:
      if (value == null) {
        unsetMsg();
      } else {
        setMsg((java.lang.String)value);
      }
      break;

    case DEBUG:
      if (value == null) {
        unsetDebug();
      } else {
        setDebug((java.lang.String)value);
      }
      break;

    case EX:
      if (value == null) {
        unsetEx();
      } else {
        setEx((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CODE:
      return getCode();

    case DATA:
      return getData();

    case MSG:
      return getMsg();

    case DEBUG:
      return getDebug();

    case EX:
      return getEx();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CODE:
      return isSetCode();
    case DATA:
      return isSetData();
    case MSG:
      return isSetMsg();
    case DEBUG:
      return isSetDebug();
    case EX:
      return isSetEx();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ResponseData)
      return this.equals((ResponseData)that);
    return false;
  }

  public boolean equals(ResponseData that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_code = true;
    boolean that_present_code = true;
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code))
        return false;
      if (this.code != that.code)
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    boolean this_present_msg = true && this.isSetMsg();
    boolean that_present_msg = true && that.isSetMsg();
    if (this_present_msg || that_present_msg) {
      if (!(this_present_msg && that_present_msg))
        return false;
      if (!this.msg.equals(that.msg))
        return false;
    }

    boolean this_present_debug = true && this.isSetDebug();
    boolean that_present_debug = true && that.isSetDebug();
    if (this_present_debug || that_present_debug) {
      if (!(this_present_debug && that_present_debug))
        return false;
      if (!this.debug.equals(that.debug))
        return false;
    }

    boolean this_present_ex = true && this.isSetEx();
    boolean that_present_ex = true && that.isSetEx();
    if (this_present_ex || that_present_ex) {
      if (!(this_present_ex && that_present_ex))
        return false;
      if (!this.ex.equals(that.ex))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + code;

    hashCode = hashCode * 8191 + ((isSetData()) ? 131071 : 524287);
    if (isSetData())
      hashCode = hashCode * 8191 + data.hashCode();

    hashCode = hashCode * 8191 + ((isSetMsg()) ? 131071 : 524287);
    if (isSetMsg())
      hashCode = hashCode * 8191 + msg.hashCode();

    hashCode = hashCode * 8191 + ((isSetDebug()) ? 131071 : 524287);
    if (isSetDebug())
      hashCode = hashCode * 8191 + debug.hashCode();

    hashCode = hashCode * 8191 + ((isSetEx()) ? 131071 : 524287);
    if (isSetEx())
      hashCode = hashCode * 8191 + ex.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ResponseData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, other.code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetData()).compareTo(other.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data, other.data);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMsg()).compareTo(other.isSetMsg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMsg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.msg, other.msg);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDebug()).compareTo(other.isSetDebug());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDebug()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.debug, other.debug);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEx()).compareTo(other.isSetEx());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEx()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ex, other.ex);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ResponseData(");
    boolean first = true;

    sb.append("code:");
    sb.append(this.code);
    first = false;
    if (isSetData()) {
      if (!first) sb.append(", ");
      sb.append("data:");
      if (this.data == null) {
        sb.append("null");
      } else {
        sb.append(this.data);
      }
      first = false;
    }
    if (isSetMsg()) {
      if (!first) sb.append(", ");
      sb.append("msg:");
      if (this.msg == null) {
        sb.append("null");
      } else {
        sb.append(this.msg);
      }
      first = false;
    }
    if (isSetDebug()) {
      if (!first) sb.append(", ");
      sb.append("debug:");
      if (this.debug == null) {
        sb.append("null");
      } else {
        sb.append(this.debug);
      }
      first = false;
    }
    if (isSetEx()) {
      if (!first) sb.append(", ");
      sb.append("ex:");
      if (this.ex == null) {
        sb.append("null");
      } else {
        sb.append(this.ex);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'code' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ResponseDataStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ResponseDataStandardScheme getScheme() {
      return new ResponseDataStandardScheme();
    }
  }

  private static class ResponseDataStandardScheme extends org.apache.thrift.scheme.StandardScheme<ResponseData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ResponseData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.code = iprot.readI32();
              struct.setCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.data = iprot.readString();
              struct.setDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MSG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.msg = iprot.readString();
              struct.setMsgIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DEBUG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.debug = iprot.readString();
              struct.setDebugIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // EX
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ex = iprot.readString();
              struct.setExIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetCode()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'code' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ResponseData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CODE_FIELD_DESC);
      oprot.writeI32(struct.code);
      oprot.writeFieldEnd();
      if (struct.data != null) {
        if (struct.isSetData()) {
          oprot.writeFieldBegin(DATA_FIELD_DESC);
          oprot.writeString(struct.data);
          oprot.writeFieldEnd();
        }
      }
      if (struct.msg != null) {
        if (struct.isSetMsg()) {
          oprot.writeFieldBegin(MSG_FIELD_DESC);
          oprot.writeString(struct.msg);
          oprot.writeFieldEnd();
        }
      }
      if (struct.debug != null) {
        if (struct.isSetDebug()) {
          oprot.writeFieldBegin(DEBUG_FIELD_DESC);
          oprot.writeString(struct.debug);
          oprot.writeFieldEnd();
        }
      }
      if (struct.ex != null) {
        if (struct.isSetEx()) {
          oprot.writeFieldBegin(EX_FIELD_DESC);
          oprot.writeString(struct.ex);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ResponseDataTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ResponseDataTupleScheme getScheme() {
      return new ResponseDataTupleScheme();
    }
  }

  private static class ResponseDataTupleScheme extends org.apache.thrift.scheme.TupleScheme<ResponseData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ResponseData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.code);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetData()) {
        optionals.set(0);
      }
      if (struct.isSetMsg()) {
        optionals.set(1);
      }
      if (struct.isSetDebug()) {
        optionals.set(2);
      }
      if (struct.isSetEx()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetData()) {
        oprot.writeString(struct.data);
      }
      if (struct.isSetMsg()) {
        oprot.writeString(struct.msg);
      }
      if (struct.isSetDebug()) {
        oprot.writeString(struct.debug);
      }
      if (struct.isSetEx()) {
        oprot.writeString(struct.ex);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ResponseData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.code = iprot.readI32();
      struct.setCodeIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.data = iprot.readString();
        struct.setDataIsSet(true);
      }
      if (incoming.get(1)) {
        struct.msg = iprot.readString();
        struct.setMsgIsSet(true);
      }
      if (incoming.get(2)) {
        struct.debug = iprot.readString();
        struct.setDebugIsSet(true);
      }
      if (incoming.get(3)) {
        struct.ex = iprot.readString();
        struct.setExIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

