package com.virtusa.service;

import com.virtusa.dao.ApplicantDAOImpl;
import com.virtusa.model.ApplicantModel;

public class AdminServiceImpl implements AdminService
{

	@Override
	public void approveApplicantService() 
	{
		ApplicantDAOImpl applicantDAOImpl = new ApplicantDAOImpl();
		ApplicantModel applicantModel = new ApplicantModel();
		applicantModel=applicantDAOImpl.retrieveApplicant();
		if(applicantModel.getTenthPercentage()>60.00 && applicantModel.getInterPercentage()>60.00)
		{
			System.out.println("Applicant is eligible for the admission");
			System.out.println("Applicant Approved Successful ");
		}
		else
		{
			System.out.println("Applicant not eligible");
		}
	}

	@Override
	public void addStudentService()
	{
		
		
	}

}
