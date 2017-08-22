package com.gnguyen92.springmvc;

import javax.validation.constraints.NotNull;
/* 
 * 	Form Validation using Spring annotations
 *  @NotNull(message="message to display")
 *  @Size(min/max=character lenght)
 *  
 *  */
import javax.validation.constraints.Size;

public class Customer {

	@NotNull(message="is required")
	@Size(min=2)
	private String firstName;
	@NotNull(message="is required")
	@Size(min=2)
	private String lastName;
	@NotNull(message="is required")
	@Size(min=2)
	private String password;
	
	
	// GETTERS & SETTERS
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
