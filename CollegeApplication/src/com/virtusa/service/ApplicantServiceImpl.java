package com.virtusa.service;

import java.util.List;

import com.virtusa.entities.Applicant;
import com.virtusa.model.ApplicantModel;

public class ApplicantServiceImpl implements ApplicantService
{

	@Override
	public boolean storeApplicantService(ApplicantModel applicantModel) {
		Applicant applicant = new Applicant();
		applicant.setApplicantNumber(applicantModel.getApplicantNumber());
		return false;
	}

	@Override
	public List<ApplicantModel> retrieveApplicantService() {
		
		return null;
	}

}
