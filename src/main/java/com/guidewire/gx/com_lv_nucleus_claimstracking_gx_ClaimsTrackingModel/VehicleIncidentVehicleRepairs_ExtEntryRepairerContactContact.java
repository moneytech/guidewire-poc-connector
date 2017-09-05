/**
 * VehicleIncidentVehicleRepairs_ExtEntryRepairerContactContact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel;

public class VehicleIncidentVehicleRepairs_ExtEntryRepairerContactContact  implements java.io.Serializable {
    private java.lang.String name;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryRepairerContactContactPrimaryAddress primaryAddress;

    private java.lang.String workPhone;

    public VehicleIncidentVehicleRepairs_ExtEntryRepairerContactContact() {
    }

    public VehicleIncidentVehicleRepairs_ExtEntryRepairerContactContact(
           java.lang.String name,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryRepairerContactContactPrimaryAddress primaryAddress,
           java.lang.String workPhone) {
           this.name = name;
           this.primaryAddress = primaryAddress;
           this.workPhone = workPhone;
    }


    /**
     * Gets the name value for this VehicleIncidentVehicleRepairs_ExtEntryRepairerContactContact.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this VehicleIncidentVehicleRepairs_ExtEntryRepairerContactContact.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the primaryAddress value for this VehicleIncidentVehicleRepairs_ExtEntryRepairerContactContact.
     * 
     * @return primaryAddress
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryRepairerContactContactPrimaryAddress getPrimaryAddress() {
        return primaryAddress;
    }


    /**
     * Sets the primaryAddress value for this VehicleIncidentVehicleRepairs_ExtEntryRepairerContactContact.
     * 
     * @param primaryAddress
     */
    public void setPrimaryAddress(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryRepairerContactContactPrimaryAddress primaryAddress) {
        this.primaryAddress = primaryAddress;
    }


    /**
     * Gets the workPhone value for this VehicleIncidentVehicleRepairs_ExtEntryRepairerContactContact.
     * 
     * @return workPhone
     */
    public java.lang.String getWorkPhone() {
        return workPhone;
    }


    /**
     * Sets the workPhone value for this VehicleIncidentVehicleRepairs_ExtEntryRepairerContactContact.
     * 
     * @param workPhone
     */
    public void setWorkPhone(java.lang.String workPhone) {
        this.workPhone = workPhone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehicleIncidentVehicleRepairs_ExtEntryRepairerContactContact)) return false;
        VehicleIncidentVehicleRepairs_ExtEntryRepairerContactContact other = (VehicleIncidentVehicleRepairs_ExtEntryRepairerContactContact) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.primaryAddress==null && other.getPrimaryAddress()==null) || 
             (this.primaryAddress!=null &&
              this.primaryAddress.equals(other.getPrimaryAddress()))) &&
            ((this.workPhone==null && other.getWorkPhone()==null) || 
             (this.workPhone!=null &&
              this.workPhone.equals(other.getWorkPhone())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPrimaryAddress() != null) {
            _hashCode += getPrimaryAddress().hashCode();
        }
        if (getWorkPhone() != null) {
            _hashCode += getWorkPhone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VehicleIncidentVehicleRepairs_ExtEntryRepairerContactContact.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>>VehicleIncident>VehicleRepairs_Ext>Entry>RepairerContact>Contact"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "PrimaryAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>>>VehicleIncident>VehicleRepairs_Ext>Entry>RepairerContact>Contact>PrimaryAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "WorkPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
