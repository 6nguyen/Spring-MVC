package com.gnguyen92.springmvc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/vehicle")
public class VehicleController {

	// Inject properties file values
	@Value("#{colorOptions}")
	private Map<String, String> colorOptions;
	
	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;
	
	// controller method to show form
	@RequestMapping("/showForm")
	public String showForm(Model model){
		
		// create a Vehicle object
		Vehicle myVehicle = new Vehicle();
		
		// add Vehicle object instance to model (name_attribute, value)
		model.addAttribute("vehicle", myVehicle);
		model.addAttribute("colorOptions", colorOptions);
		model.addAttribute("countryOptions", countryOptions);
		
		
		return "vehicle-form";
	}
	
	// controller method to process form
	// @ModelAttribute similar to @RequestParam, binds model attribute "vehicle" with
	// the Vehicle object created with the form data
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("vehicle") Vehicle thisVehicle){
		
		// log data as a check
		System.out.println(">> VehicleController: numWheels = " + thisVehicle.getNumWheels());
		System.out.println(">> VehicleController: make = " + thisVehicle.getMake());
		System.out.println(">> VehicleController: vehicleClass = " + thisVehicle.getVehicleClass());
		
		System.out.println(">> VehicleController: vehicleColor list = " + thisVehicle.getVehicleColor());
		System.out.println(">> VehicleController: vehicleCountry = " + thisVehicle.getVehicleCountry());
		
		return "vehicle-confirmation";
	}

}
