/**
 * ClaimPocAPISoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guidewire.cc.webservices.api;

public class ClaimPocAPISoapBindingStub extends org.apache.axis.client.Stub implements com.guidewire.cc.webservices.api.ClaimPocAPI {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPolicyHolder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "claimNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://entity.webservices.cc.guidewire.com/", "PolicyHolder"));
        oper.setReturnClass(com.guidewire.cc.webservices.entity.PolicyHolder.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getPolicyHolderReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.webservices.cc.guidewire.com/", "fault"),
                      "com.guidewire.cc.webservices.fault.PermissionException",
                      new javax.xml.namespace.QName("http://fault.webservices.cc.guidewire.com/", "PermissionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.webservices.cc.guidewire.com/", "fault"),
                      "com.guidewire.cc.webservices.fault.BadIdentifierException",
                      new javax.xml.namespace.QName("http://fault.webservices.cc.guidewire.com/", "BadIdentifierException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.webservices.cc.guidewire.com/", "fault"),
                      "com.guidewire.cc.webservices.fault.ServerStateException",
                      new javax.xml.namespace.QName("http://fault.webservices.cc.guidewire.com/", "ServerStateException"), 
                      true
                     ));
        _operations[0] = oper;

    }

    public ClaimPocAPISoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ClaimPocAPISoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ClaimPocAPISoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://entity.webservices.cc.guidewire.com/", "PolicyHolder");
            cachedSerQNames.add(qName);
            cls = com.guidewire.cc.webservices.entity.PolicyHolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.cc.guidewire.com/", "AlreadyExecutedException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.cc.webservices.fault.AlreadyExecutedException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.cc.guidewire.com/", "BadIdentifierException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.cc.webservices.fault.BadIdentifierException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.cc.guidewire.com/", "BatchProcessException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.cc.webservices.fault.BatchProcessException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.cc.guidewire.com/", "DataConversionException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.cc.webservices.fault.DataConversionException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.cc.guidewire.com/", "DuplicateKeyException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.cc.webservices.fault.DuplicateKeyException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.cc.guidewire.com/", "EntityStateException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.cc.webservices.fault.EntityStateException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.cc.guidewire.com/", "FieldConversionException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.cc.webservices.fault.FieldConversionException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.cc.guidewire.com/", "FieldFormatException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.cc.webservices.fault.FieldFormatException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.cc.guidewire.com/", "LoginException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.cc.webservices.fault.LoginException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.cc.guidewire.com/", "PermissionException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.cc.webservices.fault.PermissionException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.cc.guidewire.com/", "RequiredFieldException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.cc.webservices.fault.RequiredFieldException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.cc.guidewire.com/", "ServerStateException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.cc.webservices.fault.ServerStateException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.cc.guidewire.com/", "SOAPException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.cc.webservices.fault.SOAPException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.cc.guidewire.com/", "SOAPSenderException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.cc.webservices.fault.SOAPSenderException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.cc.guidewire.com/", "SOAPServerException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.cc.webservices.fault.SOAPServerException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.webservices.cc.guidewire.com/", "UnknownTypeKeyException");
            cachedSerQNames.add(qName);
            cls = com.guidewire.cc.webservices.fault.UnknownTypeKeyException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.guidewire.cc.webservices.entity.PolicyHolder getPolicyHolder(java.lang.String claimNumber) throws java.rmi.RemoteException, com.guidewire.cc.webservices.fault.PermissionException, com.guidewire.cc.webservices.fault.BadIdentifierException, com.guidewire.cc.webservices.fault.ServerStateException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.webservices.cc.guidewire.com/", "getPolicyHolder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {claimNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.guidewire.cc.webservices.entity.PolicyHolder) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.guidewire.cc.webservices.entity.PolicyHolder) org.apache.axis.utils.JavaUtils.convert(_resp, com.guidewire.cc.webservices.entity.PolicyHolder.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.guidewire.cc.webservices.fault.PermissionException) {
              throw (com.guidewire.cc.webservices.fault.PermissionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.guidewire.cc.webservices.fault.BadIdentifierException) {
              throw (com.guidewire.cc.webservices.fault.BadIdentifierException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.guidewire.cc.webservices.fault.ServerStateException) {
              throw (com.guidewire.cc.webservices.fault.ServerStateException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
