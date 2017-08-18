package com.gnguyen92.springmvc;

public class Vehicle {
	
	private int numWheels;
	private String make;
	
	// create an empty default constructor
	public Vehicle (){
		
	}

	// GETTERS & SETTERS
	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
}
