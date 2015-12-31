package com.kavali.jsfspring.managedbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.kavali.jsfspring.service.TestingService;

@Component
@Scope("session")
public class TestBean {

	@Autowired
	TestingService service;

	public TestingService getService() {
		return service;
	}
	
}
