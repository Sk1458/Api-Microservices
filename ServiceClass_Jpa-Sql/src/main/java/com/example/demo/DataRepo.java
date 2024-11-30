package com.example.demo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepo extends JpaRepository<DataEntity, Integer> {

}
