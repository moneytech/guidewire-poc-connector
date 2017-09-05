/**
 * VehicleIncidentClaimPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel;

public class VehicleIncidentClaimPolicy  implements java.io.Serializable {
    private java.util.Calendar nextPolicySoldStartDate_Ext;

    private java.lang.String policyNumber;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentClaimPolicyProductCode_Ext productCode_Ext;

    public VehicleIncidentClaimPolicy() {
    }

    public VehicleIncidentClaimPolicy(
           java.util.Calendar nextPolicySoldStartDate_Ext,
           java.lang.String policyNumber,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentClaimPolicyProductCode_Ext productCode_Ext) {
           this.nextPolicySoldStartDate_Ext = nextPolicySoldStartDate_Ext;
           this.policyNumber = policyNumber;
           this.productCode_Ext = productCode_Ext;
    }


    /**
     * Gets the nextPolicySoldStartDate_Ext value for this VehicleIncidentClaimPolicy.
     * 
     * @return nextPolicySoldStartDate_Ext
     */
    public java.util.Calendar getNextPolicySoldStartDate_Ext() {
        return nextPolicySoldStartDate_Ext;
    }


    /**
     * Sets the nextPolicySoldStartDate_Ext value for this VehicleIncidentClaimPolicy.
     * 
     * @param nextPolicySoldStartDate_Ext
     */
    public void setNextPolicySoldStartDate_Ext(java.util.Calendar nextPolicySoldStartDate_Ext) {
        this.nextPolicySoldStartDate_Ext = nextPolicySoldStartDate_Ext;
    }


    /**
     * Gets the policyNumber value for this VehicleIncidentClaimPolicy.
     * 
     * @return policyNumber
     */
    public java.lang.String getPolicyNumber() {
        return policyNumber;
    }


    /**
     * Sets the policyNumber value for this VehicleIncidentClaimPolicy.
     * 
     * @param policyNumber
     */
    public void setPolicyNumber(java.lang.String policyNumber) {
        this.policyNumber = policyNumber;
    }


    /**
     * Gets the productCode_Ext value for this VehicleIncidentClaimPolicy.
     * 
     * @return productCode_Ext
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentClaimPolicyProductCode_Ext getProductCode_Ext() {
        return productCode_Ext;
    }


    /**
     * Sets the productCode_Ext value for this VehicleIncidentClaimPolicy.
     * 
     * @param productCode_Ext
     */
    public void setProductCode_Ext(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentClaimPolicyProductCode_Ext productCode_Ext) {
        this.productCode_Ext = productCode_Ext;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehicleIncidentClaimPolicy)) return false;
        VehicleIncidentClaimPolicy other = (VehicleIncidentClaimPolicy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nextPolicySoldStartDate_Ext==null && other.getNextPolicySoldStartDate_Ext()==null) || 
             (this.nextPolicySoldStartDate_Ext!=null &&
              this.nextPolicySoldStartDate_Ext.equals(other.getNextPolicySoldStartDate_Ext()))) &&
            ((this.policyNumber==null && other.getPolicyNumber()==null) || 
             (this.policyNumber!=null &&
              this.policyNumber.equals(other.getPolicyNumber()))) &&
            ((this.productCode_Ext==null && other.getProductCode_Ext()==null) || 
             (this.productCode_Ext!=null &&
              this.productCode_Ext.equals(other.getProductCode_Ext())));
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
        if (getNextPolicySoldStartDate_Ext() != null) {
            _hashCode += getNextPolicySoldStartDate_Ext().hashCode();
        }
        if (getPolicyNumber() != null) {
            _hashCode += getPolicyNumber().hashCode();
        }
        if (getProductCode_Ext() != null) {
            _hashCode += getProductCode_Ext().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VehicleIncidentClaimPolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>VehicleIncident>Claim>Policy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextPolicySoldStartDate_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "NextPolicySoldStartDate_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "PolicyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productCode_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "ProductCode_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>VehicleIncident>Claim>Policy>ProductCode_Ext"));
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
