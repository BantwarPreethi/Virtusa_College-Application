package com.virtusa.entities;

public class Student extends User
{
	private int studentId;

	public int getStudentId() 
	{
		return studentId;
	}

	public void setStudentId(int studentId) 
	{
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber
				+ ", getStudentId()=" + getStudentId() + ", getUserName()=" + getUserName() + ", getPassword()="
				+ getPassword() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getDateOfBirth()=" + getDateOfBirth() + ", getEmailAddress()=" + getEmailAddress()
				+ ", getPhoneNumber()=" + getPhoneNumber() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
	

}
