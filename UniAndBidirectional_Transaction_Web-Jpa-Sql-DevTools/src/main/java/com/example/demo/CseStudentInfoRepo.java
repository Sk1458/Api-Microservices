package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CseStudentInfoRepo extends JpaRepository<CseStudentInfoEntity, Integer> {
	
	
	  @Query("select q from CseStudentInfoEntity q where q.city = :city") public
	  List<CseStudentInfoEntity> showByCity(@Param("city") String city);
	 
}
