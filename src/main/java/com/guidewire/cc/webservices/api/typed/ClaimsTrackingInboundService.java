/**
 * ClaimsTrackingInboundService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guidewire.cc.webservices.api.typed;

public interface ClaimsTrackingInboundService extends java.rmi.Remote {

    /**
     * Query th database for the vehicle with the passed in vrn on
     * passed in claim
     */
    public ResponseNamespace.ClaimsTrackingResponseType searchVehicleDetails(com.lv.www.nucleusMiddleware.ClaimsTrackingRequestType xmlFromMendix) throws java.rmi.RemoteException, com.guidewire.cc.webservices.fault.PermissionException, com.guidewire.cc.webservices.fault.BadIdentifierException, com.guidewire.cc.webservices.fault.ServerStateException;
}
