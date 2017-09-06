package org.mule.modules.guidewirepoc.pocuploadservice;

import com.guidewire.cc.webservices.api.DocumentUploadPocAPIServiceLocator;

public class POCUploadServiceRequest {

	public boolean request(PocUploadInput input, String requestEndpoint) {
		boolean response = false;
		
		try {
			DocumentUploadPocAPIServiceLocator locator = new DocumentUploadPocAPIServiceLocator();
			locator.setDocumentUploadPocAPIEndpointAddress(requestEndpoint);
			
			response = locator.getDocumentUploadPocAPI().uploadDocument(input.getClaimNumber(), input.getFileDescription(), input.getFilename(), input.getImageBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return response;
	}

	
}
