package org.mule.modules.guidewirepoc;

import org.mule.api.MuleMessage;
import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import org.mule.modules.guidewirepoc.config.ConnectorConfig;
import org.mule.modules.guidewirepoc.pocclaimservice.POCClaimServiceRequest;

import com.sun.mail.handlers.message_rfc822;

import org.mule.modules.guidewirepoc.claimstrackinginboundservice.*;

@Connector(name="guidewire-poc", friendlyName="Guidewire POC")
public class GuidewirePOCConnector {

    @Config
    ConnectorConfig config;

    /**
     * Claims Tracking Inbound Service (String)
     */
    @Processor(friendlyName = "Claims Tracking Inbound Service - String")
    public String claimsTrackingInboundServiceString(MuleMessage message, String endpoint) {
    	Object payload = message.getPayload();
    	String requestString = payload.toString();
    	
    	ClaimsTrackingInboundServiceStringRequest serviceRequest = new ClaimsTrackingInboundServiceStringRequest();
    	String response = serviceRequest.request(requestString, endpoint);
    	    
    	return response;
    }
    /**
     * Claims Tracking Inbound Service (POJO)
     */
    @Processor(friendlyName = "Claims Tracking Inbound Service - POJO")
    public Object claimsTrackingInboundServicePojo(MuleMessage message, String endpoint) {
    	Object payload = message.getPayload();
    	
    	ClaimsTrackingInboundServicePOJORequest serviceRequest = new ClaimsTrackingInboundServicePOJORequest();
    	Object response = serviceRequest.request(payload, endpoint);
    	
    	return response;
    }
    
    /**
     * POC Claim Service
     */
    @Processor(friendlyName = "POC Claim Service")
    public Object pocClaimService(MuleMessage message, String endpoint) {
    	Object payload = message.getPayload();
    	String requestString = payload.toString();
    	
    	POCClaimServiceRequest serviceRequest = new POCClaimServiceRequest();
    	Object response = serviceRequest.request(requestString, endpoint);
    	
    	return response;
    }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}