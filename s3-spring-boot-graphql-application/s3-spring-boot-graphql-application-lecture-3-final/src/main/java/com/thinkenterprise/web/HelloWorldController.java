package com.thinkenterprise.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**  
* GraphQL Spring Boot Samples 
* Design and Development by Michael Schäfer 
* Copyright (c) 2019 
* All Rights Reserved.
* 
* @author Michael Schäfer
*/

@RestController
public class HelloWorldController {
	
	@GetMapping("helloWorld")
	public String helloWorld() {
		return "Hello World";
	}

}
