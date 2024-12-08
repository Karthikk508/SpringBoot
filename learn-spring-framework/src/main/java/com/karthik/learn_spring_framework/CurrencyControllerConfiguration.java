package com.karthik.learn_spring_framework;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyControllerConfiguration {
	
	
	@Autowired
	public CurrencyServiceConfiguration configuration;
	
	
	@RequestMapping("/courses")
	public CurrencyServiceConfiguration retrieveAllCourses(){
		
		return configuration;
	}
	
	
	
	
	
	

}


//http://localhost:8080/courses

