/**
 * ClaimPocAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guidewire.cc.webservices.api;

public interface ClaimPocAPI extends java.rmi.Remote {
    public com.guidewire.cc.webservices.entity.PolicyHolder getPolicyHolder(java.lang.String claimNumber) throws java.rmi.RemoteException, com.guidewire.cc.webservices.fault.PermissionException, com.guidewire.cc.webservices.fault.BadIdentifierException, com.guidewire.cc.webservices.fault.ServerStateException;
}
