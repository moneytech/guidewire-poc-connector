/**
 * VehicleIncidentExposuresEntryCoverageClaimDeductible.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel;

public class VehicleIncidentExposuresEntryCoverageClaimDeductible  implements java.io.Serializable {
    private java.lang.String amount;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentExposuresEntryCoverageClaimDeductibleWaiveExcessReason_Ext waiveExcessReason_Ext;

    public VehicleIncidentExposuresEntryCoverageClaimDeductible() {
    }

    public VehicleIncidentExposuresEntryCoverageClaimDeductible(
           java.lang.String amount,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentExposuresEntryCoverageClaimDeductibleWaiveExcessReason_Ext waiveExcessReason_Ext) {
           this.amount = amount;
           this.waiveExcessReason_Ext = waiveExcessReason_Ext;
    }


    /**
     * Gets the amount value for this VehicleIncidentExposuresEntryCoverageClaimDeductible.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this VehicleIncidentExposuresEntryCoverageClaimDeductible.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the waiveExcessReason_Ext value for this VehicleIncidentExposuresEntryCoverageClaimDeductible.
     * 
     * @return waiveExcessReason_Ext
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentExposuresEntryCoverageClaimDeductibleWaiveExcessReason_Ext getWaiveExcessReason_Ext() {
        return waiveExcessReason_Ext;
    }


    /**
     * Sets the waiveExcessReason_Ext value for this VehicleIncidentExposuresEntryCoverageClaimDeductible.
     * 
     * @param waiveExcessReason_Ext
     */
    public void setWaiveExcessReason_Ext(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentExposuresEntryCoverageClaimDeductibleWaiveExcessReason_Ext waiveExcessReason_Ext) {
        this.waiveExcessReason_Ext = waiveExcessReason_Ext;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehicleIncidentExposuresEntryCoverageClaimDeductible)) return false;
        VehicleIncidentExposuresEntryCoverageClaimDeductible other = (VehicleIncidentExposuresEntryCoverageClaimDeductible) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.waiveExcessReason_Ext==null && other.getWaiveExcessReason_Ext()==null) || 
             (this.waiveExcessReason_Ext!=null &&
              this.waiveExcessReason_Ext.equals(other.getWaiveExcessReason_Ext())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getWaiveExcessReason_Ext() != null) {
            _hashCode += getWaiveExcessReason_Ext().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VehicleIncidentExposuresEntryCoverageClaimDeductible.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>>VehicleIncident>Exposures>Entry>Coverage>ClaimDeductible"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waiveExcessReason_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "WaiveExcessReason_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>>>VehicleIncident>Exposures>Entry>Coverage>ClaimDeductible>WaiveExcessReason_Ext"));
        elemField.setMinOccurs(0);
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
