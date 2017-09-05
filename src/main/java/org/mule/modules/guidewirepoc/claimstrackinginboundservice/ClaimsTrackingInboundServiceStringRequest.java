package org.mule.modules.guidewirepoc.claimstrackinginboundservice;

import com.guidewire.cc.webservices.api.ClaimsTrackingInboundService;
import com.guidewire.cc.webservices.api.ClaimsTrackingInboundServiceServiceLocator;

public class ClaimsTrackingInboundServiceStringRequest {

	public String request(String requestString, String requestEndpoint) {
		String response = "";
		
		try {			
			ClaimsTrackingInboundServiceServiceLocator locator = new ClaimsTrackingInboundServiceServiceLocator();
			locator.setClaimsTrackingInboundServiceEndpointAddress(requestEndpoint);			
			
			ClaimsTrackingInboundService service = locator.getClaimsTrackingInboundService();			
			response = service.searchVehicleDetails(requestString);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return response;
	}
	
}
