package com.virtusa.model;

public class ApplicantModel {
	
	private int applicantNumber;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private double tenthPercentage;
	private double interPercentage;
	private String courseName;
	private String departmentName;
	
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public double getTenthPercentage() {
		return tenthPercentage;
	}
	public double getInterPercentage() {
		return interPercentage;
	}
	public String getCourseName() {
		return courseName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public int getApplicantNumber() {
		return applicantNumber;
	}
	public void setApplicantNumber(int applicantNumber) {
		this.applicantNumber = applicantNumber;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setTenthPercentage(double tenthPercentage) {
		this.tenthPercentage = tenthPercentage;
	}
	public void setInterPercentage(double interPercentage) {
		this.interPercentage = interPercentage;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	
	
}
