package com.packt.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/careers")
	public String welcome(Model model) {
		model.addAttribute("greeting", "Welcome to the Web Store");
		model.addAttribute("tagline","The one and only Amazing Webstore");
	return "welcome";
	}
	
}
