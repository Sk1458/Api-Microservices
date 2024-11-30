package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImplementation implements DataService {
	
	@Autowired
	DataRepo repo;

	@Override
	public boolean addEmployee(DataEntity emp) {
		// TODO Auto-generated method stub
		
		repo.save(emp);
		try {
			repo.save(emp);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<DataEntity> geAllData() {
		// TODO Auto-generated method stub
		
		return (List<DataEntity>) repo.findAll();
	}

	@Override
	public DataEntity getById(int id) {
		// TODO Auto-generated method stub
		
		Optional<DataEntity> opt =  repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		else {
			return null;
		}
	}

	@Override
	public boolean updateEmp(int id, String role) {
		// TODO Auto-generated method stub
		
		DataEntity et = getById(id);
		if(et != null) {
			et.setRole(role);
			repo.save(et);
			return true;
		}
		else {
			return false;
		}
	}

}
