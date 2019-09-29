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
	public String toString() 
	{
		return "Student [studentId=" + studentId + "]";
	}
	
	

}
