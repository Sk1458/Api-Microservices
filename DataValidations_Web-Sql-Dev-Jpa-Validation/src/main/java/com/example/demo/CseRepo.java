package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CseRepo extends JpaRepository<CseModelData, Integer> {
	
	List<CseModelData> findByEmail(String email);
}
