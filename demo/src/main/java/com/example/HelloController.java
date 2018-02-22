package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class HelloController {
	
	@RequestMapping(value="hi", method = RequestMethod.GET)
	public String sayHello(){
		return "Hello U!";
	}

}
