package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class SortService {
	
	@Autowired
	SortRepo srepo;
	
	public SortEntity insertData(SortEntity data) {
		
		return srepo.save(data);	
	}
	
	public List<SortEntity> sortData(String field) {
		
		return srepo.findAll(Sort.by(Sort.Direction.ASC, field));
	}
	
	public Page<SortEntity> pageOff(int offset, int pageSize) {
		
		Page<SortEntity> data = srepo.findAll(PageRequest.of(offset, pageSize));
		
		return data;
		
	}
}
