/**
 * VehicleIncidentServices_ExtEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel;

public class VehicleIncidentServices_ExtEntry  implements java.io.Serializable {
    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentServices_ExtEntryEntityInspectionRequestService_Ext entityInspectionRequestService_Ext;

    private java.lang.String action;  // attribute

    public VehicleIncidentServices_ExtEntry() {
    }

    public VehicleIncidentServices_ExtEntry(
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentServices_ExtEntryEntityInspectionRequestService_Ext entityInspectionRequestService_Ext,
           java.lang.String action) {
           this.entityInspectionRequestService_Ext = entityInspectionRequestService_Ext;
           this.action = action;
    }


    /**
     * Gets the entityInspectionRequestService_Ext value for this VehicleIncidentServices_ExtEntry.
     * 
     * @return entityInspectionRequestService_Ext
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentServices_ExtEntryEntityInspectionRequestService_Ext getEntityInspectionRequestService_Ext() {
        return entityInspectionRequestService_Ext;
    }


    /**
     * Sets the entityInspectionRequestService_Ext value for this VehicleIncidentServices_ExtEntry.
     * 
     * @param entityInspectionRequestService_Ext
     */
    public void setEntityInspectionRequestService_Ext(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentServices_ExtEntryEntityInspectionRequestService_Ext entityInspectionRequestService_Ext) {
        this.entityInspectionRequestService_Ext = entityInspectionRequestService_Ext;
    }


    /**
     * Gets the action value for this VehicleIncidentServices_ExtEntry.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this VehicleIncidentServices_ExtEntry.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehicleIncidentServices_ExtEntry)) return false;
        VehicleIncidentServices_ExtEntry other = (VehicleIncidentServices_ExtEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entityInspectionRequestService_Ext==null && other.getEntityInspectionRequestService_Ext()==null) || 
             (this.entityInspectionRequestService_Ext!=null &&
              this.entityInspectionRequestService_Ext.equals(other.getEntityInspectionRequestService_Ext()))) &&
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
        if (getEntityInspectionRequestService_Ext() != null) {
            _hashCode += getEntityInspectionRequestService_Ext().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VehicleIncidentServices_ExtEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>VehicleIncident>Services_Ext>Entry"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("action");
        attrField.setXmlName(new javax.xml.namespace.QName("", "action"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityInspectionRequestService_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "entity-InspectionRequestService_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>VehicleIncident>Services_Ext>Entry>entity-InspectionRequestService_Ext"));
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
