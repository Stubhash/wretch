package com.wretch.wretchmaven.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/tradingpage.html")
@RestController
public class LoginRestController {
	
	@GetMapping("/tradingpage.html")
	public String tradingpage() {
		return "/tradingpage.html";
	}
	
	@RequestMapping("/Loginpage.html")
	public String login() {
		return "Loginpage.html";
	}

}
