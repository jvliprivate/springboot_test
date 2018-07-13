package com.simple.controller.page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.simple.domain.User;
import com.simple.service.UserService;

/**
 * @author admin
 *
 */
@Controller
public class PageController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * ftl支持
	 * @param map
	 * @return
	 */
	@RequestMapping("/index")
	public String index(Map<String, Object> map) {
		User user = userService.getList();
		
		map.put("name",user.getName()+"---"+user.getAge());
	    //map.put("name","美丽的天使...");
		return "index";
	}
	
	@RequestMapping("/index2")
	public String index2(Map<String, Object> map) {
		
		System.out.println(map.get("c"));
	    map.put("name","###蚂蚁课堂###");
	    map.put("sex",1);
	    List<String> userlist=new ArrayList<String>();
	    userlist.add("余胜军");
	    userlist.add("张三");
	    userlist.add("李四");
	    map.put("userlist",userlist);
	    return "index2";
	}
	
	@RequestMapping("/index3/{id}")
	public String index3(@PathVariable Integer id) {
		System.out.println(id);
		Map map=new HashMap<String,Object>();
	    map.put("name","###蚂蚁课堂###");
	    map.put("sex",1);
	    List<String> userlist=new ArrayList<String>();
	    userlist.add("余胜军");
	    userlist.add("张三");
	    userlist.add("李四");
	    map.put("userlist",userlist);
	    return "index2";
	}
}
