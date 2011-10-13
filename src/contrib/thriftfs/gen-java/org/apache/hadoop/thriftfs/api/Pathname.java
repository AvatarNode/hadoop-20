/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.thriftfs.api;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import org.apache.log4j.Logger;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

public class Pathname implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("Pathname");
  private static final TField PATHNAME_FIELD_DESC = new TField("pathname", TType.STRING, (short)1);

  public String pathname;
  public static final int PATHNAME = 1;

  private final Isset __isset = new Isset();
  private static final class Isset implements java.io.Serializable {
  }

  public static final Map<Integer, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new HashMap<Integer, FieldMetaData>() {{
    put(PATHNAME, new FieldMetaData("pathname", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(Pathname.class, metaDataMap);
  }

  public Pathname() {
  }

  public Pathname(
    String pathname)
  {
    this();
    this.pathname = pathname;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Pathname(Pathname other) {
    if (other.isSetPathname()) {
      this.pathname = other.pathname;
    }
  }

  @Override
  public Pathname clone() {
    return new Pathname(this);
  }

  public String getPathname() {
    return this.pathname;
  }

  public void setPathname(String pathname) {
    this.pathname = pathname;
  }

  public void unsetPathname() {
    this.pathname = null;
  }

  // Returns true if field pathname is set (has been asigned a value) and false otherwise
  public boolean isSetPathname() {
    return this.pathname != null;
  }

  public void setPathnameIsSet(boolean value) {
    if (!value) {
      this.pathname = null;
    }
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case PATHNAME:
      if (value == null) {
        unsetPathname();
      } else {
        setPathname((String)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case PATHNAME:
      return getPathname();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case PATHNAME:
      return isSetPathname();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Pathname)
      return this.equals((Pathname)that);
    return false;
  }

  public boolean equals(Pathname that) {
    if (that == null)
      return false;

    boolean this_present_pathname = true && this.isSetPathname();
    boolean that_present_pathname = true && that.isSetPathname();
    if (this_present_pathname || that_present_pathname) {
      if (!(this_present_pathname && that_present_pathname))
        return false;
      if (!this.pathname.equals(that.pathname))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case PATHNAME:
          if (field.type == TType.STRING) {
            this.pathname = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.pathname != null) {
      oprot.writeFieldBegin(PATHNAME_FIELD_DESC);
      oprot.writeString(this.pathname);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Pathname(");
    boolean first = true;

    sb.append("pathname:");
    if (this.pathname == null) {
      sb.append("null");
    } else {
      sb.append(this.pathname);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

