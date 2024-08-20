package com.ust.apple.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.apple.entity.Apple;
import com.ust.apple.service.AppleService;



@RestController
@RequestMapping("/api/service")
public class AppleController {
	
	@Autowired 
	AppleService appleService;
	@PostMapping("/createApple")
	public ResponseEntity<Apple> createMilk(@RequestBody Apple a1)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(appleService.createApple(a1));
	}
	
	@GetMapping("/fetchApple")
	public ResponseEntity<List<Apple>> getAllapple()
	{
		return ResponseEntity.status(HttpStatus.OK).body(appleService.getAllApple());
	}

}
