package com.example.demo.Conroller;



import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller 
public class Controller {
	@GetMapping("/home")
	public String Home() {
		return "Home"; 
	}

}   
  