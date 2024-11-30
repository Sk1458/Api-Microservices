package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CseStyle implements ConstraintValidator<CustomEmailAnnotation, String> {

	@Autowired
	CseRepo repo; //we have autowired this repo here to acces the db in this class and check if the db already contains the email which the user is entering
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		
		if(repo.findByEmail(value).size() == 0) {
			return true;
		}
		return false;
	}
	
	
}
