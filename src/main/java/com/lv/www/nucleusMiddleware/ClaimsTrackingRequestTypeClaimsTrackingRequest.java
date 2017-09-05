/**
 * ClaimsTrackingRequestTypeClaimsTrackingRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lv.www.nucleusMiddleware;

public class ClaimsTrackingRequestTypeClaimsTrackingRequest  implements java.io.Serializable {
    private java.lang.String claimNumber;

    private java.lang.String VRN;

    public ClaimsTrackingRequestTypeClaimsTrackingRequest() {
    }

    public ClaimsTrackingRequestTypeClaimsTrackingRequest(
           java.lang.String claimNumber,
           java.lang.String VRN) {
           this.claimNumber = claimNumber;
           this.VRN = VRN;
    }


    /**
     * Gets the claimNumber value for this ClaimsTrackingRequestTypeClaimsTrackingRequest.
     * 
     * @return claimNumber
     */
    public java.lang.String getClaimNumber() {
        return claimNumber;
    }


    /**
     * Sets the claimNumber value for this ClaimsTrackingRequestTypeClaimsTrackingRequest.
     * 
     * @param claimNumber
     */
    public void setClaimNumber(java.lang.String claimNumber) {
        this.claimNumber = claimNumber;
    }


    /**
     * Gets the VRN value for this ClaimsTrackingRequestTypeClaimsTrackingRequest.
     * 
     * @return VRN
     */
    public java.lang.String getVRN() {
        return VRN;
    }


    /**
     * Sets the VRN value for this ClaimsTrackingRequestTypeClaimsTrackingRequest.
     * 
     * @param VRN
     */
    public void setVRN(java.lang.String VRN) {
        this.VRN = VRN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClaimsTrackingRequestTypeClaimsTrackingRequest)) return false;
        ClaimsTrackingRequestTypeClaimsTrackingRequest other = (ClaimsTrackingRequestTypeClaimsTrackingRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.claimNumber==null && other.getClaimNumber()==null) || 
             (this.claimNumber!=null &&
              this.claimNumber.equals(other.getClaimNumber()))) &&
            ((this.VRN==null && other.getVRN()==null) || 
             (this.VRN!=null &&
              this.VRN.equals(other.getVRN())));
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
        if (getClaimNumber() != null) {
            _hashCode += getClaimNumber().hashCode();
        }
        if (getVRN() != null) {
            _hashCode += getVRN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClaimsTrackingRequestTypeClaimsTrackingRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lv.com/nucleusMiddleware", ">ClaimsTrackingRequestType>ClaimsTrackingRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClaimNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VRN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VRN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
