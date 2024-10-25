package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@Autowired
	CseService cse;
	
	@PostMapping("/insert")
	public String insert(@RequestBody StudentDTO data) {
		return cse.insertData(data);
	}
}
