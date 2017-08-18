package com.gnguyen92.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	// define controller method with @RequestMapping to redirect all calls to this method
	@RequestMapping("/")
	public String showPage() {
		// Return view name, Spring will insert prefix and suffix from servlet xml
		// create main-menu.jsp in view/
		return "main-menu";
	}
	
	//
}
