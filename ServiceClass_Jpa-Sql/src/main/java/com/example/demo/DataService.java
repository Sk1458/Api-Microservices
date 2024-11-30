package com.example.demo;

import java.util.List;

public interface DataService {
	
	public boolean addEmployee(DataEntity emp);
	
	public List<DataEntity> geAllData();
	
	public DataEntity getById(int id);
	
	public boolean updateEmp(int id, String role);
}
