package com.gnguyen92.springmvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	
	@RequestMapping("/showForm")
	public String showForm(Model model){
		
		Customer customer = new Customer();
		// create a customer object instance
		model.addAttribute("customer", customer);
		
		return "customer-form";
	}
	
	// @Valid annotation used to validate form data
	// argument syntax: processForm(@Valid @ModelAttribute("attr_name") Class classObject, BindingResult bindResult)
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer thisCustomer, BindingResult bindingResult){
		
		
		
		// if there's a binding error, send back to customer-form.jsp
		if(bindingResult.hasErrors()){
			return "customer-form";
		}
		
		return "customer-confirmation";
	}
}
