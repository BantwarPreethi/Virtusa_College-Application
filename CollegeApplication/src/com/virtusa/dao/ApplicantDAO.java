package com.virtusa.dao;

import java.util.List;

import com.virtusa.entities.Applicant;
import com.virtusa.model.ApplicantModel;

public interface ApplicantDAO 
{
	public boolean persistApplicant(Applicant applicant);
	public List<Applicant> viewApplicants();	
	public ApplicantModel retrieveApplicant();
}
