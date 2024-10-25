package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Autowired
	CseStudentRepo repo1;
	
	@Autowired
	CseStudentInfoRepo repo2;
	
	
	@PostMapping("/insert")
	public String insert(@RequestBody CseStudentEntity data) {
		repo1.save(data);
		return "Successfuly inserted";
	}
	
	
	@GetMapping("/display")
	public List<CseStudentEntity> displayAll() {
		return repo1.findAll();
	}
	 
	@GetMapping("/display/{city}")
	public List<CseStudentEntity> showByCity(@PathVariable("city") String city) { 
		List<CseStudentInfoEntity> studentInfoList = repo2.showByCity(city); 
		return studentInfoList.stream()
							  .map(CseStudentInfoEntity::getStud) 
							  .collect(Collectors.toList()); 
	}
	 
}
