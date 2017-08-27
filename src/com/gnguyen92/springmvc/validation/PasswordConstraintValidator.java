package com.gnguyen92.springmvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordConstraintValidator implements ConstraintValidator<Password, String>{

	private String requirements;
	
	// @Password(value="*", message="must contain *")
	@Override
	public void initialize(Password thePassword){
		requirements = thePassword.value();
	}
	
	// userEntry = the user's password entry
	@Override
	public boolean isValid(String userEntry, ConstraintValidatorContext constraintValidatorContext) {
		boolean result = userEntry.contains(requirements);
		
		return result;
	}

}
