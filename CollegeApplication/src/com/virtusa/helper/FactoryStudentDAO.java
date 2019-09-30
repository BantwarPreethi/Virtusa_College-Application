package com.virtusa.helper;

import com.virtusa.dao.StudentDAO;
import com.virtusa.service.StudentService;
import com.virtusa.service.StudentServiceImpl;

public class FactoryStudentDAO {

	public static StudentService createStudentDAO() {
	StudentService studentService=new StudentServiceImpl();
		return studentService;
	}

	public static StudentService createStudentService() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
