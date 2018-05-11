package com.simple.controller.page;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author admin
 *
 */
@Controller
public class PageController {

	/**
	 * ftl支持
	 * @param map
	 * @return
	 */
	@RequestMapping("/index")
	public String index(Map<String, Object> map) {
	    map.put("name","美丽的天使...");
		return "index";
	}
	
	@RequestMapping("/index2")
	public String index2(Map<String, Object> map) {
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
