package com.virtusa.model;

public class FacultyModel extends ApplicantModel
{
	private int facultyId;
	private double salary;
	public int getFacultyId() 
	{
		return facultyId;
	}
	public void setFacultyId(int facultyId)
	{
		this.facultyId = facultyId;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	

}
