package com.virtusa.view;

import java.util.Scanner;

import com.virtusa.controller.StudentController;

public class StudentView {
	
	Scanner sc=new Scanner(System.in);
	public void studentView() {
		System.out.println("\t\t =====STUDENT VIEW=====");
		System.out.println("1.View Class Schedule");
		System.out.println("2.View Examination Schedule");
		System.out.println("3.View Results");
		System.out.println("4.View Assignments");
		System.out.println("5.View Placement Calender");
		System.out.println("6.General Exams");
		System.out.println("7.Exit");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:viewClassSchedule();
			break;
		case 2:viewExaminationSchedule();
			break;
		case 3:viewResults();
			break;
		case 4:viewAssignments();
			break;
		case 5:viewPlacementCalender();
			break;
		case 6:viewGeneralExams();
			break;
		case 7:System.exit(0);
			break;
		default:System.out.println("[SELECT APPROPRIATE OPTION]");
			studentView();
		
		}
	}
	
	public void viewClassSchedule() {
		StudentController studentController =new StudentController();
		studentController.retrieveClassSchedule();
	}
	
	public void viewExaminationSchedule() {
		StudentController studentController =new StudentController();
		studentController.retrieveExaminationSchedule();
	}
	

	public void viewResults() {
		StudentController studentController =new StudentController();
		studentController.retrieveResults();
	}
	public void viewAssignments() {
		StudentController studentController =new StudentController();
		studentController.retrieveAssignments();
	}
	public void viewPlacementCalender() {
		StudentController studentController =new StudentController();
		studentController.retrievePlacementCalender();
	}
	public void viewGeneralExams() {
		StudentController studentController =new StudentController();
		studentController.retrieveGeneralExams();
	}
}
