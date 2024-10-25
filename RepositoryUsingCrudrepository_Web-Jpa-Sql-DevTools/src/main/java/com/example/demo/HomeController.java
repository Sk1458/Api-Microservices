package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Autowired
	DataRepo repo;
	
	@RequestMapping("/insert")
	public StudentsEntity insert(@RequestBody StudentsEntity sdata) {
		
		return repo.save(sdata);
	}
	
	@GetMapping("/students")
	public List<StudentsEntity> disp() {
		List<StudentsEntity> data = (List<StudentsEntity>) repo.findAll();
		
		return data;
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete (@PathVariable("id") Integer sid) {
		
		Optional<StudentsEntity> d = repo.findById(sid);
		
		if(d.isPresent()) {
			repo.deleteById(sid);
			return "Id data deleted!";
		}
		else {
			return "Id not found";
		}
	}
	
	
}
