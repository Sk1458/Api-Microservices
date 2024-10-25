package com.example.demo;

import org.hibernate.SessionFactory;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.Session;

@RestController
public class HomeController {
	
	@Autowired
	CseSequenceRepo crepo;
	
	@PostMapping("/insert")
	public CseCustomEntity insertDataForCse(@RequestBody CseCustomEntity data) {
        return crepo.save(data);
	}
	
	/*
	 * @PostMapping("/insert/aiml") public CseCustumEntity2
	 * insertDataForAiml(@RequestBody CseCustumEntity2 data) { return
	 * arepo.save(data); }
	 */

		
}
