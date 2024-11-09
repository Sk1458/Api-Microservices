package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorsController {
	
	@Autowired
	CorsService serv;
	
	@PostMapping("/insertdata")
	public String insert(@RequestBody CorsData data) {
		
		if(serv.insertData(data)) {
			return "Inserted SuccessFully";
		}
		else return "Insertion Failed";
	}
	
	@CrossOrigin("http://127.0.0.1:5500")
	@GetMapping("/getdata")
	public List<CorsData> display() {
		return serv.getData();
	}
}
