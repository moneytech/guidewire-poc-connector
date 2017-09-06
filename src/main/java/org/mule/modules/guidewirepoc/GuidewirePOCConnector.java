package org.mule.modules.guidewirepoc;

import org.mule.api.MuleMessage;
import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.modules.guidewirepoc.claimstrackinginboundservice.ClaimsTrackingInboundServicePOJORequest;
import org.mule.modules.guidewirepoc.claimstrackinginboundservice.ClaimsTrackingInboundServiceStringRequest;
import org.mule.modules.guidewirepoc.config.ConnectorConfig;
import org.mule.modules.guidewirepoc.pocclaimservice.POCClaimServiceRequest;
import org.mule.modules.guidewirepoc.pocquestionnaireservice.POCQuestionnaireServiceRequest;
import org.mule.modules.guidewirepoc.pocuploadservice.POCUploadServiceRequest;
import org.mule.modules.guidewirepoc.pocuploadservice.PocUploadInput;

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
    
    /**
     * POC Questionnaire Service
     */
    @Processor(friendlyName = "POC Questionnaire Service")
    public Object pocQuestionnaireService(MuleMessage message, String endpoint) {
    	Object payload = message.getPayload();
    	String requestString = payload.toString();
    	
    	POCQuestionnaireServiceRequest serviceRequest = new POCQuestionnaireServiceRequest();
    	Object response = serviceRequest.request(requestString, endpoint);
    	
    	return response;
    }

    /**
     * POC Questionnaire Service
     */
    @Processor(friendlyName = "POC Upload Service")
    public boolean pocUploadService(MuleMessage message, String endpoint){
    	PocUploadInput input = (PocUploadInput) message.getPayload();
    	
    	POCUploadServiceRequest serviceRequest = new POCUploadServiceRequest();
    	boolean response = serviceRequest.request(input, endpoint);
    	
    	return response;
    }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}