/**
 * ClaimsTrackingResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ResponseNamespace;

public class ClaimsTrackingResponseType  implements java.io.Serializable {
    private ResponseNamespace.ClaimsTrackingResponseTypeClaimsTrackingResponse claimsTrackingResponse;

    public ClaimsTrackingResponseType() {
    }

    public ClaimsTrackingResponseType(
           ResponseNamespace.ClaimsTrackingResponseTypeClaimsTrackingResponse claimsTrackingResponse) {
           this.claimsTrackingResponse = claimsTrackingResponse;
    }


    /**
     * Gets the claimsTrackingResponse value for this ClaimsTrackingResponseType.
     * 
     * @return claimsTrackingResponse
     */
    public ResponseNamespace.ClaimsTrackingResponseTypeClaimsTrackingResponse getClaimsTrackingResponse() {
        return claimsTrackingResponse;
    }


    /**
     * Sets the claimsTrackingResponse value for this ClaimsTrackingResponseType.
     * 
     * @param claimsTrackingResponse
     */
    public void setClaimsTrackingResponse(ResponseNamespace.ClaimsTrackingResponseTypeClaimsTrackingResponse claimsTrackingResponse) {
        this.claimsTrackingResponse = claimsTrackingResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClaimsTrackingResponseType)) return false;
        ClaimsTrackingResponseType other = (ClaimsTrackingResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.claimsTrackingResponse==null && other.getClaimsTrackingResponse()==null) || 
             (this.claimsTrackingResponse!=null &&
              this.claimsTrackingResponse.equals(other.getClaimsTrackingResponse())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getClaimsTrackingResponse() != null) {
            _hashCode += getClaimsTrackingResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClaimsTrackingResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("ResponseNamespace", "ClaimsTrackingResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimsTrackingResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClaimsTrackingResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("ResponseNamespace", ">ClaimsTrackingResponseType>ClaimsTrackingResponse"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
