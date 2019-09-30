package com.virtusa.controller;

import com.virtusa.helper.FactoryStudentDAO;
import com.virtusa.service.StudentService;
import com.virtusa.view.StudentView;

public class StudentController {
	private StudentService studentService;
	StudentView studentView=new StudentView();
	
	public StudentController() {
		this.studentService=FactoryStudentDAO.createStudentService();
	}

	public void retrieveClassSchedule() {
		// TODO Auto-generated method stub
		
	}

	public void retrieveExaminationSchedule() {
		// TODO Auto-generated method stub
		
	}

	public void retrieveResults() {
		// TODO Auto-generated method stub
		
	}

	public void retrieveAssignments() {
		// TODO Auto-generated method stub
		
	}

	public void retrievePlacementCalender() {
		// TODO Auto-generated method stub
		
	}

	public void retrieveGeneralExams() {
		// TODO Auto-generated method stub
		
	}
	

}
