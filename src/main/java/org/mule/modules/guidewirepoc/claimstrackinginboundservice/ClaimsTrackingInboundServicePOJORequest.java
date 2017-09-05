package org.mule.modules.guidewirepoc.claimstrackinginboundservice;

import com.guidewire.cc.webservices.api.typed.ClaimsTrackingInboundService;
import com.guidewire.cc.webservices.api.typed.ClaimsTrackingInboundServiceServiceLocator;
import com.lv.www.nucleusMiddleware.ClaimsTrackingRequestType;
import com.lv.www.nucleusMiddleware.ClaimsTrackingRequestTypeClaimsTrackingRequest;

import ResponseNamespace.ClaimsTrackingResponseType;

public class ClaimsTrackingInboundServicePOJORequest {

	public Object request(Object requestObject, String requestEndpoint) {
		ClaimsTrackingResponseType response = new ClaimsTrackingResponseType();
		ClaimsTrackingRequestTypeClaimsTrackingRequest request = (ClaimsTrackingRequestTypeClaimsTrackingRequest) requestObject;
		
		try {  
	        ClaimsTrackingInboundServiceServiceLocator locator = new ClaimsTrackingInboundServiceServiceLocator();
	        locator.setClaimsTrackingInboundServiceEndpointAddress(requestEndpoint);
	           
	        ClaimsTrackingInboundService service = locator.getClaimsTrackingInboundService();
	        ClaimsTrackingRequestType xmlRequestObject = new ClaimsTrackingRequestType();
	        xmlRequestObject.setClaimsTrackingRequest(request);	           
	        response = service.searchVehicleDetails(xmlRequestObject);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}
	
}
