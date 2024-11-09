package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@Autowired
	RegistrationRepo repo;
	
	@GetMapping("/home")
	public String home() {
		return "WELCOME TO HOMEPAGE";
	}
	
	@PostMapping("/register")
	public Registration insert(@RequestBody Registration data) {
		return repo.save(data);
	}
	
	@GetMapping("/display")
	public List<Registration> disp(){
		List<Registration> data = (List<Registration>) repo.findAll();
		return data;
	}
	
	@GetMapping("/display/id/{id}")
	public Optional<Registration> empbyyid(@PathVariable String id) {
	    Optional<Registration> d = repo.findById(id);
	    if (d.isPresent()) {
	        return repo.findById(id);
	    }
		return d;
	   
	}
	
	@DeleteMapping("/delete/id/{id}")
	public String delete(@PathVariable String id) {
	    Optional<Registration> d = repo.findById(id);
	    if (d.isPresent()) {
	        repo.deleteById(id);
	        return "Deleted";
	    }
	    return "Registered data with " + id + " not found";
	}
	
	
}
