package com.simple.mapper;

import java.util.List;

import com.simple.domain.TUsers;
import com.simple.domain.User;

public interface TUsersMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(TUsers record);

    int insertSelective(TUsers record);

    TUsers selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(TUsers record);

    int updateByPrimaryKey(TUsers record);

	void add(User user);

	User getUserById(Integer id);

	List<User> getUserList();
}