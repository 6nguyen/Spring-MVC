package com.gnguyen92.springmvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
		
		System.out.println(">> CustomerController: firstName = |" + thisCustomer.getFirstName() + "|");
		System.out.println(">> CustomerController: lastName = |" + thisCustomer.getLastName() + "|");
		System.out.println(">> CustomerController: password = |" + thisCustomer.getPassword() + "|");
		
		// if there's a binding error, send back to customer-form.jsp
		if(bindingResult.hasErrors()){
			return "customer-form";
		}
		
		return "customer-confirmation";
	}
	
	// @InitBinder pre-processes all web requests coming to the controller
	// used to trim whitespace from fields so users entering an all-whitespace field will return null
	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		
		// Spring method to trim leading and trailing whitespace.  (true) means there is whitespace
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		// register the editor we just made onto the WebDataBinder
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
}
