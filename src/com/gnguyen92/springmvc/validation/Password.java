/* ****************************************************************************************************
 * *****************************   CUSTOM ANNOTATIONS    **********************************************
 * *****************************  Advanced Spring Topic  **********************************************
 * *****************************.........................**********************************************
 * *****************************************************************************************************/
/*
 * Creating Custom Annotations: 
 * 		https://docs.oracle.com/javase/tutorial/java/annotations/declaring.html
 * Bean Validation Specification: 
 * 		http://beanvalidation.org/1.1/spec/
 * Bean Validation Constrain Definition:
 * 		http://beanvalidation.org/1.1/spec/#constraintsdefinitionimplementation-constraintdefinition-properties
*/	 
	 
package com.gnguyen92.springmvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


// @Constraint calls which Java class contains the business logic to validate this Custom Annotation
// @Target specifies what elements the custom annotation can be applied to
// @Retention specifies how long the marked annotation is stored and used.  Retain this annotation in the byte code and use it at runtime
@Constraint(validatedBy = PasswordConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Password {
	/* @Password custom annotation has 4 attributes: value, errorMessage, groups, payload
	 * 		These attributes are like parameters. They're used to customize the annotation */
	
	// Define default password
	// create an attribute called value that the user will pass in
	// if the user doesn't pass anything, it will default to A.1
	public String value() default "A";
	
	// define default message
	// the Bean Validation API MUST have an attribute "message" that contains an error message
	public String message = "must contain at least one capital letter, special character, and number.";
	
	// define default groups (group validation constraints together)
	// Bean Validation API MUST have an attribute "groups" that specifies which validation groups this constraint belongs to.
	// 		groups MUST default to an emptry array
	// our @Password annotation contains an attribute "groups", that is NOT A METHOD.  This is the syntax for an attribute
	// the annotation contains a generic Array of Class objects.  Class<?>[]
	// the annotation also has a default value of an empty array.  default {}
	public Class<?>[] groups() default {};
	
	// define default payload (give additional info about validation error)
	public Class<? extends Payload>[] payload() default{}; 	

}
