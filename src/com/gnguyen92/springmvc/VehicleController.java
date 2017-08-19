package com.gnguyen92.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vehicle")
public class VehicleController {

	// controller method to show form
	@RequestMapping("/showForm")
	public String showForm(Model model){
		
		// create a Vehicle object
		Vehicle myVehicle = new Vehicle();
		
		// add Vehicle object instance to model (name_attribute, value)
		model.addAttribute("vehicle", myVehicle);
		
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
		
		return "vehicle-confirmation";
	}

}
