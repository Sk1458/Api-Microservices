package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;

public interface SwaggerRepo extends JpaRepository<SwaggerEntity, Integer> {
	@Transactional
	@Modifying
	@Query("delete from SwaggerEntity i where i.branch = :b")
	int deleteByBranch(@Param("b") String branch);
	
	@Transactional
	@Modifying
	@Query("delete from SwaggerEntity i where i.college = :c")
	int deleteByCollege(@Param("c") String college);

	@Transactional
	@Modifying
	@Query("update SwaggerEntity i set i.branch = ?1 where i.branch = ?2")
	int updateByBranch(String newBranch, String currentBranch);

	@Query("select i from SwaggerEntity i where i.branch = :branch")
	public List<SwaggerEntity> findByBranch(@Param("branch") String branch);

	@Query("select i from SwaggerEntity i where i.college = :college")
	public List<SwaggerEntity> findByCollege(@Param("college") String college);

	
}
