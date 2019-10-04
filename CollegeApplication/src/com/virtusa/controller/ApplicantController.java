package com.virtusa.controller;


import com.virtusa.helper.FactoryApplicantService;
import com.virtusa.model.ApplicantModel;
import com.virtusa.service.ApplicantService;
import com.virtusa.validation.ApplicantModelValidator;
import com.virtusa.view.ApplicantView;


public class ApplicantController {
	
	private ApplicantService applicantService;
	ApplicantView applicantView=new ApplicantView();
	public ApplicantController() {
		this.applicantService=FactoryApplicantService.createApplicantService();
	}

	public void storeApplicant(ApplicantModel applicantModel) {
		
		boolean result = applicantService.storeApplicantService(applicantModel);
		if(result)
			applicantView.applicationSuccess();
		else
			applicantView.applicationUnsuccess();
	}
	
	/*public void handleApplicant(ApplicantModel model) {
		
		ApplicantModelValidator validator=new ApplicantModelValidator();
				
		if(validator.validate(model)) {
		
		boolean outcome=applicantService.storeApplicantService(model);
		if(outcome==true) 
			applicantView.applicationSuccess();	
		else 
			applicantView.applicationUnsuccess();
	}
		else 
			applicantView.validationFailedError();
	
	}*/

}
