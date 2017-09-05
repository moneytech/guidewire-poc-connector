/**
 * VehicleIncidentExposuresEntryCoverage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel;

public class VehicleIncidentExposuresEntryCoverage  implements java.io.Serializable {
    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentExposuresEntryCoverageClaimDeductible claimDeductible;

    public VehicleIncidentExposuresEntryCoverage() {
    }

    public VehicleIncidentExposuresEntryCoverage(
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentExposuresEntryCoverageClaimDeductible claimDeductible) {
           this.claimDeductible = claimDeductible;
    }


    /**
     * Gets the claimDeductible value for this VehicleIncidentExposuresEntryCoverage.
     * 
     * @return claimDeductible
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentExposuresEntryCoverageClaimDeductible getClaimDeductible() {
        return claimDeductible;
    }


    /**
     * Sets the claimDeductible value for this VehicleIncidentExposuresEntryCoverage.
     * 
     * @param claimDeductible
     */
    public void setClaimDeductible(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentExposuresEntryCoverageClaimDeductible claimDeductible) {
        this.claimDeductible = claimDeductible;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehicleIncidentExposuresEntryCoverage)) return false;
        VehicleIncidentExposuresEntryCoverage other = (VehicleIncidentExposuresEntryCoverage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.claimDeductible==null && other.getClaimDeductible()==null) || 
             (this.claimDeductible!=null &&
              this.claimDeductible.equals(other.getClaimDeductible())));
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
        if (getClaimDeductible() != null) {
            _hashCode += getClaimDeductible().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VehicleIncidentExposuresEntryCoverage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>VehicleIncident>Exposures>Entry>Coverage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimDeductible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "ClaimDeductible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>>VehicleIncident>Exposures>Entry>Coverage>ClaimDeductible"));
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
