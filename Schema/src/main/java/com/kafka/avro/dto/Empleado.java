/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.kafka.avro.dto;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Empleado extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3051360738454421141L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Empleado\",\"namespace\":\"com.kafka.avro.dto\",\"fields\":[{\"name\":\"nombre\",\"type\":\"string\"},{\"name\":\"apellido\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Empleado> ENCODER =
      new BinaryMessageEncoder<Empleado>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Empleado> DECODER =
      new BinaryMessageDecoder<Empleado>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Empleado> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Empleado> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Empleado>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Empleado to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Empleado from a ByteBuffer. */
  public static Empleado fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence nombre;
  @Deprecated public java.lang.CharSequence apellido;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Empleado() {}

  /**
   * All-args constructor.
   * @param nombre The new value for nombre
   * @param apellido The new value for apellido
   */
  public Empleado(java.lang.CharSequence nombre, java.lang.CharSequence apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return nombre;
    case 1: return apellido;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: nombre = (java.lang.CharSequence)value$; break;
    case 1: apellido = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'nombre' field.
   * @return The value of the 'nombre' field.
   */
  public java.lang.CharSequence getNombre() {
    return nombre;
  }

  /**
   * Sets the value of the 'nombre' field.
   * @param value the value to set.
   */
  public void setNombre(java.lang.CharSequence value) {
    this.nombre = value;
  }

  /**
   * Gets the value of the 'apellido' field.
   * @return The value of the 'apellido' field.
   */
  public java.lang.CharSequence getApellido() {
    return apellido;
  }

  /**
   * Sets the value of the 'apellido' field.
   * @param value the value to set.
   */
  public void setApellido(java.lang.CharSequence value) {
    this.apellido = value;
  }

  /**
   * Creates a new Empleado RecordBuilder.
   * @return A new Empleado RecordBuilder
   */
  public static com.kafka.avro.dto.Empleado.Builder newBuilder() {
    return new com.kafka.avro.dto.Empleado.Builder();
  }

  /**
   * Creates a new Empleado RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Empleado RecordBuilder
   */
  public static com.kafka.avro.dto.Empleado.Builder newBuilder(com.kafka.avro.dto.Empleado.Builder other) {
    return new com.kafka.avro.dto.Empleado.Builder(other);
  }

  /**
   * Creates a new Empleado RecordBuilder by copying an existing Empleado instance.
   * @param other The existing instance to copy.
   * @return A new Empleado RecordBuilder
   */
  public static com.kafka.avro.dto.Empleado.Builder newBuilder(com.kafka.avro.dto.Empleado other) {
    return new com.kafka.avro.dto.Empleado.Builder(other);
  }

  /**
   * RecordBuilder for Empleado instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Empleado>
    implements org.apache.avro.data.RecordBuilder<Empleado> {

    private java.lang.CharSequence nombre;
    private java.lang.CharSequence apellido;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.kafka.avro.dto.Empleado.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.nombre)) {
        this.nombre = data().deepCopy(fields()[0].schema(), other.nombre);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.apellido)) {
        this.apellido = data().deepCopy(fields()[1].schema(), other.apellido);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Empleado instance
     * @param other The existing instance to copy.
     */
    private Builder(com.kafka.avro.dto.Empleado other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.nombre)) {
        this.nombre = data().deepCopy(fields()[0].schema(), other.nombre);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.apellido)) {
        this.apellido = data().deepCopy(fields()[1].schema(), other.apellido);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'nombre' field.
      * @return The value.
      */
    public java.lang.CharSequence getNombre() {
      return nombre;
    }

    /**
      * Sets the value of the 'nombre' field.
      * @param value The value of 'nombre'.
      * @return This builder.
      */
    public com.kafka.avro.dto.Empleado.Builder setNombre(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.nombre = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'nombre' field has been set.
      * @return True if the 'nombre' field has been set, false otherwise.
      */
    public boolean hasNombre() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'nombre' field.
      * @return This builder.
      */
    public com.kafka.avro.dto.Empleado.Builder clearNombre() {
      nombre = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'apellido' field.
      * @return The value.
      */
    public java.lang.CharSequence getApellido() {
      return apellido;
    }

    /**
      * Sets the value of the 'apellido' field.
      * @param value The value of 'apellido'.
      * @return This builder.
      */
    public com.kafka.avro.dto.Empleado.Builder setApellido(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.apellido = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'apellido' field has been set.
      * @return True if the 'apellido' field has been set, false otherwise.
      */
    public boolean hasApellido() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'apellido' field.
      * @return This builder.
      */
    public com.kafka.avro.dto.Empleado.Builder clearApellido() {
      apellido = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Empleado build() {
      try {
        Empleado record = new Empleado();
        record.nombre = fieldSetFlags()[0] ? this.nombre : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.apellido = fieldSetFlags()[1] ? this.apellido : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Empleado>
    WRITER$ = (org.apache.avro.io.DatumWriter<Empleado>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Empleado>
    READER$ = (org.apache.avro.io.DatumReader<Empleado>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
