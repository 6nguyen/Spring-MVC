/* 
 *  GoodbyeWorldController demonstrates Controller @RequestMapping,
 *  as opposed to the method @RequestMapping seen before.
 * 	This way, methods are allowed to have the same request mapping
 * 	path because they'll be appended to the Controller mapping.
 * 
 * 	..spring-mvc-demo/goodbye/showForm 
 * 	AS OPPOSED TO 
 * 	../spring-mvc-demo/showForm
 * */

package com.gnguyen92.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("goodbye")
public class GoodbyeWorldController {

	// controller method to show form
	@RequestMapping("showForm")
	public String showForm(){
		return "helloworld-form";
	}
	
	// controller method to process form
	@RequestMapping("processFormAnnotation")
	public String processFormAnnotation(@RequestParam("requestParam") 
							String requestParam, Model model){
		
		// do something with the requestParam
		String message = "Goodbye, " + requestParam;
		
		// add message to model ("name_attribute", value)
		model.addAttribute("requestParam", message);
		
		return "helloworld";
	}
}
