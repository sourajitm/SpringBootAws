package com.test.aws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello()
	{
		return "Hello World!";
		//for testing
	}

}
