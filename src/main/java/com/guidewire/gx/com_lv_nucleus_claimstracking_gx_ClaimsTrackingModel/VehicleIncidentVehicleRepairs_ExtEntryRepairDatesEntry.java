/**
 * VehicleIncidentVehicleRepairs_ExtEntryRepairDatesEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel;

public class VehicleIncidentVehicleRepairs_ExtEntryRepairDatesEntry  implements java.io.Serializable {
    private java.util.Calendar repairDate;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryRepairDatesEntryRepairDateType repairDateType;

    private java.lang.Integer version;

    private java.lang.String action;  // attribute

    public VehicleIncidentVehicleRepairs_ExtEntryRepairDatesEntry() {
    }

    public VehicleIncidentVehicleRepairs_ExtEntryRepairDatesEntry(
           java.util.Calendar repairDate,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryRepairDatesEntryRepairDateType repairDateType,
           java.lang.Integer version,
           java.lang.String action) {
           this.repairDate = repairDate;
           this.repairDateType = repairDateType;
           this.version = version;
           this.action = action;
    }


    /**
     * Gets the repairDate value for this VehicleIncidentVehicleRepairs_ExtEntryRepairDatesEntry.
     * 
     * @return repairDate
     */
    public java.util.Calendar getRepairDate() {
        return repairDate;
    }


    /**
     * Sets the repairDate value for this VehicleIncidentVehicleRepairs_ExtEntryRepairDatesEntry.
     * 
     * @param repairDate
     */
    public void setRepairDate(java.util.Calendar repairDate) {
        this.repairDate = repairDate;
    }


    /**
     * Gets the repairDateType value for this VehicleIncidentVehicleRepairs_ExtEntryRepairDatesEntry.
     * 
     * @return repairDateType
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryRepairDatesEntryRepairDateType getRepairDateType() {
        return repairDateType;
    }


    /**
     * Sets the repairDateType value for this VehicleIncidentVehicleRepairs_ExtEntryRepairDatesEntry.
     * 
     * @param repairDateType
     */
    public void setRepairDateType(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryRepairDatesEntryRepairDateType repairDateType) {
        this.repairDateType = repairDateType;
    }


    /**
     * Gets the version value for this VehicleIncidentVehicleRepairs_ExtEntryRepairDatesEntry.
     * 
     * @return version
     */
    public java.lang.Integer getVersion() {
        return version;
    }


    /**
     * Sets the version value for this VehicleIncidentVehicleRepairs_ExtEntryRepairDatesEntry.
     * 
     * @param version
     */
    public void setVersion(java.lang.Integer version) {
        this.version = version;
    }


    /**
     * Gets the action value for this VehicleIncidentVehicleRepairs_ExtEntryRepairDatesEntry.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this VehicleIncidentVehicleRepairs_ExtEntryRepairDatesEntry.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehicleIncidentVehicleRepairs_ExtEntryRepairDatesEntry)) return false;
        VehicleIncidentVehicleRepairs_ExtEntryRepairDatesEntry other = (VehicleIncidentVehicleRepairs_ExtEntryRepairDatesEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.repairDate==null && other.getRepairDate()==null) || 
             (this.repairDate!=null &&
              this.repairDate.equals(other.getRepairDate()))) &&
            ((this.repairDateType==null && other.getRepairDateType()==null) || 
             (this.repairDateType!=null &&
              this.repairDateType.equals(other.getRepairDateType()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
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
        if (getRepairDate() != null) {
            _hashCode += getRepairDate().hashCode();
        }
        if (getRepairDateType() != null) {
            _hashCode += getRepairDateType().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VehicleIncidentVehicleRepairs_ExtEntryRepairDatesEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>>VehicleIncident>VehicleRepairs_Ext>Entry>RepairDates>Entry"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("action");
        attrField.setXmlName(new javax.xml.namespace.QName("", "action"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repairDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "RepairDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repairDateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "RepairDateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>>>VehicleIncident>VehicleRepairs_Ext>Entry>RepairDates>Entry>RepairDateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "Version"));
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
