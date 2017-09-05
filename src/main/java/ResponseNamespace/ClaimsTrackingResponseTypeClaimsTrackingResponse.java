/**
 * ClaimsTrackingResponseTypeClaimsTrackingResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ResponseNamespace;

public class ClaimsTrackingResponseTypeClaimsTrackingResponse  implements java.io.Serializable {
    private ResponseNamespace.SearchStatus searchStatus;

    private ResponseNamespace.SearchStatusReasonCode searchStatusReasonCode;

    private java.lang.String searchStatusReasonDesc;

    private com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncident matchedVehicleDetails;

    public ClaimsTrackingResponseTypeClaimsTrackingResponse() {
    }

    public ClaimsTrackingResponseTypeClaimsTrackingResponse(
           ResponseNamespace.SearchStatus searchStatus,
           ResponseNamespace.SearchStatusReasonCode searchStatusReasonCode,
           java.lang.String searchStatusReasonDesc,
           com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncident matchedVehicleDetails) {
           this.searchStatus = searchStatus;
           this.searchStatusReasonCode = searchStatusReasonCode;
           this.searchStatusReasonDesc = searchStatusReasonDesc;
           this.matchedVehicleDetails = matchedVehicleDetails;
    }


    /**
     * Gets the searchStatus value for this ClaimsTrackingResponseTypeClaimsTrackingResponse.
     * 
     * @return searchStatus
     */
    public ResponseNamespace.SearchStatus getSearchStatus() {
        return searchStatus;
    }


    /**
     * Sets the searchStatus value for this ClaimsTrackingResponseTypeClaimsTrackingResponse.
     * 
     * @param searchStatus
     */
    public void setSearchStatus(ResponseNamespace.SearchStatus searchStatus) {
        this.searchStatus = searchStatus;
    }


    /**
     * Gets the searchStatusReasonCode value for this ClaimsTrackingResponseTypeClaimsTrackingResponse.
     * 
     * @return searchStatusReasonCode
     */
    public ResponseNamespace.SearchStatusReasonCode getSearchStatusReasonCode() {
        return searchStatusReasonCode;
    }


    /**
     * Sets the searchStatusReasonCode value for this ClaimsTrackingResponseTypeClaimsTrackingResponse.
     * 
     * @param searchStatusReasonCode
     */
    public void setSearchStatusReasonCode(ResponseNamespace.SearchStatusReasonCode searchStatusReasonCode) {
        this.searchStatusReasonCode = searchStatusReasonCode;
    }


    /**
     * Gets the searchStatusReasonDesc value for this ClaimsTrackingResponseTypeClaimsTrackingResponse.
     * 
     * @return searchStatusReasonDesc
     */
    public java.lang.String getSearchStatusReasonDesc() {
        return searchStatusReasonDesc;
    }


    /**
     * Sets the searchStatusReasonDesc value for this ClaimsTrackingResponseTypeClaimsTrackingResponse.
     * 
     * @param searchStatusReasonDesc
     */
    public void setSearchStatusReasonDesc(java.lang.String searchStatusReasonDesc) {
        this.searchStatusReasonDesc = searchStatusReasonDesc;
    }


    /**
     * Gets the matchedVehicleDetails value for this ClaimsTrackingResponseTypeClaimsTrackingResponse.
     * 
     * @return matchedVehicleDetails
     */
    public com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncident getMatchedVehicleDetails() {
        return matchedVehicleDetails;
    }


    /**
     * Sets the matchedVehicleDetails value for this ClaimsTrackingResponseTypeClaimsTrackingResponse.
     * 
     * @param matchedVehicleDetails
     */
    public void setMatchedVehicleDetails(com.guidewire.gx.com_lv_nucleus_claimstracking_gx_ClaimsTrackingModel.VehicleIncident matchedVehicleDetails) {
        this.matchedVehicleDetails = matchedVehicleDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClaimsTrackingResponseTypeClaimsTrackingResponse)) return false;
        ClaimsTrackingResponseTypeClaimsTrackingResponse other = (ClaimsTrackingResponseTypeClaimsTrackingResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchStatus==null && other.getSearchStatus()==null) || 
             (this.searchStatus!=null &&
              this.searchStatus.equals(other.getSearchStatus()))) &&
            ((this.searchStatusReasonCode==null && other.getSearchStatusReasonCode()==null) || 
             (this.searchStatusReasonCode!=null &&
              this.searchStatusReasonCode.equals(other.getSearchStatusReasonCode()))) &&
            ((this.searchStatusReasonDesc==null && other.getSearchStatusReasonDesc()==null) || 
             (this.searchStatusReasonDesc!=null &&
              this.searchStatusReasonDesc.equals(other.getSearchStatusReasonDesc()))) &&
            ((this.matchedVehicleDetails==null && other.getMatchedVehicleDetails()==null) || 
             (this.matchedVehicleDetails!=null &&
              this.matchedVehicleDetails.equals(other.getMatchedVehicleDetails())));
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
        if (getSearchStatus() != null) {
            _hashCode += getSearchStatus().hashCode();
        }
        if (getSearchStatusReasonCode() != null) {
            _hashCode += getSearchStatusReasonCode().hashCode();
        }
        if (getSearchStatusReasonDesc() != null) {
            _hashCode += getSearchStatusReasonDesc().hashCode();
        }
        if (getMatchedVehicleDetails() != null) {
            _hashCode += getMatchedVehicleDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClaimsTrackingResponseTypeClaimsTrackingResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("ResponseNamespace", ">ClaimsTrackingResponseType>ClaimsTrackingResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("ResponseNamespace", "SearchStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("ResponseNamespace", ">SearchStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchStatusReasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("ResponseNamespace", "SearchStatusReasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("ResponseNamespace", ">SearchStatusReasonCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchStatusReasonDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("ResponseNamespace", "SearchStatusReasonDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchedVehicleDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MatchedVehicleDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://guidewire.com/gx/com.lv.nucleus.claimstracking.gx.ClaimsTrackingModel", "VehicleIncident"));
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
