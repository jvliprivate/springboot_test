package com.simple.service;

import java.util.List;
import com.simple.domain.TUsers;
import com.simple.domain.User;


public interface UserService {
	public void createUser(String name, Integer age);

	public User getOne(Integer id);

	public List<User> getAll();

	public User getList();

	public TUsers selectTUsers();
}
