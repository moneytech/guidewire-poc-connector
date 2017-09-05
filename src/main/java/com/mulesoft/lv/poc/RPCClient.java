package com.mulesoft.lv.poc;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

import com.guidewire.cc.webservices.api.*;

public class RPCClient extends AbstractMessageTransformer {
	
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		String response = "";
		Object payload = message.getPayload();
		System.out.println(payload.toString());
		
		try {
			String endpoint = "http://rpc-encoded.eu.cloudhub.io/cc/soap/ClaimsTrackingInboundService";
			
			ClaimsTrackingInboundServiceServiceLocator locator = new ClaimsTrackingInboundServiceServiceLocator();
			locator.setClaimsTrackingInboundServiceEndpointAddress(endpoint);			
			
			ClaimsTrackingInboundService service = locator.getClaimsTrackingInboundService();
			String xmlRequestString = payload.toString();			
			response = service.searchVehicleDetails(xmlRequestString);
			
			System.out.println("Response: " + response);
		} catch (Exception e) {
			System.err.println(e.toString());
		}		
		return response;
	}
	
}
