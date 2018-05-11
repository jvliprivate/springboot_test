package com.simple.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService  {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void createUser(String name, Integer age) {
		System.out.println("ssss");
		jdbcTemplate.update("insert into user (name,age)values(?,?);", name, age);
	}
}
