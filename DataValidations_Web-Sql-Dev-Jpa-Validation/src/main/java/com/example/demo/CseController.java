package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class CseController {
	
	@Autowired
	CseService serv;
	
	@PostMapping("/cse/insert")
	public String insertData(@RequestBody @Valid CseDTO data) {
		serv.saveData(data);
		return "Successfully saved the data";
	}
}
