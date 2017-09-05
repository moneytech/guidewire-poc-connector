/**
 * VehicleIncidentServices_ExtEntryEntityInspectionRequestService_Ext.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel;

public class VehicleIncidentServices_ExtEntryEntityInspectionRequestService_Ext  implements java.io.Serializable {
    private java.util.Calendar inspectionDate;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentServices_ExtEntryEntityInspectionRequestService_ExtInspectionReason_Ext inspectionReason_Ext;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentServices_ExtEntryEntityInspectionRequestService_ExtInspectionStatus_Ext inspectionStatus_Ext;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentServices_ExtEntryEntityInspectionRequestService_ExtRebookReason_Ext rebookReason_Ext;

    public VehicleIncidentServices_ExtEntryEntityInspectionRequestService_Ext() {
    }

    public VehicleIncidentServices_ExtEntryEntityInspectionRequestService_Ext(
           java.util.Calendar inspectionDate,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentServices_ExtEntryEntityInspectionRequestService_ExtInspectionReason_Ext inspectionReason_Ext,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentServices_ExtEntryEntityInspectionRequestService_ExtInspectionStatus_Ext inspectionStatus_Ext,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentServices_ExtEntryEntityInspectionRequestService_ExtRebookReason_Ext rebookReason_Ext) {
           this.inspectionDate = inspectionDate;
           this.inspectionReason_Ext = inspectionReason_Ext;
           this.inspectionStatus_Ext = inspectionStatus_Ext;
           this.rebookReason_Ext = rebookReason_Ext;
    }


    /**
     * Gets the inspectionDate value for this VehicleIncidentServices_ExtEntryEntityInspectionRequestService_Ext.
     * 
     * @return inspectionDate
     */
    public java.util.Calendar getInspectionDate() {
        return inspectionDate;
    }


    /**
     * Sets the inspectionDate value for this VehicleIncidentServices_ExtEntryEntityInspectionRequestService_Ext.
     * 
     * @param inspectionDate
     */
    public void setInspectionDate(java.util.Calendar inspectionDate) {
        this.inspectionDate = inspectionDate;
    }


    /**
     * Gets the inspectionReason_Ext value for this VehicleIncidentServices_ExtEntryEntityInspectionRequestService_Ext.
     * 
     * @return inspectionReason_Ext
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentServices_ExtEntryEntityInspectionRequestService_ExtInspectionReason_Ext getInspectionReason_Ext() {
        return inspectionReason_Ext;
    }


    /**
     * Sets the inspectionReason_Ext value for this VehicleIncidentServices_ExtEntryEntityInspectionRequestService_Ext.
     * 
     * @param inspectionReason_Ext
     */
    public void setInspectionReason_Ext(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentServices_ExtEntryEntityInspectionRequestService_ExtInspectionReason_Ext inspectionReason_Ext) {
        this.inspectionReason_Ext = inspectionReason_Ext;
    }


    /**
     * Gets the inspectionStatus_Ext value for this VehicleIncidentServices_ExtEntryEntityInspectionRequestService_Ext.
     * 
     * @return inspectionStatus_Ext
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentServices_ExtEntryEntityInspectionRequestService_ExtInspectionStatus_Ext getInspectionStatus_Ext() {
        return inspectionStatus_Ext;
    }


    /**
     * Sets the inspectionStatus_Ext value for this VehicleIncidentServices_ExtEntryEntityInspectionRequestService_Ext.
     * 
     * @param inspectionStatus_Ext
     */
    public void setInspectionStatus_Ext(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentServices_ExtEntryEntityInspectionRequestService_ExtInspectionStatus_Ext inspectionStatus_Ext) {
        this.inspectionStatus_Ext = inspectionStatus_Ext;
    }


    /**
     * Gets the rebookReason_Ext value for this VehicleIncidentServices_ExtEntryEntityInspectionRequestService_Ext.
     * 
     * @return rebookReason_Ext
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentServices_ExtEntryEntityInspectionRequestService_ExtRebookReason_Ext getRebookReason_Ext() {
        return rebookReason_Ext;
    }


    /**
     * Sets the rebookReason_Ext value for this VehicleIncidentServices_ExtEntryEntityInspectionRequestService_Ext.
     * 
     * @param rebookReason_Ext
     */
    public void setRebookReason_Ext(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentServices_ExtEntryEntityInspectionRequestService_ExtRebookReason_Ext rebookReason_Ext) {
        this.rebookReason_Ext = rebookReason_Ext;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehicleIncidentServices_ExtEntryEntityInspectionRequestService_Ext)) return false;
        VehicleIncidentServices_ExtEntryEntityInspectionRequestService_Ext other = (VehicleIncidentServices_ExtEntryEntityInspectionRequestService_Ext) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inspectionDate==null && other.getInspectionDate()==null) || 
             (this.inspectionDate!=null &&
              this.inspectionDate.equals(other.getInspectionDate()))) &&
            ((this.inspectionReason_Ext==null && other.getInspectionReason_Ext()==null) || 
             (this.inspectionReason_Ext!=null &&
              this.inspectionReason_Ext.equals(other.getInspectionReason_Ext()))) &&
            ((this.inspectionStatus_Ext==null && other.getInspectionStatus_Ext()==null) || 
             (this.inspectionStatus_Ext!=null &&
              this.inspectionStatus_Ext.equals(other.getInspectionStatus_Ext()))) &&
            ((this.rebookReason_Ext==null && other.getRebookReason_Ext()==null) || 
             (this.rebookReason_Ext!=null &&
              this.rebookReason_Ext.equals(other.getRebookReason_Ext())));
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
        if (getInspectionDate() != null) {
            _hashCode += getInspectionDate().hashCode();
        }
        if (getInspectionReason_Ext() != null) {
            _hashCode += getInspectionReason_Ext().hashCode();
        }
        if (getInspectionStatus_Ext() != null) {
            _hashCode += getInspectionStatus_Ext().hashCode();
        }
        if (getRebookReason_Ext() != null) {
            _hashCode += getRebookReason_Ext().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VehicleIncidentServices_ExtEntryEntityInspectionRequestService_Ext.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>VehicleIncident>Services_Ext>Entry>entity-InspectionRequestService_Ext"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inspectionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "InspectionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inspectionReason_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "InspectionReason_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>>VehicleIncident>Services_Ext>Entry>entity-InspectionRequestService_Ext>InspectionReason_Ext"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inspectionStatus_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "InspectionStatus_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>>VehicleIncident>Services_Ext>Entry>entity-InspectionRequestService_Ext>InspectionStatus_Ext"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rebookReason_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "RebookReason_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>>VehicleIncident>Services_Ext>Entry>entity-InspectionRequestService_Ext>RebookReason_Ext"));
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
