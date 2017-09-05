package com.mulesoft.lv.poc.tests;

import org.junit.Test;
import org.mule.modules.guidewirepoc.claimstrackinginboundservice.ClaimsTrackingInboundServiceStringRequest;

public class ConnectorTests {

	@Test
	public void testClaimsString() {
		String payload = "TEST";
		String endpoint = "TEST";
		
		ClaimsTrackingInboundServiceStringRequest serviceStringRequest = new ClaimsTrackingInboundServiceStringRequest();
		String response = serviceStringRequest.request(payload, endpoint);
		
		System.out.println(response);
	}
	
}
