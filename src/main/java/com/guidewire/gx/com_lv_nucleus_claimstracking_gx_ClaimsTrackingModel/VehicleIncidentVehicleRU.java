/**
 * VehicleIncidentVehicleRU.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel;

public class VehicleIncidentVehicleRU  implements java.io.Serializable {
    private java.lang.Boolean NCDGuaranteed_Ext;

    private java.lang.Boolean NCDProtected_Ext;

    public VehicleIncidentVehicleRU() {
    }

    public VehicleIncidentVehicleRU(
           java.lang.Boolean NCDGuaranteed_Ext,
           java.lang.Boolean NCDProtected_Ext) {
           this.NCDGuaranteed_Ext = NCDGuaranteed_Ext;
           this.NCDProtected_Ext = NCDProtected_Ext;
    }


    /**
     * Gets the NCDGuaranteed_Ext value for this VehicleIncidentVehicleRU.
     * 
     * @return NCDGuaranteed_Ext
     */
    public java.lang.Boolean getNCDGuaranteed_Ext() {
        return NCDGuaranteed_Ext;
    }


    /**
     * Sets the NCDGuaranteed_Ext value for this VehicleIncidentVehicleRU.
     * 
     * @param NCDGuaranteed_Ext
     */
    public void setNCDGuaranteed_Ext(java.lang.Boolean NCDGuaranteed_Ext) {
        this.NCDGuaranteed_Ext = NCDGuaranteed_Ext;
    }


    /**
     * Gets the NCDProtected_Ext value for this VehicleIncidentVehicleRU.
     * 
     * @return NCDProtected_Ext
     */
    public java.lang.Boolean getNCDProtected_Ext() {
        return NCDProtected_Ext;
    }


    /**
     * Sets the NCDProtected_Ext value for this VehicleIncidentVehicleRU.
     * 
     * @param NCDProtected_Ext
     */
    public void setNCDProtected_Ext(java.lang.Boolean NCDProtected_Ext) {
        this.NCDProtected_Ext = NCDProtected_Ext;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehicleIncidentVehicleRU)) return false;
        VehicleIncidentVehicleRU other = (VehicleIncidentVehicleRU) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.NCDGuaranteed_Ext==null && other.getNCDGuaranteed_Ext()==null) || 
             (this.NCDGuaranteed_Ext!=null &&
              this.NCDGuaranteed_Ext.equals(other.getNCDGuaranteed_Ext()))) &&
            ((this.NCDProtected_Ext==null && other.getNCDProtected_Ext()==null) || 
             (this.NCDProtected_Ext!=null &&
              this.NCDProtected_Ext.equals(other.getNCDProtected_Ext())));
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
        if (getNCDGuaranteed_Ext() != null) {
            _hashCode += getNCDGuaranteed_Ext().hashCode();
        }
        if (getNCDProtected_Ext() != null) {
            _hashCode += getNCDProtected_Ext().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VehicleIncidentVehicleRU.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">VehicleIncident>VehicleRU"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NCDGuaranteed_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "NCDGuaranteed_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NCDProtected_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "NCDProtected_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
