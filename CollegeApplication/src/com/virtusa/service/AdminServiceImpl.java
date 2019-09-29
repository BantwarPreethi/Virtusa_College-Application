package com.virtusa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.virtusa.dao.ApplicantDAOImpl;
import com.virtusa.entities.Student;
import com.virtusa.model.ApplicantModel;
import com.virtusa.model.FacultyModel;
import com.virtusa.model.StudentModel;

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
		List<StudentModel> studentList = new ArrayList<StudentModel>();
		StudentModel studentModel = new StudentModel();
		studentModel.getStudentId(); 
		studentModel.getFirstName();
		studentModel.getLastName();
		studentModel.getPhoneNumber();
		studentModel.getEmail();
		studentModel.getDateOfBirth();
		studentModel.getInterPercentage();
		studentModel.getTenthPercentage();
		studentModel.getCourseName();
		studentModel.getDepartmentName();
		studentList.add(studentModel);	
	}

	@Override
	public void deleteStudentService() 
	{
		List<StudentModel> studentList = new ArrayList<StudentModel>();
		System.out.println("Enter Student Id to delete record:");
		Scanner scanner = new Scanner(System.in);
		int id= scanner.nextInt();
		studentList.remove(id);
	}

	@Override
	public void addFacultyService()
	{
		List<FacultyModel> facultyList = new ArrayList<FacultyModel>();
		FacultyModel facultyModel = new FacultyModel();
		facultyModel.getFacultyId();
		facultyModel.getFirstName();
		facultyModel.getLastName();
		facultyModel.getPhoneNumber();
		facultyModel.getEmail();
		facultyModel.getDateOfBirth();
		facultyModel.getCourseName();
		facultyModel.getDepartmentName();
		facultyModel.getSalary();
		facultyList.add(facultyModel);	
	}

	@Override
	public void deleteFacultyService()
	{
		List<FacultyModel> facultyList = new ArrayList<FacultyModel>();
		System.out.println("Enter faculty Id to delete record");
		Scanner scanner = new Scanner(System.in);
		int id= scanner.nextInt();
		facultyList.remove(id);
		
	}

	
	
	
	

	
	

}  
