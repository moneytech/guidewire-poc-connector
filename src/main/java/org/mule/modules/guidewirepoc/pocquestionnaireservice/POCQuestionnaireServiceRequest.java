package org.mule.modules.guidewirepoc.pocquestionnaireservice;

import com.guidewire.cc.webservices.api.QuestionnairePOCApiServiceLocator;
import com.guidewire.cc.webservices.entity.FileQuestion;

public class POCQuestionnaireServiceRequest {

	public Object request(String requestString, String requestEndpoint) {
		FileQuestion[] response = null;
		
		try {
			QuestionnairePOCApiServiceLocator locator = new QuestionnairePOCApiServiceLocator();
			locator.setQuestionnairePOCApiEndpointAddress(requestEndpoint);
			
			response = locator.getQuestionnairePOCApi().getQuestionnaireForClaim(requestString);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return response;
	}
	
}
