package com.spring.security.SpringSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String welCome() {
		System.out.println("in home controller..");
		return "<h1>Welcome buddy!!!</h1>";
	}
	
	@GetMapping("/user")
	public String user() {
		System.out.println("in home user..");
		return "<h1>Welcome User!!!</h1>";
	}
	
	@GetMapping("/admin")
	public String admin() {
		System.out.println("in home admin..");
		return "<h1>Welcome Admin!!!</h1>";
	}
}
