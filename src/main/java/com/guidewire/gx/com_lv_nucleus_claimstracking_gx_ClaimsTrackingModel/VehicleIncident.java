/**
 * VehicleIncident.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel;

public class VehicleIncident  implements java.io.Serializable {
    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentClaim claim;

    private java.lang.Boolean customerCCEntitled_Ext;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentExposuresEntry[] exposures;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentRepairshopEntry[] repairshop;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentServices_ExtEntry[] services_Ext;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentValuationReports_ExtEntry[] valuationReports_Ext;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicle vehicle;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleContactsForMendixEntry[] vehicleContactsForMendix;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleLossParty vehicleLossParty;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntry[] vehicleRepairs_Ext;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRU vehicleRU;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleStatus_Ext vehicleStatus_Ext;

    public VehicleIncident() {
    }

    public VehicleIncident(
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentClaim claim,
           java.lang.Boolean customerCCEntitled_Ext,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentExposuresEntry[] exposures,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentRepairshopEntry[] repairshop,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentServices_ExtEntry[] services_Ext,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentValuationReports_ExtEntry[] valuationReports_Ext,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicle vehicle,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleContactsForMendixEntry[] vehicleContactsForMendix,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleLossParty vehicleLossParty,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntry[] vehicleRepairs_Ext,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRU vehicleRU,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleStatus_Ext vehicleStatus_Ext) {
           this.claim = claim;
           this.customerCCEntitled_Ext = customerCCEntitled_Ext;
           this.exposures = exposures;
           this.repairshop = repairshop;
           this.services_Ext = services_Ext;
           this.valuationReports_Ext = valuationReports_Ext;
           this.vehicle = vehicle;
           this.vehicleContactsForMendix = vehicleContactsForMendix;
           this.vehicleLossParty = vehicleLossParty;
           this.vehicleRepairs_Ext = vehicleRepairs_Ext;
           this.vehicleRU = vehicleRU;
           this.vehicleStatus_Ext = vehicleStatus_Ext;
    }


    /**
     * Gets the claim value for this VehicleIncident.
     * 
     * @return claim
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentClaim getClaim() {
        return claim;
    }


    /**
     * Sets the claim value for this VehicleIncident.
     * 
     * @param claim
     */
    public void setClaim(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentClaim claim) {
        this.claim = claim;
    }


    /**
     * Gets the customerCCEntitled_Ext value for this VehicleIncident.
     * 
     * @return customerCCEntitled_Ext
     */
    public java.lang.Boolean getCustomerCCEntitled_Ext() {
        return customerCCEntitled_Ext;
    }


    /**
     * Sets the customerCCEntitled_Ext value for this VehicleIncident.
     * 
     * @param customerCCEntitled_Ext
     */
    public void setCustomerCCEntitled_Ext(java.lang.Boolean customerCCEntitled_Ext) {
        this.customerCCEntitled_Ext = customerCCEntitled_Ext;
    }


    /**
     * Gets the exposures value for this VehicleIncident.
     * 
     * @return exposures
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentExposuresEntry[] getExposures() {
        return exposures;
    }


    /**
     * Sets the exposures value for this VehicleIncident.
     * 
     * @param exposures
     */
    public void setExposures(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentExposuresEntry[] exposures) {
        this.exposures = exposures;
    }


    /**
     * Gets the repairshop value for this VehicleIncident.
     * 
     * @return repairshop
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentRepairshopEntry[] getRepairshop() {
        return repairshop;
    }


    /**
     * Sets the repairshop value for this VehicleIncident.
     * 
     * @param repairshop
     */
    public void setRepairshop(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentRepairshopEntry[] repairshop) {
        this.repairshop = repairshop;
    }


    /**
     * Gets the services_Ext value for this VehicleIncident.
     * 
     * @return services_Ext
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentServices_ExtEntry[] getServices_Ext() {
        return services_Ext;
    }


    /**
     * Sets the services_Ext value for this VehicleIncident.
     * 
     * @param services_Ext
     */
    public void setServices_Ext(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentServices_ExtEntry[] services_Ext) {
        this.services_Ext = services_Ext;
    }


    /**
     * Gets the valuationReports_Ext value for this VehicleIncident.
     * 
     * @return valuationReports_Ext
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentValuationReports_ExtEntry[] getValuationReports_Ext() {
        return valuationReports_Ext;
    }


    /**
     * Sets the valuationReports_Ext value for this VehicleIncident.
     * 
     * @param valuationReports_Ext
     */
    public void setValuationReports_Ext(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentValuationReports_ExtEntry[] valuationReports_Ext) {
        this.valuationReports_Ext = valuationReports_Ext;
    }


    /**
     * Gets the vehicle value for this VehicleIncident.
     * 
     * @return vehicle
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicle getVehicle() {
        return vehicle;
    }


    /**
     * Sets the vehicle value for this VehicleIncident.
     * 
     * @param vehicle
     */
    public void setVehicle(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicle vehicle) {
        this.vehicle = vehicle;
    }


    /**
     * Gets the vehicleContactsForMendix value for this VehicleIncident.
     * 
     * @return vehicleContactsForMendix
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleContactsForMendixEntry[] getVehicleContactsForMendix() {
        return vehicleContactsForMendix;
    }


    /**
     * Sets the vehicleContactsForMendix value for this VehicleIncident.
     * 
     * @param vehicleContactsForMendix
     */
    public void setVehicleContactsForMendix(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleContactsForMendixEntry[] vehicleContactsForMendix) {
        this.vehicleContactsForMendix = vehicleContactsForMendix;
    }


    /**
     * Gets the vehicleLossParty value for this VehicleIncident.
     * 
     * @return vehicleLossParty
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleLossParty getVehicleLossParty() {
        return vehicleLossParty;
    }


    /**
     * Sets the vehicleLossParty value for this VehicleIncident.
     * 
     * @param vehicleLossParty
     */
    public void setVehicleLossParty(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleLossParty vehicleLossParty) {
        this.vehicleLossParty = vehicleLossParty;
    }


    /**
     * Gets the vehicleRepairs_Ext value for this VehicleIncident.
     * 
     * @return vehicleRepairs_Ext
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntry[] getVehicleRepairs_Ext() {
        return vehicleRepairs_Ext;
    }


    /**
     * Sets the vehicleRepairs_Ext value for this VehicleIncident.
     * 
     * @param vehicleRepairs_Ext
     */
    public void setVehicleRepairs_Ext(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRepairs_ExtEntry[] vehicleRepairs_Ext) {
        this.vehicleRepairs_Ext = vehicleRepairs_Ext;
    }


    /**
     * Gets the vehicleRU value for this VehicleIncident.
     * 
     * @return vehicleRU
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRU getVehicleRU() {
        return vehicleRU;
    }


    /**
     * Sets the vehicleRU value for this VehicleIncident.
     * 
     * @param vehicleRU
     */
    public void setVehicleRU(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleRU vehicleRU) {
        this.vehicleRU = vehicleRU;
    }


    /**
     * Gets the vehicleStatus_Ext value for this VehicleIncident.
     * 
     * @return vehicleStatus_Ext
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleStatus_Ext getVehicleStatus_Ext() {
        return vehicleStatus_Ext;
    }


    /**
     * Sets the vehicleStatus_Ext value for this VehicleIncident.
     * 
     * @param vehicleStatus_Ext
     */
    public void setVehicleStatus_Ext(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentVehicleStatus_Ext vehicleStatus_Ext) {
        this.vehicleStatus_Ext = vehicleStatus_Ext;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehicleIncident)) return false;
        VehicleIncident other = (VehicleIncident) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.claim==null && other.getClaim()==null) || 
             (this.claim!=null &&
              this.claim.equals(other.getClaim()))) &&
            ((this.customerCCEntitled_Ext==null && other.getCustomerCCEntitled_Ext()==null) || 
             (this.customerCCEntitled_Ext!=null &&
              this.customerCCEntitled_Ext.equals(other.getCustomerCCEntitled_Ext()))) &&
            ((this.exposures==null && other.getExposures()==null) || 
             (this.exposures!=null &&
              java.util.Arrays.equals(this.exposures, other.getExposures()))) &&
            ((this.repairshop==null && other.getRepairshop()==null) || 
             (this.repairshop!=null &&
              java.util.Arrays.equals(this.repairshop, other.getRepairshop()))) &&
            ((this.services_Ext==null && other.getServices_Ext()==null) || 
             (this.services_Ext!=null &&
              java.util.Arrays.equals(this.services_Ext, other.getServices_Ext()))) &&
            ((this.valuationReports_Ext==null && other.getValuationReports_Ext()==null) || 
             (this.valuationReports_Ext!=null &&
              java.util.Arrays.equals(this.valuationReports_Ext, other.getValuationReports_Ext()))) &&
            ((this.vehicle==null && other.getVehicle()==null) || 
             (this.vehicle!=null &&
              this.vehicle.equals(other.getVehicle()))) &&
            ((this.vehicleContactsForMendix==null && other.getVehicleContactsForMendix()==null) || 
             (this.vehicleContactsForMendix!=null &&
              java.util.Arrays.equals(this.vehicleContactsForMendix, other.getVehicleContactsForMendix()))) &&
            ((this.vehicleLossParty==null && other.getVehicleLossParty()==null) || 
             (this.vehicleLossParty!=null &&
              this.vehicleLossParty.equals(other.getVehicleLossParty()))) &&
            ((this.vehicleRepairs_Ext==null && other.getVehicleRepairs_Ext()==null) || 
             (this.vehicleRepairs_Ext!=null &&
              java.util.Arrays.equals(this.vehicleRepairs_Ext, other.getVehicleRepairs_Ext()))) &&
            ((this.vehicleRU==null && other.getVehicleRU()==null) || 
             (this.vehicleRU!=null &&
              this.vehicleRU.equals(other.getVehicleRU()))) &&
            ((this.vehicleStatus_Ext==null && other.getVehicleStatus_Ext()==null) || 
             (this.vehicleStatus_Ext!=null &&
              this.vehicleStatus_Ext.equals(other.getVehicleStatus_Ext())));
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
        if (getClaim() != null) {
            _hashCode += getClaim().hashCode();
        }
        if (getCustomerCCEntitled_Ext() != null) {
            _hashCode += getCustomerCCEntitled_Ext().hashCode();
        }
        if (getExposures() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExposures());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExposures(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRepairshop() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRepairshop());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRepairshop(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServices_Ext() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServices_Ext());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServices_Ext(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getValuationReports_Ext() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValuationReports_Ext());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValuationReports_Ext(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVehicle() != null) {
            _hashCode += getVehicle().hashCode();
        }
        if (getVehicleContactsForMendix() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVehicleContactsForMendix());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVehicleContactsForMendix(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVehicleLossParty() != null) {
            _hashCode += getVehicleLossParty().hashCode();
        }
        if (getVehicleRepairs_Ext() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVehicleRepairs_Ext());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVehicleRepairs_Ext(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVehicleRU() != null) {
            _hashCode += getVehicleRU().hashCode();
        }
        if (getVehicleStatus_Ext() != null) {
            _hashCode += getVehicleStatus_Ext().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VehicleIncident.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "VehicleIncident"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "Claim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">VehicleIncident>Claim"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCCEntitled_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "customerCCEntitled_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exposures");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "Exposures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>VehicleIncident>Exposures>Entry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "Entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repairshop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "repairshop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>VehicleIncident>repairshop>Entry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "Entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("services_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "Services_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>VehicleIncident>Services_Ext>Entry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "Entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valuationReports_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "ValuationReports_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>VehicleIncident>ValuationReports_Ext>Entry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "Entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "Vehicle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">VehicleIncident>Vehicle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleContactsForMendix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "VehicleContactsForMendix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>VehicleIncident>VehicleContactsForMendix>Entry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "Entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleLossParty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "VehicleLossParty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">VehicleIncident>VehicleLossParty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleRepairs_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "VehicleRepairs_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>VehicleIncident>VehicleRepairs_Ext>Entry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "Entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleRU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "VehicleRU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">VehicleIncident>VehicleRU"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleStatus_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "VehicleStatus_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">VehicleIncident>VehicleStatus_Ext"));
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
