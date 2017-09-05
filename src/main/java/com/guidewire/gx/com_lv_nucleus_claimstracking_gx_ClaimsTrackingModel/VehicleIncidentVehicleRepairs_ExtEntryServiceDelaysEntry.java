/**
 * VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel;

public class VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntry  implements java.io.Serializable {
    private java.util.Calendar actualResolutionDate;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntryDelayType delayType;

    private java.util.Calendar expectedResolutionDate;

    private java.util.Calendar notificationDate;

    private java.lang.String action;  // attribute

    public VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntry() {
    }

    public VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntry(
           java.util.Calendar actualResolutionDate,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntryDelayType delayType,
           java.util.Calendar expectedResolutionDate,
           java.util.Calendar notificationDate,
           java.lang.String action) {
           this.actualResolutionDate = actualResolutionDate;
           this.delayType = delayType;
           this.expectedResolutionDate = expectedResolutionDate;
           this.notificationDate = notificationDate;
           this.action = action;
    }


    /**
     * Gets the actualResolutionDate value for this VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntry.
     * 
     * @return actualResolutionDate
     */
    public java.util.Calendar getActualResolutionDate() {
        return actualResolutionDate;
    }


    /**
     * Sets the actualResolutionDate value for this VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntry.
     * 
     * @param actualResolutionDate
     */
    public void setActualResolutionDate(java.util.Calendar actualResolutionDate) {
        this.actualResolutionDate = actualResolutionDate;
    }


    /**
     * Gets the delayType value for this VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntry.
     * 
     * @return delayType
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntryDelayType getDelayType() {
        return delayType;
    }


    /**
     * Sets the delayType value for this VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntry.
     * 
     * @param delayType
     */
    public void setDelayType(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntryDelayType delayType) {
        this.delayType = delayType;
    }


    /**
     * Gets the expectedResolutionDate value for this VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntry.
     * 
     * @return expectedResolutionDate
     */
    public java.util.Calendar getExpectedResolutionDate() {
        return expectedResolutionDate;
    }


    /**
     * Sets the expectedResolutionDate value for this VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntry.
     * 
     * @param expectedResolutionDate
     */
    public void setExpectedResolutionDate(java.util.Calendar expectedResolutionDate) {
        this.expectedResolutionDate = expectedResolutionDate;
    }


    /**
     * Gets the notificationDate value for this VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntry.
     * 
     * @return notificationDate
     */
    public java.util.Calendar getNotificationDate() {
        return notificationDate;
    }


    /**
     * Sets the notificationDate value for this VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntry.
     * 
     * @param notificationDate
     */
    public void setNotificationDate(java.util.Calendar notificationDate) {
        this.notificationDate = notificationDate;
    }


    /**
     * Gets the action value for this VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntry.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntry.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntry)) return false;
        VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntry other = (VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actualResolutionDate==null && other.getActualResolutionDate()==null) || 
             (this.actualResolutionDate!=null &&
              this.actualResolutionDate.equals(other.getActualResolutionDate()))) &&
            ((this.delayType==null && other.getDelayType()==null) || 
             (this.delayType!=null &&
              this.delayType.equals(other.getDelayType()))) &&
            ((this.expectedResolutionDate==null && other.getExpectedResolutionDate()==null) || 
             (this.expectedResolutionDate!=null &&
              this.expectedResolutionDate.equals(other.getExpectedResolutionDate()))) &&
            ((this.notificationDate==null && other.getNotificationDate()==null) || 
             (this.notificationDate!=null &&
              this.notificationDate.equals(other.getNotificationDate()))) &&
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
        if (getActualResolutionDate() != null) {
            _hashCode += getActualResolutionDate().hashCode();
        }
        if (getDelayType() != null) {
            _hashCode += getDelayType().hashCode();
        }
        if (getExpectedResolutionDate() != null) {
            _hashCode += getExpectedResolutionDate().hashCode();
        }
        if (getNotificationDate() != null) {
            _hashCode += getNotificationDate().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>>VehicleIncident>VehicleRepairs_Ext>Entry>ServiceDelays>Entry"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("action");
        attrField.setXmlName(new javax.xml.namespace.QName("", "action"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualResolutionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "ActualResolutionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delayType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "DelayType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>>>VehicleIncident>VehicleRepairs_Ext>Entry>ServiceDelays>Entry>DelayType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedResolutionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "ExpectedResolutionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "NotificationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
