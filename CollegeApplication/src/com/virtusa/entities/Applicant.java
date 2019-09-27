package com.virtusa.entities;

public class Applicant extends User {
	
	private int applicantNumber;

	public int getApplicantNumber() {
		return applicantNumber;
	}

	public void setApplicantNumber(int applicantNumber) {
		this.applicantNumber = applicantNumber;
	}

	@Override
	public String toString() {
		return "Applicant [applicantNumber=" + applicantNumber + "]";
	}

}
