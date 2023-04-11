package com.docker.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

	@GetMapping("/get")
	public ResponseEntity<String> get(){
		return new ResponseEntity<>("get hi",HttpStatus.OK);		
	}
	
	@GetMapping("/getall")
	public ResponseEntity<String> getall(){
		return new ResponseEntity<>("get hi hi hi hi hi hi hi hi",HttpStatus.OK);		
	}
	
}
