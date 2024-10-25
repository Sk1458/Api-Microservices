package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SortController {
	
	@Autowired
	SortService cse;
	
	@PostMapping("/cse/insert")
	public SortEntity insertData(@RequestBody SortEntity data) {
		
		return cse.insertData(data);
	}
	
	@GetMapping("/cse/{field}")
	public List<SortEntity> sortData(@PathVariable("field") String field) {
		
		return cse.sortData(field); //the mySort here is a custom made function by us
	}
	
	@GetMapping("/cse2/{offset}/{pagesize}")
	public Page<SortEntity> csePage(@PathVariable int offset, @PathVariable int pagesize) {
		
		Page<SortEntity> pageData = cse.pageOff(offset, pagesize);
		return pageData;
	}

}
