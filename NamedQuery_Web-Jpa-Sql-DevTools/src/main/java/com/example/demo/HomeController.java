package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Autowired
	NamedRepo nrepo;
	
	@PostMapping("/insert")
	public CseNamedEntity insert(@RequestBody CseNamedEntity data) {
		return nrepo.save(data);
	}
	
	@GetMapping("/display")
	public List<CseNamedEntity> display() {
		return nrepo.getAll();
	}
	
	@GetMapping("/display/{name}")
	public List<CseNamedEntity> display2(@PathVariable("name") String name) {
		return nrepo.getByName(name);
	}
}	
