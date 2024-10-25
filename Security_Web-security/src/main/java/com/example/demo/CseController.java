package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {
	@GetMapping("/cse/home")
	public String cseHome() {
		return "WELCOME TO HOME PAGE";
	}
	
	@GetMapping("/cse/students")
	public String cseStudents() {
		return "WELCOME TO CSE STUDENTS PAGE";
	}
	
	@GetMapping("/cse/staff")
	public String cseStaff() {
		return "WELCOME TO CSE STAFF PAGE";
	}
	
	@GetMapping("/cse/aboutus")
	public String cseAboutUs() {
		return "WELCOME TO CSE ABOUT US PAGE";
	}
}
