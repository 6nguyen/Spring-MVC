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

	@NotNull(message="is required.")
	@Size(min=2, message="First name must be at least 2 characters long.")
	private String firstName;
	@NotNull(message="is required.")
	@Size(min=2, message="Last name must be at least 2 characters long.")
	private String lastName;
	@NotNull(message="is required.")
	@Size(min=2, message="Password must be at least 2 characters long.")
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
