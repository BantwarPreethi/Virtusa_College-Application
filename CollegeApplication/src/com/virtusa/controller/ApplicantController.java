package com.virtusa.controller;


import com.virtusa.helper.FactoryApplicantService;
import com.virtusa.model.ApplicantModel;
import com.virtusa.service.ApplicantService;
import com.virtusa.view.ApplicantView;


public class ApplicantController {
	
	private ApplicantService applicantService;
	public ApplicantController() {
		this.applicantService=FactoryApplicantService.createApplicantService();
	}

	public void storeApplicant(ApplicantModel applicantModel) {
		
		boolean result = applicantService.storeApplicantService(applicantModel);
		ApplicantView applicantView=new ApplicantView();
		if(result){
			applicantView.applicationSuccess();
		}else{
			
			applicantView.applicationUnsuccess();
	}
	}

}
