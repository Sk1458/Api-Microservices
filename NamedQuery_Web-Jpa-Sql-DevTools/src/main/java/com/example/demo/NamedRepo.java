package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NamedRepo extends JpaRepository<CseNamedEntity, Integer> {
	List<CseNamedEntity> getAll();
	List<CseNamedEntity> getByName(String name);

}
