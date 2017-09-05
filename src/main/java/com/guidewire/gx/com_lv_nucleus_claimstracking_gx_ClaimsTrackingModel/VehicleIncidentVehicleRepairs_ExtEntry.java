/**
 * VehicleIncidentVehicleRepairs_ExtEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel;

public class VehicleIncidentVehicleRepairs_ExtEntry  implements java.io.Serializable {
    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryCancellationReason cancellationReason;

    private java.lang.String closedByAndDate;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryClosureReason closureReason;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryRejectionReason rejectionReason;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryRepairDatesEntry[] repairDates;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryRepairerContact repairerContact;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntry[] serviceDelays;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryServiceStatus serviceStatus;

    private java.lang.String action;  // attribute

    public VehicleIncidentVehicleRepairs_ExtEntry() {
    }

    public VehicleIncidentVehicleRepairs_ExtEntry(
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryCancellationReason cancellationReason,
           java.lang.String closedByAndDate,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryClosureReason closureReason,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryRejectionReason rejectionReason,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryRepairDatesEntry[] repairDates,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryRepairerContact repairerContact,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntry[] serviceDelays,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryServiceStatus serviceStatus,
           java.lang.String action) {
           this.cancellationReason = cancellationReason;
           this.closedByAndDate = closedByAndDate;
           this.closureReason = closureReason;
           this.rejectionReason = rejectionReason;
           this.repairDates = repairDates;
           this.repairerContact = repairerContact;
           this.serviceDelays = serviceDelays;
           this.serviceStatus = serviceStatus;
           this.action = action;
    }


    /**
     * Gets the cancellationReason value for this VehicleIncidentVehicleRepairs_ExtEntry.
     * 
     * @return cancellationReason
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryCancellationReason getCancellationReason() {
        return cancellationReason;
    }


    /**
     * Sets the cancellationReason value for this VehicleIncidentVehicleRepairs_ExtEntry.
     * 
     * @param cancellationReason
     */
    public void setCancellationReason(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryCancellationReason cancellationReason) {
        this.cancellationReason = cancellationReason;
    }


    /**
     * Gets the closedByAndDate value for this VehicleIncidentVehicleRepairs_ExtEntry.
     * 
     * @return closedByAndDate
     */
    public java.lang.String getClosedByAndDate() {
        return closedByAndDate;
    }


    /**
     * Sets the closedByAndDate value for this VehicleIncidentVehicleRepairs_ExtEntry.
     * 
     * @param closedByAndDate
     */
    public void setClosedByAndDate(java.lang.String closedByAndDate) {
        this.closedByAndDate = closedByAndDate;
    }


    /**
     * Gets the closureReason value for this VehicleIncidentVehicleRepairs_ExtEntry.
     * 
     * @return closureReason
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryClosureReason getClosureReason() {
        return closureReason;
    }


    /**
     * Sets the closureReason value for this VehicleIncidentVehicleRepairs_ExtEntry.
     * 
     * @param closureReason
     */
    public void setClosureReason(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryClosureReason closureReason) {
        this.closureReason = closureReason;
    }


    /**
     * Gets the rejectionReason value for this VehicleIncidentVehicleRepairs_ExtEntry.
     * 
     * @return rejectionReason
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryRejectionReason getRejectionReason() {
        return rejectionReason;
    }


    /**
     * Sets the rejectionReason value for this VehicleIncidentVehicleRepairs_ExtEntry.
     * 
     * @param rejectionReason
     */
    public void setRejectionReason(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryRejectionReason rejectionReason) {
        this.rejectionReason = rejectionReason;
    }


    /**
     * Gets the repairDates value for this VehicleIncidentVehicleRepairs_ExtEntry.
     * 
     * @return repairDates
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryRepairDatesEntry[] getRepairDates() {
        return repairDates;
    }


    /**
     * Sets the repairDates value for this VehicleIncidentVehicleRepairs_ExtEntry.
     * 
     * @param repairDates
     */
    public void setRepairDates(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryRepairDatesEntry[] repairDates) {
        this.repairDates = repairDates;
    }


    /**
     * Gets the repairerContact value for this VehicleIncidentVehicleRepairs_ExtEntry.
     * 
     * @return repairerContact
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryRepairerContact getRepairerContact() {
        return repairerContact;
    }


    /**
     * Sets the repairerContact value for this VehicleIncidentVehicleRepairs_ExtEntry.
     * 
     * @param repairerContact
     */
    public void setRepairerContact(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryRepairerContact repairerContact) {
        this.repairerContact = repairerContact;
    }


    /**
     * Gets the serviceDelays value for this VehicleIncidentVehicleRepairs_ExtEntry.
     * 
     * @return serviceDelays
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntry[] getServiceDelays() {
        return serviceDelays;
    }


    /**
     * Sets the serviceDelays value for this VehicleIncidentVehicleRepairs_ExtEntry.
     * 
     * @param serviceDelays
     */
    public void setServiceDelays(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryServiceDelaysEntry[] serviceDelays) {
        this.serviceDelays = serviceDelays;
    }


    /**
     * Gets the serviceStatus value for this VehicleIncidentVehicleRepairs_ExtEntry.
     * 
     * @return serviceStatus
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryServiceStatus getServiceStatus() {
        return serviceStatus;
    }


    /**
     * Sets the serviceStatus value for this VehicleIncidentVehicleRepairs_ExtEntry.
     * 
     * @param serviceStatus
     */
    public void setServiceStatus(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntryServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
    }


    /**
     * Gets the action value for this VehicleIncidentVehicleRepairs_ExtEntry.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this VehicleIncidentVehicleRepairs_ExtEntry.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehicleIncidentVehicleRepairs_ExtEntry)) return false;
        VehicleIncidentVehicleRepairs_ExtEntry other = (VehicleIncidentVehicleRepairs_ExtEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cancellationReason==null && other.getCancellationReason()==null) || 
             (this.cancellationReason!=null &&
              this.cancellationReason.equals(other.getCancellationReason()))) &&
            ((this.closedByAndDate==null && other.getClosedByAndDate()==null) || 
             (this.closedByAndDate!=null &&
              this.closedByAndDate.equals(other.getClosedByAndDate()))) &&
            ((this.closureReason==null && other.getClosureReason()==null) || 
             (this.closureReason!=null &&
              this.closureReason.equals(other.getClosureReason()))) &&
            ((this.rejectionReason==null && other.getRejectionReason()==null) || 
             (this.rejectionReason!=null &&
              this.rejectionReason.equals(other.getRejectionReason()))) &&
            ((this.repairDates==null && other.getRepairDates()==null) || 
             (this.repairDates!=null &&
              java.util.Arrays.equals(this.repairDates, other.getRepairDates()))) &&
            ((this.repairerContact==null && other.getRepairerContact()==null) || 
             (this.repairerContact!=null &&
              this.repairerContact.equals(other.getRepairerContact()))) &&
            ((this.serviceDelays==null && other.getServiceDelays()==null) || 
             (this.serviceDelays!=null &&
              java.util.Arrays.equals(this.serviceDelays, other.getServiceDelays()))) &&
            ((this.serviceStatus==null && other.getServiceStatus()==null) || 
             (this.serviceStatus!=null &&
              this.serviceStatus.equals(other.getServiceStatus()))) &&
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
        if (getCancellationReason() != null) {
            _hashCode += getCancellationReason().hashCode();
        }
        if (getClosedByAndDate() != null) {
            _hashCode += getClosedByAndDate().hashCode();
        }
        if (getClosureReason() != null) {
            _hashCode += getClosureReason().hashCode();
        }
        if (getRejectionReason() != null) {
            _hashCode += getRejectionReason().hashCode();
        }
        if (getRepairDates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRepairDates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRepairDates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRepairerContact() != null) {
            _hashCode += getRepairerContact().hashCode();
        }
        if (getServiceDelays() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceDelays());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceDelays(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceStatus() != null) {
            _hashCode += getServiceStatus().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VehicleIncidentVehicleRepairs_ExtEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>VehicleIncident>VehicleRepairs_Ext>Entry"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("action");
        attrField.setXmlName(new javax.xml.namespace.QName("", "action"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancellationReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "CancellationReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>VehicleIncident>VehicleRepairs_Ext>Entry>CancellationReason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedByAndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "closedByAndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closureReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "ClosureReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>VehicleIncident>VehicleRepairs_Ext>Entry>ClosureReason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectionReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "RejectionReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>VehicleIncident>VehicleRepairs_Ext>Entry>RejectionReason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repairDates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "RepairDates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>>VehicleIncident>VehicleRepairs_Ext>Entry>RepairDates>Entry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "Entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repairerContact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "RepairerContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>VehicleIncident>VehicleRepairs_Ext>Entry>RepairerContact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceDelays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "ServiceDelays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>>VehicleIncident>VehicleRepairs_Ext>Entry>ServiceDelays>Entry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "Entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "ServiceStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>>VehicleIncident>VehicleRepairs_Ext>Entry>ServiceStatus"));
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
