package com.virtusa.entities;

public class Applicant extends User {
	
	private int applicantNumber;
	private double tenthPercentage;
	private double interPercentage;
	private String courseName;
	private String departmentName;
	private String aadharNumber;
	public int getApplicantNumber() {
		return applicantNumber;
	}
	public void setApplicantNumber(int applicantNumber) {
		this.applicantNumber = applicantNumber;
	}
	public double getTenthPercentage() {
		return tenthPercentage;
	}
	public void setTenthPercentage(double tenthPercentage) {
		this.tenthPercentage = tenthPercentage;
	}
	public double getInterPercentage() {
		return interPercentage;
	}
	public void setInterPercentage(double interPercentage) {
		this.interPercentage = interPercentage;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	@Override
	public String toString() {
		return "Applicant [applicantNumber=" + applicantNumber + ", tenthPercentage=" + tenthPercentage
				+ ", interPercentage=" + interPercentage + ", courseName=" + courseName + ", departmentName="
				+ departmentName + ", aadharNumber=" + aadharNumber + "]";
	}
	
}
