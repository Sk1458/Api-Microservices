package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryController {
	
	@Autowired
	QueryService qserv;
	
	@PostMapping("/insert")
	public QueryEntity insertData(@RequestBody QueryEntity data) {
		return qserv.insertIntoDb(data);
	}
	
	@GetMapping("/display")
	public List<QueryEntity> displayData() {
		return qserv.showData();
	}
	
	@GetMapping("/display/{name}")
	public List<QueryEntity> displayByName(@PathVariable("name") String name) {
		return qserv.showDataByName(name);
	}
	
	@GetMapping("/display/{name}/{subject}")
	public List<QueryEntity> displayByNameAndSubject(@PathVariable("name") String name, @PathVariable("subject") String subject) {
		return qserv.showByNameAndSubject(name, subject);
	}
	
	@GetMapping("/display2/{subject}/{marks}")
	public List<QueryEntity> displayBySubjectAndMarks(@PathVariable("subject") String subject, @PathVariable("marks") int marks) {
		return qserv.showDataBySubjectAndMarks(subject, marks);
	}
	
	@GetMapping("/display/gt/{marks}")
	public List<QueryEntity> displayMarksGreaterThan(@PathVariable("marks") int marks) {
		return qserv.showMarksGreaterThan(marks);
	}
	
	@GetMapping("display/lt/{marks}")
	public List<QueryEntity> displayMarksLessThan(@PathVariable("marks") int marks) {
		return qserv.showMarksLessThan(marks);
	}
	
	
}
