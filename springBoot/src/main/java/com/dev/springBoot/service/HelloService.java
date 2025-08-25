package com.dev.springBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.springBoot.mapper.HelloMapper;

@Service
public class HelloService {
	
	@Autowired
	HelloMapper mapper;

	public String getMember(String user_id){
		return mapper.getMember(user_id);
		
	}
}
