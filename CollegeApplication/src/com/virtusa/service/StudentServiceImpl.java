package com.virtusa.service;


import com.virtusa.entities.Student;
import com.virtusa.helper.FactoryStudentDAO;
import com.virtusa.model.StudentModel;
import com.virtusa.model.StudentModel;

public class StudentServiceImpl implements StudentService {
	//private StudentDAO studentDAO;
	public StudentServiceImpl() {
		//this.studentDAO=FactoryStudentDAO.createStudentDAO();
	}
	

	@Override
	public boolean storeStudentService(StudentModel studentModel) {
		Student student=new Student();
		student.setStudentId(studentModel.getStudentId());
		
		
		return false;
	}

}
