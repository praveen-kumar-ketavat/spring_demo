package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class WelcomeController {
	@GetMapping("/greeting")
	public String greeting() {
		return "Welcome to Spring Project";
	}

}
