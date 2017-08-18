package com.gnguyen92.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
