package com.gnguyen92.springmvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordConstraintValidator implements ConstraintValidator<Password, String>{

	// required string that will be used for validation
	private String requirements;
	// set the requirement equal to the custom annotation @Password value() attribute from Password.java
	// @Password(value="A", message="must contain at least...")
	@Override
	public void initialize(Password thePassword){
		requirements = thePassword.value();
	}
	
	// userEntry = the user's password entry
	// return true if userEntry contains the required string above
	@Override
	public boolean isValid(String userEntry, ConstraintValidatorContext constraintValidatorContext) {
		// attempting regex match to find special character in requirements, did not work
//		Pattern regex = Pattern.compile("[$&+,:;=?@#|]");
//		Matcher matcher = regex.matcher(userEntry);		
		boolean result;
		
		if(userEntry != null){
			result = userEntry.contains(requirements);
		}
		else {
			result = true;
		}
		return result;
	}

}
