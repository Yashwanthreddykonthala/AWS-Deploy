package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Csecontroller {
	@GetMapping("/adityaCse")
	public String rocks() {
		return "WELCOME TO ADITYA CSE";
	}
	
	@GetMapping("/adityaIt")
	public String rocks1() {
		return "WELCOME TO ADITYA IT";
	}
}