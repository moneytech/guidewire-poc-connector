/**
 * VehicleIncidentExposuresEntrySettlementsEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel;

public class VehicleIncidentExposuresEntrySettlementsEntry  implements java.io.Serializable {
    private java.lang.Boolean customerContacted_Ext;

    private java.lang.Boolean settlementStatusComplete_Ext;

    private java.util.Calendar updateTime;

    private java.lang.Integer versionNumber_Ext;

    private java.lang.String action;  // attribute

    public VehicleIncidentExposuresEntrySettlementsEntry() {
    }

    public VehicleIncidentExposuresEntrySettlementsEntry(
           java.lang.Boolean customerContacted_Ext,
           java.lang.Boolean settlementStatusComplete_Ext,
           java.util.Calendar updateTime,
           java.lang.Integer versionNumber_Ext,
           java.lang.String action) {
           this.customerContacted_Ext = customerContacted_Ext;
           this.settlementStatusComplete_Ext = settlementStatusComplete_Ext;
           this.updateTime = updateTime;
           this.versionNumber_Ext = versionNumber_Ext;
           this.action = action;
    }


    /**
     * Gets the customerContacted_Ext value for this VehicleIncidentExposuresEntrySettlementsEntry.
     * 
     * @return customerContacted_Ext
     */
    public java.lang.Boolean getCustomerContacted_Ext() {
        return customerContacted_Ext;
    }


    /**
     * Sets the customerContacted_Ext value for this VehicleIncidentExposuresEntrySettlementsEntry.
     * 
     * @param customerContacted_Ext
     */
    public void setCustomerContacted_Ext(java.lang.Boolean customerContacted_Ext) {
        this.customerContacted_Ext = customerContacted_Ext;
    }


    /**
     * Gets the settlementStatusComplete_Ext value for this VehicleIncidentExposuresEntrySettlementsEntry.
     * 
     * @return settlementStatusComplete_Ext
     */
    public java.lang.Boolean getSettlementStatusComplete_Ext() {
        return settlementStatusComplete_Ext;
    }


    /**
     * Sets the settlementStatusComplete_Ext value for this VehicleIncidentExposuresEntrySettlementsEntry.
     * 
     * @param settlementStatusComplete_Ext
     */
    public void setSettlementStatusComplete_Ext(java.lang.Boolean settlementStatusComplete_Ext) {
        this.settlementStatusComplete_Ext = settlementStatusComplete_Ext;
    }


    /**
     * Gets the updateTime value for this VehicleIncidentExposuresEntrySettlementsEntry.
     * 
     * @return updateTime
     */
    public java.util.Calendar getUpdateTime() {
        return updateTime;
    }


    /**
     * Sets the updateTime value for this VehicleIncidentExposuresEntrySettlementsEntry.
     * 
     * @param updateTime
     */
    public void setUpdateTime(java.util.Calendar updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * Gets the versionNumber_Ext value for this VehicleIncidentExposuresEntrySettlementsEntry.
     * 
     * @return versionNumber_Ext
     */
    public java.lang.Integer getVersionNumber_Ext() {
        return versionNumber_Ext;
    }


    /**
     * Sets the versionNumber_Ext value for this VehicleIncidentExposuresEntrySettlementsEntry.
     * 
     * @param versionNumber_Ext
     */
    public void setVersionNumber_Ext(java.lang.Integer versionNumber_Ext) {
        this.versionNumber_Ext = versionNumber_Ext;
    }


    /**
     * Gets the action value for this VehicleIncidentExposuresEntrySettlementsEntry.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this VehicleIncidentExposuresEntrySettlementsEntry.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehicleIncidentExposuresEntrySettlementsEntry)) return false;
        VehicleIncidentExposuresEntrySettlementsEntry other = (VehicleIncidentExposuresEntrySettlementsEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerContacted_Ext==null && other.getCustomerContacted_Ext()==null) || 
             (this.customerContacted_Ext!=null &&
              this.customerContacted_Ext.equals(other.getCustomerContacted_Ext()))) &&
            ((this.settlementStatusComplete_Ext==null && other.getSettlementStatusComplete_Ext()==null) || 
             (this.settlementStatusComplete_Ext!=null &&
              this.settlementStatusComplete_Ext.equals(other.getSettlementStatusComplete_Ext()))) &&
            ((this.updateTime==null && other.getUpdateTime()==null) || 
             (this.updateTime!=null &&
              this.updateTime.equals(other.getUpdateTime()))) &&
            ((this.versionNumber_Ext==null && other.getVersionNumber_Ext()==null) || 
             (this.versionNumber_Ext!=null &&
              this.versionNumber_Ext.equals(other.getVersionNumber_Ext()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction())));
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
        if (getCustomerContacted_Ext() != null) {
            _hashCode += getCustomerContacted_Ext().hashCode();
        }
        if (getSettlementStatusComplete_Ext() != null) {
            _hashCode += getSettlementStatusComplete_Ext().hashCode();
        }
        if (getUpdateTime() != null) {
            _hashCode += getUpdateTime().hashCode();
        }
        if (getVersionNumber_Ext() != null) {
            _hashCode += getVersionNumber_Ext().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VehicleIncidentExposuresEntrySettlementsEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>>VehicleIncident>Exposures>Entry>Settlements>Entry"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("action");
        attrField.setXmlName(new javax.xml.namespace.QName("", "action"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerContacted_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "CustomerContacted_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settlementStatusComplete_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "SettlementStatusComplete_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "UpdateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionNumber_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "VersionNumber_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
