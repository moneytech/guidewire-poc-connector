/**
 * SearchStatusReasonCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ResponseNamespace;

public class SearchStatusReasonCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SearchStatusReasonCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _VehicleFound = "VehicleFound";
    public static final java.lang.String _ClaimNotOpen = "ClaimNotOpen";
    public static final java.lang.String _ClaimNotFound = "ClaimNotFound";
    public static final java.lang.String _VehicleNotFound = "VehicleNotFound";
    public static final java.lang.String _Other = "Other";
    public static final SearchStatusReasonCode VehicleFound = new SearchStatusReasonCode(_VehicleFound);
    public static final SearchStatusReasonCode ClaimNotOpen = new SearchStatusReasonCode(_ClaimNotOpen);
    public static final SearchStatusReasonCode ClaimNotFound = new SearchStatusReasonCode(_ClaimNotFound);
    public static final SearchStatusReasonCode VehicleNotFound = new SearchStatusReasonCode(_VehicleNotFound);
    public static final SearchStatusReasonCode Other = new SearchStatusReasonCode(_Other);
    public java.lang.String getValue() { return _value_;}
    public static SearchStatusReasonCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SearchStatusReasonCode enumeration = (SearchStatusReasonCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SearchStatusReasonCode fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchStatusReasonCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("ResponseNamespace", ">SearchStatusReasonCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
