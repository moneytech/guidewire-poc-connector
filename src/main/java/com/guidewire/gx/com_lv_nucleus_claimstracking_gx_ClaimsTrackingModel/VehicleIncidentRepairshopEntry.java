/**
 * VehicleIncidentRepairshopEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel;

public class VehicleIncidentRepairshopEntry  implements java.io.Serializable {
    private java.lang.Boolean networkRepairerFlag_Ext;

    private java.lang.String action;  // attribute

    public VehicleIncidentRepairshopEntry() {
    }

    public VehicleIncidentRepairshopEntry(
           java.lang.Boolean networkRepairerFlag_Ext,
           java.lang.String action) {
           this.networkRepairerFlag_Ext = networkRepairerFlag_Ext;
           this.action = action;
    }


    /**
     * Gets the networkRepairerFlag_Ext value for this VehicleIncidentRepairshopEntry.
     * 
     * @return networkRepairerFlag_Ext
     */
    public java.lang.Boolean getNetworkRepairerFlag_Ext() {
        return networkRepairerFlag_Ext;
    }


    /**
     * Sets the networkRepairerFlag_Ext value for this VehicleIncidentRepairshopEntry.
     * 
     * @param networkRepairerFlag_Ext
     */
    public void setNetworkRepairerFlag_Ext(java.lang.Boolean networkRepairerFlag_Ext) {
        this.networkRepairerFlag_Ext = networkRepairerFlag_Ext;
    }


    /**
     * Gets the action value for this VehicleIncidentRepairshopEntry.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this VehicleIncidentRepairshopEntry.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehicleIncidentRepairshopEntry)) return false;
        VehicleIncidentRepairshopEntry other = (VehicleIncidentRepairshopEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.networkRepairerFlag_Ext==null && other.getNetworkRepairerFlag_Ext()==null) || 
             (this.networkRepairerFlag_Ext!=null &&
              this.networkRepairerFlag_Ext.equals(other.getNetworkRepairerFlag_Ext()))) &&
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
        if (getNetworkRepairerFlag_Ext() != null) {
            _hashCode += getNetworkRepairerFlag_Ext().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VehicleIncidentRepairshopEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>VehicleIncident>repairshop>Entry"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("action");
        attrField.setXmlName(new javax.xml.namespace.QName("", "action"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkRepairerFlag_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "NetworkRepairerFlag_Ext"));
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
