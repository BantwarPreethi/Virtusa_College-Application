package com.virtusa.dao;

import java.util.List;

import com.virtusa.entities.Applicant;

public interface ApplicantDAO 
{
	public boolean persistApplicant(Applicant applicant);
	public List<Applicant> viewApplicants();	
}
