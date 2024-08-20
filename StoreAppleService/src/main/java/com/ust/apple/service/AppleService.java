package com.ust.apple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.apple.entity.Apple;
import com.ust.apple.repository.AppleRepository;


@Service
public class AppleService {
	

	
	@Autowired 
	AppleRepository appleRepository;
	
	public Apple createApple(Apple a1)
	{
		return appleRepository.save(a1);
	}
	
	public List<Apple> getAllApple()
	{
		return appleRepository.findAll();
	}


}
