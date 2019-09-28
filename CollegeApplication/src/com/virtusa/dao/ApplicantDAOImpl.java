package com.virtusa.dao;

import java.util.List;

import com.virtusa.entities.Applicant;

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
	
}
