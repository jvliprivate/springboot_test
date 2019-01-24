package com.simple.service.ws.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

import com.simple.domain.User;

@WebService(targetNamespace="http://ws.service.simple.com/",endpointInterface = "com.simple.service.ws.service.UserWebService")
 public class UserWebServiceImp implements UserWebService{
     
     private Map<String, User> userMap = new HashMap<String, User>();
     public UserWebServiceImp() {
         System.out.println("向实体类插入数据");
         User user = new User();
         user.setId(411001);
         user.setName("zhansan");
         user.setAge("20");

//         user.setUpdateTime(new Date());
         userMap.put(""+user.getId(), user);
         
         user = new User();
         user.setId(411002);
         user.setName("lisi");
         user.setAge("30");
//         user.setUpdateTime(new Date());
         userMap.put(user.getId()+"", user);
         
         user = new User();
         user.setId(411003);
         user.setName("wangwu");
         user.setAge("40");
//         user.setUpdateTime(new Date());
         userMap.put(user.getId()+"", user);
     }
//     @Override
//     public String getName(String userId) {
//         return "liyd-" + userId;
//     }
//     @Override
//     public User getUser(String userId) {
//         System.out.println("userMap是:"+userMap);
//         return userMap.get(userId);
//     }
	@Override
	public String getName(String userId) {
		// TODO Auto-generated method stub
        return userMap.get(Integer.valueOf(userId)).getName();
	}
	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return userMap.get(Integer.valueOf(userId));
	}
 
 }
