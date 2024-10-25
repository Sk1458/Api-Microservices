package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Autowired
	FacultyRepo frepo;
	
	@PostMapping("/insert")
	public String inserData(@RequestBody Faculty data) {
		frepo.save(data);
		
		return "Successfully inserted";
	}
}
