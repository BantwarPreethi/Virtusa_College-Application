package com.virtusa.view;

import java.util.Scanner;

import com.virtusa.controller.ApplicantController;
import com.virtusa.model.ApplicantModel;

public class ApplicantView
{

	public void applicationForm() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("First Name: ");
		String firstName = scanner.next();
		
		System.out.print("Last Name: ");
		String lastName = scanner.next();
		 
		System.out.print("Email: ");
		String email = scanner.next();
		
		System.out.print("Phone Number: ");
		String phoneNumber = scanner.next();
		
		System.out.println("Tenth Percentage: ");
		double tenthPercentage = scanner.nextDouble();
		
		System.out.println("Inter Percentage: ");
		double interPercentage = scanner.nextDouble();
		
		System.out.println("Enter Aadhar Number: ");
		String aadharNumber = scanner.next();
		
		System.out.print("Course Name: ");
		String courseName=scanner.next();
		
		System.out.println("Department Name: ");
		String departmentName = scanner.next();
		
		ApplicantModel applicantModel = new ApplicantModel();
		
		applicantModel.setFirstName(firstName);
		applicantModel.setLastName(lastName);
		applicantModel.setEmail(email);
		applicantModel.setPhoneNumber(phoneNumber);
		applicantModel.setTenthPercentage(tenthPercentage);
		applicantModel.setInterPercentage(interPercentage);
		applicantModel.setAadharNumber(aadharNumber);
		applicantModel.setCourseName(courseName);
		applicantModel.setDepartmentName(departmentName);
		
		ApplicantController applicantController = new ApplicantController();
		applicantController.storeApplicant(applicantModel);
		UserView userView = new UserView();
		userView.mainMenu();
		
	}
	
	public void applicationSuccess() {
		System.out.println("Applied successfully");
	}
	
	public void applicationUnsuccess() {
		System.out.println("Application unsuccessful");
	}
}
