/**
 * ClaimPocAPIServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guidewire.cc.webservices.api;

public class ClaimPocAPIServiceLocator extends org.apache.axis.client.Service implements com.guidewire.cc.webservices.api.ClaimPocAPIService {

    public ClaimPocAPIServiceLocator() {
    }


    public ClaimPocAPIServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ClaimPocAPIServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ClaimPocAPI
    private java.lang.String ClaimPocAPI_address = "http://crp40629:8080/cc/soap/ClaimPocAPI";

    public java.lang.String getClaimPocAPIAddress() {
        return ClaimPocAPI_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ClaimPocAPIWSDDServiceName = "ClaimPocAPI";

    public java.lang.String getClaimPocAPIWSDDServiceName() {
        return ClaimPocAPIWSDDServiceName;
    }

    public void setClaimPocAPIWSDDServiceName(java.lang.String name) {
        ClaimPocAPIWSDDServiceName = name;
    }

    public com.guidewire.cc.webservices.api.ClaimPocAPI getClaimPocAPI() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ClaimPocAPI_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getClaimPocAPI(endpoint);
    }

    public com.guidewire.cc.webservices.api.ClaimPocAPI getClaimPocAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.guidewire.cc.webservices.api.ClaimPocAPISoapBindingStub _stub = new com.guidewire.cc.webservices.api.ClaimPocAPISoapBindingStub(portAddress, this);
            _stub.setPortName(getClaimPocAPIWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setClaimPocAPIEndpointAddress(java.lang.String address) {
        ClaimPocAPI_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.guidewire.cc.webservices.api.ClaimPocAPI.class.isAssignableFrom(serviceEndpointInterface)) {
                com.guidewire.cc.webservices.api.ClaimPocAPISoapBindingStub _stub = new com.guidewire.cc.webservices.api.ClaimPocAPISoapBindingStub(new java.net.URL(ClaimPocAPI_address), this);
                _stub.setPortName(getClaimPocAPIWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ClaimPocAPI".equals(inputPortName)) {
            return getClaimPocAPI();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://api.webservices.cc.guidewire.com/", "ClaimPocAPIService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://api.webservices.cc.guidewire.com/", "ClaimPocAPI"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ClaimPocAPI".equals(portName)) {
            setClaimPocAPIEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
