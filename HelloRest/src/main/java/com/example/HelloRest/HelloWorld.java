package com.example.HelloRest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorld {
	
	@GetMapping("/hello")
	public String hello(@RequestParam(name = "name", defaultValue = "World") String name) {
		return "Hello" + name;
		
	}
 
	 @PostMapping("/hello")
	 public String add() {
		 return "you sent POST request";
	 }
  
	@PutMapping("/hello")
	public String update() {
		return "you sent PUT request";
	}
	 @DeleteMapping("/hello")
	public String delete() {
		return "you have sent DELETE request";
	}
}
