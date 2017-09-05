package com.mulesoft.lv.poc;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

import com.guidewire.cc.webservices.api.typed.*;
import com.lv.www.nucleusMiddleware.*;

import ResponseNamespace.*;

public class RPCClientTyped extends AbstractMessageTransformer {

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		ClaimsTrackingResponseType response = new ClaimsTrackingResponseType();
		Object payload = message.getPayload();
		ClaimsTrackingRequestTypeClaimsTrackingRequest request = (ClaimsTrackingRequestTypeClaimsTrackingRequest) payload;
		
		try {
			String endpoint = "http://rpc-encoded.eu.cloudhub.io/cc/soap/ClaimsTyped";		    
	           
	        ClaimsTrackingInboundServiceServiceLocator locator = new ClaimsTrackingInboundServiceServiceLocator();
	        locator.setClaimsTrackingInboundServiceEndpointAddress(endpoint);
	           
	        ClaimsTrackingInboundService service = locator.getClaimsTrackingInboundService();
	        ClaimsTrackingRequestType xmlRequestObject = new ClaimsTrackingRequestType();
	        xmlRequestObject.setClaimsTrackingRequest(request);	           
	        response = service.searchVehicleDetails(xmlRequestObject);
	          
	        System.out.println("Return Status Reason: \n" + response.getClaimsTrackingResponse().getSearchStatusReasonDesc() );
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

}
