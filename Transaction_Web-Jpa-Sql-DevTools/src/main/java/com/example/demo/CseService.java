package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CseService {
	@Autowired 
	StudentRepo srepo;
	
	public String insertData(StudentDTO dto) {
		Student st = new Student();
		st.setName(dto.getName());
		st.setBranch(dto.getBranch());
		srepo.save(st);
		
	    Address ad = new Address();
//	    Address ad = null;
		ad.setCity(dto.getCity());
		ad.setState(dto.getState());
		
		st.setAddress(ad);
		srepo.save(st);
		
		return "Successfully Inserted";
	}
}
