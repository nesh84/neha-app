package com.boot.dev.ops.test.TestApl.conroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	//Below are list user in the application
	@GetMapping("/")
	public String home(){
		return "DevOps test application - UP!";
	}
}
