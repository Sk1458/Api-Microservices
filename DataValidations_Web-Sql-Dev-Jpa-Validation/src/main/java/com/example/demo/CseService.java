package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CseService {
	
	@Autowired
	CseRepo repo;
	
	public String saveData(CseDTO dto) {
		CseModelData cse = new CseModelData();
		cse.setName(dto.getName());
		cse.setBranch(dto.getBranch());
		cse.setEmail(dto.getEmail());
		cse.setMarks(dto.getMarks());
		
		repo.save(cse);
		return "Successfully saved the data into DB";
	}
}
