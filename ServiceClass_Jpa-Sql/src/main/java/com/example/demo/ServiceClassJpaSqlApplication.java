package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ServiceClassJpaSqlApplication {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(ServiceClassJpaSqlApplication.class, args);
		DataService data = con.getBean(DataServiceImplementation.class);
		
//		DataEntity ent = new DataEntity();
//		ent.setId(501);
//		ent.setName("Adam");
//		ent.setRole("SDE");
//		ent.setSalary(5);
//		
//		boolean status = data.addEmployee(ent);
//		if(status) {
//			System.out.println("Inserted Data Successfully");
//		}
//		else {
//			System.out.println("Error ocurred, failed to insert data");
//		}
		
//		List<DataEntity> allData = data.geAllData();
//		for(DataEntity i : allData) {
//			System.out.println(i.getId());
//			System.out.println(i.getName());
//			System.out.println(i.getRole());
//			System.out.println(i.getSalary());
//			System.out.println("-------------------------------");
//		}
		
//		DataEntity emp = data.getById(501);
//		if(emp != null) {
//			System.out.println(emp.getId());
//			System.out.println(emp.getName());
//			System.out.println(emp.getRole());
//			System.out.println(emp.getSalary());
//		}
//		else {
//			System.out.println("Id not found");
//		}
		
		
//		boolean status = data.updateEmp(501, "ProjectManager");
//		if(status) {
//			System.out.println("Updated Successfully");
//		}
//		else {
//			System.out.println("Id not found");
//		}
	}

}
