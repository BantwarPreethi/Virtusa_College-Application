package com.virtusa.view;

import java.util.Scanner;

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
		
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:System.exit(0);
			break;
		default:System.out.println("[SELECT APPROPRIATE OPTION]");
			studentView();
		
		}
	}

}
