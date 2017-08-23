package com.gnguyen92.springmvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
/* 
 * 	Form Validation using Spring annotations
 *  @NotNull(message="message to display")
 *  @Size(min/max=character lenght)
 *  
 *  */
import javax.validation.constraints.Size;

public class Customer {

	// @NotNull specifies a required field
	@NotNull(message=" is required.")
	@Size(min=2, max=15, message=" must be at least 2 characters long.")
	@Pattern(regexp="[a-zA-Z]+")
	private String firstName;
	
	@NotNull(message=" is required.")
	@Size(min=2, max=15, message=" must be at least 2 characters long.")
	@Pattern(regexp="[a-zA-Z]+")
	private String lastName;
	
	@NotNull(message=" is required.")
	@Size(min=2, max=15, message=" must be at least 2 characters long.")
	private String password;
	
	@Size(max=37)
	private String address;
	
	// @Pattern forces field to follow a regex pattern
	// regular expression code: only digits 0-9 allowed.  Only accepts 5 characters. [a-zA-Z] only alphabet allowed
	@NotNull(message=" is required.")
	@Pattern(regexp="[0-9]{5}", message=" invalid Zip Code.")
	private String zipcode;
	
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	
}
