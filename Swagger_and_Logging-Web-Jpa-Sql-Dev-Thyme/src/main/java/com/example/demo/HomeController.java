package com.example.demo;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class HomeController {
	
	Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	SwaggerRepo repo;
	
	@Operation(
			summary = "to insert students into database",
			description = "if you want to add these details, then use this Restend Api"
	)
	@PostMapping("/insert")
	public String insert(@RequestBody SwaggerEntity data) {
		SwaggerEntity savedEntity = repo.save(data);
		log.info("User performed action: Insert Student with ID: {}", savedEntity.getId());
		return "Inserted Successfully";
	}
	
	
	@Operation(
			summary="To Display Students Data",
			description="If you want to see student details use this RestEnd API"
	)
	@GetMapping("/display")
	public List<SwaggerEntity> display() {
		log.info("User performed action: Display All Students");
		return repo.findAll();
	}
	
	
	@Operation(
			summary="To Get  Students Data by ID from Database",
			description="If you want to get student details by id use this RestEnd API"
	)
	@GetMapping("/display/id/{id}")
	public Optional<SwaggerEntity> dispById(@Parameter(description = "Enter Id of a student", required = true)
											@PathVariable("id") int sid) {
		log.info("User performed action: Display Student by ID: {}", sid);
		return repo.findById(sid);
	}
	
	@Operation(
			summary="To Get  Students Data by branch from Database",
			description="If you want to get student details by branch use this RestEnd API"
	)
	@GetMapping("/display/branch/{branch}")
	public List<SwaggerEntity> dispByBranch(@Parameter(description = "Enter branch of a student", required = true)
											@PathVariable("branch") String branch) {
		log.info("User performed action: Display Student by branch: {}", branch);
		return repo.findByBranch(branch);
	}
	
	
	@Operation(
			summary="To Get  Students Data by college from Database",
			description="If you want to get student details by college use this RestEnd API"
	)
	@GetMapping("/display/college/{college}")
	public List<SwaggerEntity> dispByCollege(@Parameter(description = "Enter college of a student", required = true)
											@PathVariable("college") String college) {
		log.info("User performed action: Display Student by college: {}", college);
		return repo.findByCollege(college);
	}
	
	
	@Operation(
			summary="To Delete Students Data by branch from Database",
			description="If you want to delete student data by branch use this RestEnd API"
	)
	@DeleteMapping("/delete/branch/{branch}")
	public int deleteBranch(@PathVariable("branch") String branch) {
		log.info("User performed action: Delete Students by Branch: {}", branch);
		return repo.deleteByBranch(branch);
	}
	
	
	@Operation(
			summary="To Delete Students Data by college from Database",
			description="If you want to delete student data by college use this RestEnd API"
	)
	@DeleteMapping("/delete/college/{college}")
	public int deleteCollege(@PathVariable("college") String college) {
		log.warn("WARNING: User performed action: Delete Students by College: {}", college);
		return repo.deleteByCollege(college);
	}
	
	
	@Operation(
			summary="To Update Students Data by branch from Database",
			description="If you want to update student data by branch use this RestEnd API"
	)
	@PutMapping("/update/{newBranch}/{currentBranch}")
	public int updateData(@PathVariable String newBranch, @PathVariable String currentBranch) {
		log.info("User performed action: Update Students from Branch '{}' to '{}'", currentBranch, newBranch);
		return repo.updateByBranch(newBranch, currentBranch);
	}
	
}
