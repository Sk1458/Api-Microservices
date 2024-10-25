package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

@RestController
public class CseSwaggerController {
	
	@Autowired
	CseSwaggerRepo repo;
	
	@Operation(
			summary = "to insert students into database",
			description = "if you want to add these details, then use this Restend Api"
			)
	@PostMapping("/cse/insert")
	public String insert(@RequestBody CseSwagger data) {
		repo.save(data);
		return "Inserted Successfully";
	}
	
	@Operation(
			summary="To Display Students Data",
			description="If you want to see student details use this RestEnd API"
			)
	@GetMapping("/cse/display")
	public List<CseSwagger> display() {
		return repo.findAll();
	}
	
	@Operation(
			summary="To Get  Students Data by ID from Database",
			description="If you want to get student details by id use this RestEnd API"
			)
	@GetMapping("/cse/display/{id}")
	public Optional<CseSwagger> dispById(@Parameter(description = "Enter Id of a student", required = true)
	@PathVariable("id") int sid) {
		return repo.findById(sid);
	}
	
	@DeleteMapping("/cse/delete/{branch}")
	public int deleteData(@PathVariable("branch") String branch) {
		return repo.deleteByBranch(branch);
	}
	
	@PutMapping("/cse/update/{newBranch}/{currentBranch}")
	public int updateData(@PathVariable String newBranch, @PathVariable String currentBranch) {
		return repo.updateByBranch(newBranch, currentBranch);
	}
}
