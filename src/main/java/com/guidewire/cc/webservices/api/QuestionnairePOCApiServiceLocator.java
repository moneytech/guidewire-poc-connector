/**
 * QuestionnairePOCApiServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guidewire.cc.webservices.api;

public class QuestionnairePOCApiServiceLocator extends org.apache.axis.client.Service implements com.guidewire.cc.webservices.api.QuestionnairePOCApiService {

    public QuestionnairePOCApiServiceLocator() {
    }


    public QuestionnairePOCApiServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public QuestionnairePOCApiServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for QuestionnairePOCApi
    private java.lang.String QuestionnairePOCApi_address = "http://localhost:8080/cc/soap/QuestionnairePOCApi";

    public java.lang.String getQuestionnairePOCApiAddress() {
        return QuestionnairePOCApi_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String QuestionnairePOCApiWSDDServiceName = "QuestionnairePOCApi";

    public java.lang.String getQuestionnairePOCApiWSDDServiceName() {
        return QuestionnairePOCApiWSDDServiceName;
    }

    public void setQuestionnairePOCApiWSDDServiceName(java.lang.String name) {
        QuestionnairePOCApiWSDDServiceName = name;
    }

    public com.guidewire.cc.webservices.api.QuestionnairePOCApi getQuestionnairePOCApi() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(QuestionnairePOCApi_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getQuestionnairePOCApi(endpoint);
    }

    public com.guidewire.cc.webservices.api.QuestionnairePOCApi getQuestionnairePOCApi(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.guidewire.cc.webservices.api.QuestionnairePOCApiSoapBindingStub _stub = new com.guidewire.cc.webservices.api.QuestionnairePOCApiSoapBindingStub(portAddress, this);
            _stub.setPortName(getQuestionnairePOCApiWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setQuestionnairePOCApiEndpointAddress(java.lang.String address) {
        QuestionnairePOCApi_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.guidewire.cc.webservices.api.QuestionnairePOCApi.class.isAssignableFrom(serviceEndpointInterface)) {
                com.guidewire.cc.webservices.api.QuestionnairePOCApiSoapBindingStub _stub = new com.guidewire.cc.webservices.api.QuestionnairePOCApiSoapBindingStub(new java.net.URL(QuestionnairePOCApi_address), this);
                _stub.setPortName(getQuestionnairePOCApiWSDDServiceName());
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
        if ("QuestionnairePOCApi".equals(inputPortName)) {
            return getQuestionnairePOCApi();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://api.webservices.cc.guidewire.com/", "QuestionnairePOCApiService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://api.webservices.cc.guidewire.com/", "QuestionnairePOCApi"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("QuestionnairePOCApi".equals(portName)) {
            setQuestionnairePOCApiEndpointAddress(address);
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
