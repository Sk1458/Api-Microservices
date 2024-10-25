package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueryService {

	@Autowired
	QueryRepo qrepo;
	
	public QueryEntity insertIntoDb(QueryEntity data) {
		return qrepo.save(data);
	}
	
	public List<QueryEntity> showData() {
		return qrepo.showData();
	}
	
	public List<QueryEntity> showDataByName(String name) {
		return qrepo.showDataByName(name);
	}
	
	public List<QueryEntity> showByNameAndSubject(String name, String subject) {
		return qrepo.showDataByNameAndSubject(name, subject);
	}
	
	public List<QueryEntity> showDataBySubjectAndMarks(String subject, int marks) {
		return qrepo.showDataBySubjectAndMarks(subject, marks);
	}
	
	public List<QueryEntity> showMarksGreaterThan(int marks) {
		return qrepo.showMarksGreaterThan(marks);
	}
	
	public List<QueryEntity> showMarksLessThan(int marks) {
		return qrepo.showMarksLessThan(marks);
	}
}
