package com.virtusa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.virtusa.entities.Applicant;
import com.virtusa.integrate.ConnectionManager;
import com.virtusa.model.ApplicantModel;

public class ApplicantDAOImpl implements ApplicantDAO
{

	@Override
	public boolean persistApplicant(Applicant applicant) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try(
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ca","ca");
				){
			PreparedStatement st = conn.prepareStatement("insert into application_form values(APPLICATIONSEQ.nextval,?,?,?,?,?,?,?,?)");
			st.setString(1, applicant.getFirstName());
			st.setString(2, applicant.getLastName());
			st.setString(3, applicant.getEmailAddress());
			st.setString(4, applicant.getAadharNumber());
			st.setString(5, applicant.getDateOfBirth());
			st.setString(6, applicant.getCourseName());
			st.setString(7, applicant.getDepartmentName());
			int rows = st.executeUpdate();
			if(rows>0)
				System.out.println("Inserted");
			else
				System.out.println("Not inserted");
		}
		catch(SQLException e) {
			
		}
		return ApplicantRepository.add(applicant);
	}

	@Override
	public List<Applicant> viewApplicants() {
		return ApplicantRepository.get();
	}

	@Override
	public ApplicantModel retrieveApplicant()
	{
		/*
		 * retrieve single applicant
		 */
		
		ApplicantModel applicantModel = new ApplicantModel();
		applicantModel.getTenthPercentage();
		applicantModel.getInterPercentage();
		return applicantModel;
		
	}
	
}
