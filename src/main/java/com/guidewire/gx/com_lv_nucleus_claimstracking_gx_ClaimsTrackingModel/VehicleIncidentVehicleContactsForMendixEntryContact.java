/**
 * VehicleIncidentVehicleContactsForMendixEntryContact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel;

public class VehicleIncidentVehicleContactsForMendixEntryContact  implements java.io.Serializable {
    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleContactsForMendixEntryContactEntityPerson entityPerson;

    private java.lang.String emailAddress1;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleContactsForMendixEntryContactPrimaryAddress primaryAddress;

    private java.lang.String primaryPhoneValue;

    public VehicleIncidentVehicleContactsForMendixEntryContact() {
    }

    public VehicleIncidentVehicleContactsForMendixEntryContact(
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleContactsForMendixEntryContactEntityPerson entityPerson,
           java.lang.String emailAddress1,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleContactsForMendixEntryContactPrimaryAddress primaryAddress,
           java.lang.String primaryPhoneValue) {
           this.entityPerson = entityPerson;
           this.emailAddress1 = emailAddress1;
           this.primaryAddress = primaryAddress;
           this.primaryPhoneValue = primaryPhoneValue;
    }


    /**
     * Gets the entityPerson value for this VehicleIncidentVehicleContactsForMendixEntryContact.
     * 
     * @return entityPerson
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleContactsForMendixEntryContactEntityPerson getEntityPerson() {
        return entityPerson;
    }


    /**
     * Sets the entityPerson value for this VehicleIncidentVehicleContactsForMendixEntryContact.
     * 
     * @param entityPerson
     */
    public void setEntityPerson(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleContactsForMendixEntryContactEntityPerson entityPerson) {
        this.entityPerson = entityPerson;
    }


    /**
     * Gets the emailAddress1 value for this VehicleIncidentVehicleContactsForMendixEntryContact.
     * 
     * @return emailAddress1
     */
    public java.lang.String getEmailAddress1() {
        return emailAddress1;
    }


    /**
     * Sets the emailAddress1 value for this VehicleIncidentVehicleContactsForMendixEntryContact.
     * 
     * @param emailAddress1
     */
    public void setEmailAddress1(java.lang.String emailAddress1) {
        this.emailAddress1 = emailAddress1;
    }


    /**
     * Gets the primaryAddress value for this VehicleIncidentVehicleContactsForMendixEntryContact.
     * 
     * @return primaryAddress
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleContactsForMendixEntryContactPrimaryAddress getPrimaryAddress() {
        return primaryAddress;
    }


    /**
     * Sets the primaryAddress value for this VehicleIncidentVehicleContactsForMendixEntryContact.
     * 
     * @param primaryAddress
     */
    public void setPrimaryAddress(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleContactsForMendixEntryContactPrimaryAddress primaryAddress) {
        this.primaryAddress = primaryAddress;
    }


    /**
     * Gets the primaryPhoneValue value for this VehicleIncidentVehicleContactsForMendixEntryContact.
     * 
     * @return primaryPhoneValue
     */
    public java.lang.String getPrimaryPhoneValue() {
        return primaryPhoneValue;
    }


    /**
     * Sets the primaryPhoneValue value for this VehicleIncidentVehicleContactsForMendixEntryContact.
     * 
     * @param primaryPhoneValue
     */
    public void setPrimaryPhoneValue(java.lang.String primaryPhoneValue) {
        this.primaryPhoneValue = primaryPhoneValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehicleIncidentVehicleContactsForMendixEntryContact)) return false;
        VehicleIncidentVehicleContactsForMendixEntryContact other = (VehicleIncidentVehicleContactsForMendixEntryContact) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entityPerson==null && other.getEntityPerson()==null) || 
             (this.entityPerson!=null &&
              this.entityPerson.equals(other.getEntityPerson()))) &&
            ((this.emailAddress1==null && other.getEmailAddress1()==null) || 
             (this.emailAddress1!=null &&
              this.emailAddress1.equals(other.getEmailAddress1()))) &&
            ((this.primaryAddress==null && other.getPrimaryAddress()==null) || 
             (this.primaryAddress!=null &&
              this.primaryAddress.equals(other.getPrimaryAddress()))) &&
            ((this.primaryPhoneValue==null && other.getPrimaryPhoneValue()==null) || 
             (this.primaryPhoneValue!=null &&
              this.primaryPhoneValue.equals(other.getPrimaryPhoneValue())));
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
        if (getEntityPerson() != null) {
            _hashCode += getEntityPerson().hashCode();
        }
        if (getEmailAddress1() != null) {
            _hashCode += getEmailAddress1().hashCode();
        }
        if (getPrimaryAddress() != null) {
            _hashCode += getPrimaryAddress().hashCode();
        }
        if (getPrimaryPhoneValue() != null) {
            _hashCode += getPrimaryPhoneValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VehicleIncidentVehicleContactsForMendixEntryContact.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>VehicleIncident>VehicleContactsForMendix>Entry>Contact"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityPerson");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "entity-Person"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>>VehicleIncident>VehicleContactsForMendix>Entry>Contact>entity-Person"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "EmailAddress1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "PrimaryAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>>VehicleIncident>VehicleContactsForMendix>Entry>Contact>PrimaryAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryPhoneValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "PrimaryPhoneValue"));
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
