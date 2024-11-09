package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CorsService {
	
	@Autowired
	CorsRepo repo;
	
	public boolean insertData(CorsData data) {
		try {
			repo.save(data);
			return true;
		}
		catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	public List<CorsData> getData() {
		return repo.findAll();
	}
}
