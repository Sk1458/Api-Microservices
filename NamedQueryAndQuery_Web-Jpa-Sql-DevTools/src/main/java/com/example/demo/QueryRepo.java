package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface QueryRepo extends JpaRepository<QueryEntity, Integer> {
	
	@Query("select q from QueryEntity q")
	public List<QueryEntity> showData();
	
	@Query("select q from QueryEntity q where q.name = :name")
	public List<QueryEntity> showDataByName(@Param("name") String name);
	
	@Query("select q from QueryEntity q where q.name = :n and q.subject = :sub")
	public List<QueryEntity> showDataByNameAndSubject(@Param("n") String name, @Param("sub") String subject);
	
	@Query("select q from QueryEntity q where q.subject = :sub and q.marks = :marks")
	public List<QueryEntity> showDataBySubjectAndMarks(@Param("sub") String subject, @Param("marks") int marks);
	
	@Query("select q from QueryEntity q where q.marks >= :marks")
	public List<QueryEntity> showMarksGreaterThan(@Param("marks") int marks);
	
	@Query("select q from QueryEntity q where q.marks <= :marks")
	public List<QueryEntity> showMarksLessThan(@Param("marks") int marks);
}
