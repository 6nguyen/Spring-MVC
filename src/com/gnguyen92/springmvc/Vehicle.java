package com.gnguyen92.springmvc;

import java.util.LinkedList;
import java.util.List;

public class Vehicle {
	
	private int numWheels;
	private String make;
	private String vehicleClass;
	
	private List<String> vehicleOptions;

	// create an empty default constructor
	public Vehicle (){
		// populate vehicle options
		vehicleOptions = new LinkedList<>();
		vehicleOptions.add("Economy");
		vehicleOptions.add("Sport");
		vehicleOptions.add("Family");
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
	
	public String getVehicleClass() {
		return vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}
	
	public List<String> getVehicleOptions(){
		return vehicleOptions;
	}
}
