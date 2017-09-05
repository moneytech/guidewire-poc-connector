package org.mule.modules.guidewirepoc.pocclaimservice;

import com.guidewire.cc.webservices.api.ClaimPocAPIServiceLocator;
import com.guidewire.cc.webservices.entity.PolicyHolder;

public class POCClaimServiceRequest {
	
	public Object request(String requestString, String requestEndpoint) {
		PolicyHolder response = new PolicyHolder();
		
		try {
			ClaimPocAPIServiceLocator locator = new ClaimPocAPIServiceLocator();
			locator.setClaimPocAPIEndpointAddress(requestEndpoint);
			
			response = locator.getClaimPocAPI().getPolicyHolder(requestString);			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		return response;
	}

}
