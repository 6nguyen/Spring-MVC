package com.gnguyen92.springmvc;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Vehicle {
	
	private int numWheels;
	private String make;
	private String vehicleClass;
	private String vehicleColor;
	private String vehicleCountry;
	private String priceRange;
	

	private List<String> vehicleOptions;
	private Map<String, String> countryOptions;
	private Map<String, String> colorOptions;

	// create an empty default constructor
	public Vehicle (){
		// populate vehicle class options
		vehicleOptions = new LinkedList<>();
		vehicleOptions.add("Economy");
		vehicleOptions.add("Sport");
		vehicleOptions.add("Luxury");
		vehicleOptions.add("Family");
		vehicleOptions.add("Outdoor");
		
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

	public Map<String, String> getColorOptions() {
		return colorOptions;
	}

	public void setColorOptions(Map<String, String> colorOptions) {
		this.colorOptions = colorOptions;
	}

	public String getVehicleColor() {
		return vehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}


	public String getVehicleCountry() {
		return vehicleCountry;
	}

	public void setVehicleCountry(String vehicleCountry) {
		this.vehicleCountry = vehicleCountry;
	}

	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(Map<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}

}
