package com.simple.controller.rest;

import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simple.domain.User;
import com.simple.service.UserService;

@RestController
//@EnableAutoConfiguration
//@ConfigurationProperties(prefix = "port", ignoreUnknownFields = true)
public class FirstController {
	
	private Integer port; 
	@Autowired
	private UserService userService; 
	
	@RequestMapping("/hello/{id}")
	public String index(@PathVariable Integer id) {
		
		System.out.println("id:::"+id);
		System.out.println(port);
		return "Hello World"+port+"\r\nid::"+id;
	}	
	
	@RequestMapping("/hello2/{name}")
	public String index2(@PathVariable String name) throws Exception {
//		JaxWsDynamicClientFactory dcf =JaxWsDynamicClientFactory.newInstance();
//        org.apache.cxf.endpoint.Client client =dcf.createClient("http://localhost:8003/test/userWeb?wsdl");
//        //getUser 为接口中定义的方法名称  张三为传递的参数   返回一个Object数组
//        Object[] objects=client.invoke("getUser","411001");
//        User user = (User)objects[0];
        //输出调用结果
       // System.out.println("*****"+user.toString());
		userService.createUser(name, 33);
		return "Hello World";//objects[0].toString();
	}	
	
}
