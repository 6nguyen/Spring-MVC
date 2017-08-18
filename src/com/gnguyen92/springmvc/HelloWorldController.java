package com.gnguyen92.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	// need a controller to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm(){
		return "helloworld-form";
	}
	
	
	// need a controller to process the HTML form
	@RequestMapping("/processForm")
	public String processForm(){		
		return "helloworld";
	}
	
	// new controller method to read form data and
	// add data to the Spring model
	@RequestMapping("/processFormUpper")
	public String processFormUpper(HttpServletRequest request, Model model){
		// read request param from HTML form
		String firstName = request.getParameter("firstName");
		
		// convert data to upper case
		firstName = firstName.toUpperCase();
		
		// create the message
		String message = firstName + ", you're a little BITCH!";
		
		// add message to model, (name_of_attribute, value)
		model.addAttribute("message", message);
		
		return "helloworld";
	}
	
	// new controller method to read form data using @RequestParam
	// @RequestParam("param_name") String temp_var, Model model_name
	// "param_name" is binded to temp_var
	@RequestMapping("/processFormAnnotation")
	public String processFormAnnotation(@RequestParam("requestParam") 
					String requestParam, Model model) {
		
		// convert the data to lowercase
		requestParam = requestParam.toLowerCase();
		
		// create the message
		String message = "This is the requestParam: " + requestParam;
		
		// add message to model (name_of_attr, value)
		model.addAttribute("requestParam", message);
		
		return "helloworld";
	}
	
}
