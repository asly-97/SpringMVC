package com.revature.SpringMVCDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping
	public String main() {
		return "Hello Adam! This a simple Spring Boot App - Updated";
	}
	
}
