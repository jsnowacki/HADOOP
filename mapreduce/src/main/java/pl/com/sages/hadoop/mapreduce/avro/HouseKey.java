/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package pl.com.sages.hadoop.mapreduce.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class HouseKey extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HouseKey\",\"namespace\":\"pl.com.sages.hadoop.mapreduce.avro\",\"fields\":[{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"hood\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence type;
  @Deprecated public java.lang.CharSequence hood;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public HouseKey() {}

  /**
   * All-args constructor.
   */
  public HouseKey(java.lang.CharSequence type, java.lang.CharSequence hood) {
    this.type = type;
    this.hood = hood;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return hood;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (java.lang.CharSequence)value$; break;
    case 1: hood = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'type' field.
   */
  public java.lang.CharSequence getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.CharSequence value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'hood' field.
   */
  public java.lang.CharSequence getHood() {
    return hood;
  }

  /**
   * Sets the value of the 'hood' field.
   * @param value the value to set.
   */
  public void setHood(java.lang.CharSequence value) {
    this.hood = value;
  }

  /** Creates a new HouseKey RecordBuilder */
  public static pl.com.sages.hadoop.mapreduce.avro.HouseKey.Builder newBuilder() {
    return new pl.com.sages.hadoop.mapreduce.avro.HouseKey.Builder();
  }
  
  /** Creates a new HouseKey RecordBuilder by copying an existing Builder */
  public static pl.com.sages.hadoop.mapreduce.avro.HouseKey.Builder newBuilder(pl.com.sages.hadoop.mapreduce.avro.HouseKey.Builder other) {
    return new pl.com.sages.hadoop.mapreduce.avro.HouseKey.Builder(other);
  }
  
  /** Creates a new HouseKey RecordBuilder by copying an existing HouseKey instance */
  public static pl.com.sages.hadoop.mapreduce.avro.HouseKey.Builder newBuilder(pl.com.sages.hadoop.mapreduce.avro.HouseKey other) {
    return new pl.com.sages.hadoop.mapreduce.avro.HouseKey.Builder(other);
  }
  
  /**
   * RecordBuilder for HouseKey instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<HouseKey>
    implements org.apache.avro.data.RecordBuilder<HouseKey> {

    private java.lang.CharSequence type;
    private java.lang.CharSequence hood;

    /** Creates a new Builder */
    private Builder() {
      super(pl.com.sages.hadoop.mapreduce.avro.HouseKey.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(pl.com.sages.hadoop.mapreduce.avro.HouseKey.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.hood)) {
        this.hood = data().deepCopy(fields()[1].schema(), other.hood);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing HouseKey instance */
    private Builder(pl.com.sages.hadoop.mapreduce.avro.HouseKey other) {
            super(pl.com.sages.hadoop.mapreduce.avro.HouseKey.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.hood)) {
        this.hood = data().deepCopy(fields()[1].schema(), other.hood);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public java.lang.CharSequence getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public pl.com.sages.hadoop.mapreduce.avro.HouseKey.Builder setType(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.type = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'type' field */
    public pl.com.sages.hadoop.mapreduce.avro.HouseKey.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'hood' field */
    public java.lang.CharSequence getHood() {
      return hood;
    }
    
    /** Sets the value of the 'hood' field */
    public pl.com.sages.hadoop.mapreduce.avro.HouseKey.Builder setHood(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.hood = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'hood' field has been set */
    public boolean hasHood() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'hood' field */
    public pl.com.sages.hadoop.mapreduce.avro.HouseKey.Builder clearHood() {
      hood = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public HouseKey build() {
      try {
        HouseKey record = new HouseKey();
        record.type = fieldSetFlags()[0] ? this.type : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.hood = fieldSetFlags()[1] ? this.hood : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}