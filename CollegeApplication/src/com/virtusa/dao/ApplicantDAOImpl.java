package com.virtusa.dao;

import java.util.List;

import com.virtusa.entities.Applicant;
import com.virtusa.model.ApplicantModel;

public class ApplicantDAOImpl implements ApplicantDAO
{

	@Override
	public boolean persistApplicant(Applicant applicant) {
		return ApplicantRepository.add(applicant);
	}

	@Override
	public List<Applicant> viewApplicants() {
		return ApplicantRepository.get();
	}

	@Override
	public ApplicantModel retrieveApplicant()
	{
		/*
		 * retrieve single applicant
		 */
		
		ApplicantModel applicantModel = new ApplicantModel();
		applicantModel.getTenthPercentage();
		applicantModel.getInterPercentage();
		return applicantModel;
		
	}
	
}
