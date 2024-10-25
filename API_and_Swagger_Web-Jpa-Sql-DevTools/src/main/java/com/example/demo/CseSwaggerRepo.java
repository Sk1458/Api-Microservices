package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;

public interface CseSwaggerRepo extends JpaRepository<CseSwagger, Integer> {
	@Transactional
	@Modifying
	@Query("delete from CseSwagger i where i.branch = :b")
	int deleteByBranch(@Param("b") String branch);

	@Transactional
	@Modifying
	@Query("update CseSwagger i set i.branch = ?1 where i.branch = ?2")
	int updateByBranch(String newBranch, String currentBranch);

}
