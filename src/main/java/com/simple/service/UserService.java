package com.simple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.simple.domain.User;
import com.simple.mapper.UserMapper1;

@Service
public class UserService  {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private UserMapper1 userMapper1;
	
	public void createUser(String name, Integer age) {
		System.out.println("ssss");
		User user = new User();
		user.setName(name);
		user.setAge(""+age);
		userMapper1.add(user);
		//jdbcTemplate.update("insert into user (name,age)values(?,?);", name, age);
	}
	
	
	public User getOne(Integer id) {
		return userMapper1.getUserById(id);
	}
	public List<User> getAll() {
		System.out.println("ssss");
		return userMapper1.getUserList();
	}


	public User getList() {
		return userMapper1.getUserList().get(0);
	}
}
