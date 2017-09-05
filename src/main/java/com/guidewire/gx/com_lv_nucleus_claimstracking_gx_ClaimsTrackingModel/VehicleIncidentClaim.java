/**
 * VehicleIncidentClaim.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel;

public class VehicleIncidentClaim  implements java.io.Serializable {
    private java.util.Calendar detailsValidatedDate_Ext;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentClaimID ID;

    private java.lang.Boolean liabilityAgreed_Ext;

    private java.util.Calendar lossDate;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentClaimLVFaultRatingView LVFaultRatingView;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentClaimNCDImpact_Ext NCDImpact_Ext;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentClaimPolicy policy;

    private java.util.Calendar reportedDate;

    public VehicleIncidentClaim() {
    }

    public VehicleIncidentClaim(
           java.util.Calendar detailsValidatedDate_Ext,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentClaimID ID,
           java.lang.Boolean liabilityAgreed_Ext,
           java.util.Calendar lossDate,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentClaimLVFaultRatingView LVFaultRatingView,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentClaimNCDImpact_Ext NCDImpact_Ext,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentClaimPolicy policy,
           java.util.Calendar reportedDate) {
           this.detailsValidatedDate_Ext = detailsValidatedDate_Ext;
           this.ID = ID;
           this.liabilityAgreed_Ext = liabilityAgreed_Ext;
           this.lossDate = lossDate;
           this.LVFaultRatingView = LVFaultRatingView;
           this.NCDImpact_Ext = NCDImpact_Ext;
           this.policy = policy;
           this.reportedDate = reportedDate;
    }


    /**
     * Gets the detailsValidatedDate_Ext value for this VehicleIncidentClaim.
     * 
     * @return detailsValidatedDate_Ext
     */
    public java.util.Calendar getDetailsValidatedDate_Ext() {
        return detailsValidatedDate_Ext;
    }


    /**
     * Sets the detailsValidatedDate_Ext value for this VehicleIncidentClaim.
     * 
     * @param detailsValidatedDate_Ext
     */
    public void setDetailsValidatedDate_Ext(java.util.Calendar detailsValidatedDate_Ext) {
        this.detailsValidatedDate_Ext = detailsValidatedDate_Ext;
    }


    /**
     * Gets the ID value for this VehicleIncidentClaim.
     * 
     * @return ID
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentClaimID getID() {
        return ID;
    }


    /**
     * Sets the ID value for this VehicleIncidentClaim.
     * 
     * @param ID
     */
    public void setID(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentClaimID ID) {
        this.ID = ID;
    }


    /**
     * Gets the liabilityAgreed_Ext value for this VehicleIncidentClaim.
     * 
     * @return liabilityAgreed_Ext
     */
    public java.lang.Boolean getLiabilityAgreed_Ext() {
        return liabilityAgreed_Ext;
    }


    /**
     * Sets the liabilityAgreed_Ext value for this VehicleIncidentClaim.
     * 
     * @param liabilityAgreed_Ext
     */
    public void setLiabilityAgreed_Ext(java.lang.Boolean liabilityAgreed_Ext) {
        this.liabilityAgreed_Ext = liabilityAgreed_Ext;
    }


    /**
     * Gets the lossDate value for this VehicleIncidentClaim.
     * 
     * @return lossDate
     */
    public java.util.Calendar getLossDate() {
        return lossDate;
    }


    /**
     * Sets the lossDate value for this VehicleIncidentClaim.
     * 
     * @param lossDate
     */
    public void setLossDate(java.util.Calendar lossDate) {
        this.lossDate = lossDate;
    }


    /**
     * Gets the LVFaultRatingView value for this VehicleIncidentClaim.
     * 
     * @return LVFaultRatingView
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentClaimLVFaultRatingView getLVFaultRatingView() {
        return LVFaultRatingView;
    }


    /**
     * Sets the LVFaultRatingView value for this VehicleIncidentClaim.
     * 
     * @param LVFaultRatingView
     */
    public void setLVFaultRatingView(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentClaimLVFaultRatingView LVFaultRatingView) {
        this.LVFaultRatingView = LVFaultRatingView;
    }


    /**
     * Gets the NCDImpact_Ext value for this VehicleIncidentClaim.
     * 
     * @return NCDImpact_Ext
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentClaimNCDImpact_Ext getNCDImpact_Ext() {
        return NCDImpact_Ext;
    }


    /**
     * Sets the NCDImpact_Ext value for this VehicleIncidentClaim.
     * 
     * @param NCDImpact_Ext
     */
    public void setNCDImpact_Ext(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentClaimNCDImpact_Ext NCDImpact_Ext) {
        this.NCDImpact_Ext = NCDImpact_Ext;
    }


    /**
     * Gets the policy value for this VehicleIncidentClaim.
     * 
     * @return policy
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentClaimPolicy getPolicy() {
        return policy;
    }


    /**
     * Sets the policy value for this VehicleIncidentClaim.
     * 
     * @param policy
     */
    public void setPolicy(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncidentClaimPolicy policy) {
        this.policy = policy;
    }


    /**
     * Gets the reportedDate value for this VehicleIncidentClaim.
     * 
     * @return reportedDate
     */
    public java.util.Calendar getReportedDate() {
        return reportedDate;
    }


    /**
     * Sets the reportedDate value for this VehicleIncidentClaim.
     * 
     * @param reportedDate
     */
    public void setReportedDate(java.util.Calendar reportedDate) {
        this.reportedDate = reportedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehicleIncidentClaim)) return false;
        VehicleIncidentClaim other = (VehicleIncidentClaim) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.detailsValidatedDate_Ext==null && other.getDetailsValidatedDate_Ext()==null) || 
             (this.detailsValidatedDate_Ext!=null &&
              this.detailsValidatedDate_Ext.equals(other.getDetailsValidatedDate_Ext()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.liabilityAgreed_Ext==null && other.getLiabilityAgreed_Ext()==null) || 
             (this.liabilityAgreed_Ext!=null &&
              this.liabilityAgreed_Ext.equals(other.getLiabilityAgreed_Ext()))) &&
            ((this.lossDate==null && other.getLossDate()==null) || 
             (this.lossDate!=null &&
              this.lossDate.equals(other.getLossDate()))) &&
            ((this.LVFaultRatingView==null && other.getLVFaultRatingView()==null) || 
             (this.LVFaultRatingView!=null &&
              this.LVFaultRatingView.equals(other.getLVFaultRatingView()))) &&
            ((this.NCDImpact_Ext==null && other.getNCDImpact_Ext()==null) || 
             (this.NCDImpact_Ext!=null &&
              this.NCDImpact_Ext.equals(other.getNCDImpact_Ext()))) &&
            ((this.policy==null && other.getPolicy()==null) || 
             (this.policy!=null &&
              this.policy.equals(other.getPolicy()))) &&
            ((this.reportedDate==null && other.getReportedDate()==null) || 
             (this.reportedDate!=null &&
              this.reportedDate.equals(other.getReportedDate())));
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
        if (getDetailsValidatedDate_Ext() != null) {
            _hashCode += getDetailsValidatedDate_Ext().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getLiabilityAgreed_Ext() != null) {
            _hashCode += getLiabilityAgreed_Ext().hashCode();
        }
        if (getLossDate() != null) {
            _hashCode += getLossDate().hashCode();
        }
        if (getLVFaultRatingView() != null) {
            _hashCode += getLVFaultRatingView().hashCode();
        }
        if (getNCDImpact_Ext() != null) {
            _hashCode += getNCDImpact_Ext().hashCode();
        }
        if (getPolicy() != null) {
            _hashCode += getPolicy().hashCode();
        }
        if (getReportedDate() != null) {
            _hashCode += getReportedDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VehicleIncidentClaim.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">VehicleIncident>Claim"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailsValidatedDate_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "DetailsValidatedDate_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>VehicleIncident>Claim>ID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liabilityAgreed_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "LiabilityAgreed_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lossDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "LossDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LVFaultRatingView");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "LVFaultRatingView"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>VehicleIncident>Claim>LVFaultRatingView"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NCDImpact_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "NCDImpact_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>VehicleIncident>Claim>NCDImpact_Ext"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "Policy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", ">>VehicleIncident>Claim>Policy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "ReportedDate"));
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
