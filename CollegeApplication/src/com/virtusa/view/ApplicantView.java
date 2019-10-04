package com.virtusa.view;

import java.util.Scanner;

import com.virtusa.controller.ApplicantController;
import com.virtusa.exception.ValidationException;
import com.virtusa.model.ApplicantModel;
import com.virtusa.validation.ApplicantModelValidator;

public class ApplicantView
{

	public void applicationForm() {
		Scanner scanner=new Scanner(System.in);
		ApplicantModelValidator validator = new ApplicantModelValidator();
		ApplicantView applicantView = new ApplicantView();
		
		System.out.println("-------Application Form-------");
		
		System.out.print("First Name: ");
		String firstName = scanner.next();
		boolean validFirstName=validator.validString(firstName);
		if(!validFirstName)
			try {
			throw new ValidationException("[!ERROR:Invalid First Name]");
			
			}catch(ValidationException e) {
				System.out.println(e.getMessage());
				applicantView.applicationForm();
			}
		
		System.out.print("Last Name: ");
		String lastName = scanner.next();
		boolean validLastName=validator.validString(lastName);
		if(!validLastName)
			try {
			throw new ValidationException("[!ERROR:Invalid Last Name]");
			
			}catch(ValidationException e) {
				System.out.println(e.getMessage());
				applicantView.applicationForm();
			}
		 
		System.out.print("Email: ");
		String email = scanner.next();
		boolean validEmail=validator.validEmail(email);
		if(!validEmail)
			try {
			throw new ValidationException("[!ERROR: Invalid Email]");
			}catch(ValidationException e) {
				System.out.println(e.getMessage());
				applicantView.applicationForm();
			}
		
		System.out.print("Phone Number: ");
		String phoneNumber = scanner.next();
		boolean validPhone=validator.validPhone(phoneNumber);
		if(!validPhone)
			try {
			throw new ValidationException("[!ERROR: Invalid Phone Number]");
			}catch(ValidationException e) {
				System.out.println(e.getMessage());
				applicantView.applicationForm();
			}
		
		System.out.println("Tenth Percentage: ");
		double tenthPercentage = scanner.nextDouble();
		boolean validTenth=validator.validDouble(tenthPercentage);
		if(!validTenth)
			try {
			throw new ValidationException("[!ERROR: Invalid Tenth Percentage]");
			}catch(ValidationException e) {
				System.out.println(e.getMessage());
				applicantView.applicationForm();
			}
		
		System.out.println("Inter Percentage: ");
		double interPercentage = scanner.nextDouble();
		boolean validInter=validator.validDouble(interPercentage);
		if(!validInter)
			try {
			throw new ValidationException("[!ERROR: Invalid Inter Percentage]");
			}catch(ValidationException e) {
				System.out.println(e.getMessage());
				applicantView.applicationForm();
			}
		
		System.out.println("Enter Aadhar Number: ");
		String aadharNumber = scanner.next();
		boolean validAadhar=validator.validAadhar(aadharNumber);
		if(!validAadhar)
			try {
			throw new ValidationException("[!ERROR: Invalid Aadhar Number]");
			}catch(ValidationException e) {
				System.out.println(e.getMessage());
				applicantView.applicationForm();
			}
		
		System.out.print("Course Name: ");
		String courseName=scanner.next();
		
		System.out.println("Department Name (CSE,ECE,EEE): ");
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
	
	public void validationFailedError() {
		System.out.println("Data entered not valid");
		
	}
}
