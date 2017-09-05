/**
 * VehicleIncidentValuationReports_ExtEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel;

public class VehicleIncidentValuationReports_ExtEntry  implements java.io.Serializable {
    private java.lang.Boolean reportStatusComplete;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentValuationReports_ExtEntrySalvageCategory_Ext salvageCategory_Ext;

    private java.util.Calendar updateTime;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentValuationReports_ExtEntryValuationStatus valuationStatus;

    private java.lang.Integer versionNumber;

    private java.lang.String action;  // attribute

    public VehicleIncidentValuationReports_ExtEntry() {
    }

    public VehicleIncidentValuationReports_ExtEntry(
           java.lang.Boolean reportStatusComplete,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentValuationReports_ExtEntrySalvageCategory_Ext salvageCategory_Ext,
           java.util.Calendar updateTime,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentValuationReports_ExtEntryValuationStatus valuationStatus,
           java.lang.Integer versionNumber,
           java.lang.String action) {
           this.reportStatusComplete = reportStatusComplete;
           this.salvageCategory_Ext = salvageCategory_Ext;
           this.updateTime = updateTime;
           this.valuationStatus = valuationStatus;
           this.versionNumber = versionNumber;
           this.action = action;
    }


    /**
     * Gets the reportStatusComplete value for this VehicleIncidentValuationReports_ExtEntry.
     * 
     * @return reportStatusComplete
     */
    public java.lang.Boolean getReportStatusComplete() {
        return reportStatusComplete;
    }


    /**
     * Sets the reportStatusComplete value for this VehicleIncidentValuationReports_ExtEntry.
     * 
     * @param reportStatusComplete
     */
    public void setReportStatusComplete(java.lang.Boolean reportStatusComplete) {
        this.reportStatusComplete = reportStatusComplete;
    }


    /**
     * Gets the salvageCategory_Ext value for this VehicleIncidentValuationReports_ExtEntry.
     * 
     * @return salvageCategory_Ext
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentValuationReports_ExtEntrySalvageCategory_Ext getSalvageCategory_Ext() {
        return salvageCategory_Ext;
    }


    /**
     * Sets the salvageCategory_Ext value for this VehicleIncidentValuationReports_ExtEntry.
     * 
     * @param salvageCategory_Ext
     */
    public void setSalvageCategory_Ext(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentValuationReports_ExtEntrySalvageCategory_Ext salvageCategory_Ext) {
        this.salvageCategory_Ext = salvageCategory_Ext;
    }


    /**
     * Gets the updateTime value for this VehicleIncidentValuationReports_ExtEntry.
     * 
     * @return updateTime
     */
    public java.util.Calendar getUpdateTime() {
        return updateTime;
    }


    /**
     * Sets the updateTime value for this VehicleIncidentValuationReports_ExtEntry.
     * 
     * @param updateTime
     */
    public void setUpdateTime(java.util.Calendar updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * Gets the valuationStatus value for this VehicleIncidentValuationReports_ExtEntry.
     * 
     * @return valuationStatus
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentValuationReports_ExtEntryValuationStatus getValuationStatus() {
        return valuationStatus;
    }


    /**
     * Sets the valuationStatus value for this VehicleIncidentValuationReports_ExtEntry.
     * 
     * @param valuationStatus
     */
    public void setValuationStatus(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentValuationReports_ExtEntryValuationStatus valuationStatus) {
        this.valuationStatus = valuationStatus;
    }


    /**
     * Gets the versionNumber value for this VehicleIncidentValuationReports_ExtEntry.
     * 
     * @return versionNumber
     */
    public java.lang.Integer getVersionNumber() {
        return versionNumber;
    }


    /**
     * Sets the versionNumber value for this VehicleIncidentValuationReports_ExtEntry.
     * 
     * @param versionNumber
     */
    public void setVersionNumber(java.lang.Integer versionNumber) {
        this.versionNumber = versionNumber;
    }


    /**
     * Gets the action value for this VehicleIncidentValuationReports_ExtEntry.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this VehicleIncidentValuationReports_ExtEntry.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehicleIncidentValuationReports_ExtEntry)) return false;
        VehicleIncidentValuationReports_ExtEntry other = (VehicleIncidentValuationReports_ExtEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reportStatusComplete==null && other.getReportStatusComplete()==null) || 
             (this.reportStatusComplete!=null &&
              this.reportStatusComplete.equals(other.getReportStatusComplete()))) &&
            ((this.salvageCategory_Ext==null && other.getSalvageCategory_Ext()==null) || 
             (this.salvageCategory_Ext!=null &&
              this.salvageCategory_Ext.equals(other.getSalvageCategory_Ext()))) &&
            ((this.updateTime==null && other.getUpdateTime()==null) || 
             (this.updateTime!=null &&
              this.updateTime.equals(other.getUpdateTime()))) &&
            ((this.valuationStatus==null && other.getValuationStatus()==null) || 
             (this.valuationStatus!=null &&
              this.valuationStatus.equals(other.getValuationStatus()))) &&
            ((this.versionNumber==null && other.getVersionNumber()==null) || 
             (this.versionNumber!=null &&
              this.versionNumber.equals(other.getVersionNumber()))) &&
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
        if (getReportStatusComplete() != null) {
            _hashCode += getReportStatusComplete().hashCode();
        }
        if (getSalvageCategory_Ext() != null) {
            _hashCode += getSalvageCategory_Ext().hashCode();
        }
        if (getUpdateTime() != null) {
            _hashCode += getUpdateTime().hashCode();
        }
        if (getValuationStatus() != null) {
            _hashCode += getValuationStatus().hashCode();
        }
        if (getVersionNumber() != null) {
            _hashCode += getVersionNumber().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VehicleIncidentValuationReports_ExtEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>VehicleIncident>ValuationReports_Ext>Entry"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("action");
        attrField.setXmlName(new javax.xml.namespace.QName("", "action"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportStatusComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "ReportStatusComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salvageCategory_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "SalvageCategory_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>VehicleIncident>ValuationReports_Ext>Entry>SalvageCategory_Ext"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "UpdateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valuationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "ValuationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>VehicleIncident>ValuationReports_Ext>Entry>ValuationStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "VersionNumber"));
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
