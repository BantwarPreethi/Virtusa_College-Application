package com.virtusa.validation;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.model.ApplicantModel;

public class ApplicantModelValidator {

public boolean validate(ApplicantModel model) {
		
		boolean result=false;
		
		if(validString(model.getFirstName()) && validString(model.getLastName()) && validDouble(model.getTenthPercentage()) ){
			result=true;
		}
		
		
		return result;
	}

	private boolean validDouble(double tenthPercentage) {
		boolean result = false;
		if(tenthPercentage>0.0 && tenthPercentage<100.0)
			result=true;
		return result;
	}

	public boolean validString(String val) {
	
		boolean result=false;
		char chars[]=val.toCharArray();
		List<Character> alphabets=new ArrayList<>();
		for(int i=97;i<=122;i++) {
			alphabets.add((char)i);
		}
	
		for(char ch:chars) {
			if(alphabets.contains(ch)) {
				result=true;
			}else {
				return false;
			}
		}
		return result;
	}

	public boolean validNumber(int d) {
		boolean result=false;
		String data=String.valueOf(d);
		if(data.matches(".*[0-9]")) {
			result=true;
		}
		return result;
	}

	public boolean validSalary(double salary) {
		boolean result=false;
		String salaryVal=String.valueOf((int)salary);
		if(salary>0 && salaryVal.length()<=5) {
		result=true;
		}
		return result;
	}
}
