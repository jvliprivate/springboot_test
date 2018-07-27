package com.simple.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.simple.config.YmlConfig;
import com.simple.domain.TUsers;
import com.simple.service.UserService;

@RestController
//@EnableAutoConfiguration
//@ConfigurationProperties(prefix = "port", ignoreUnknownFields = true)
public class FirstController {
	@Autowired
	private YmlConfig ymlConfig;//测试yml配置文件读取
	@Autowired
	private UserService userService; 
	
	@GetMapping("/hello/{id}")
	public YmlConfig index(@PathVariable Integer id) {
		
		System.out.println("id:::"+id);
		//System.out.println(port);
		String result = "";
		ObjectMapper objectMapper = new ObjectMapper();  
        try {
			System.out.println("arrayProps: " + objectMapper.writeValueAsString(ymlConfig.getFreemarker()));
	        System.out.println("listProp1: " + objectMapper.writeValueAsString(ymlConfig.getDatasource()));
	        System.out.println("listProp2: " + objectMapper.writeValueAsString(ymlConfig.getResources()));
	        result = objectMapper.writeValueAsString(ymlConfig.getFreemarker());
        } catch (JsonProcessingException e) {
        	// TODO Auto-generated catch block
        	e.printStackTrace();
        }    
		return ymlConfig;
	}	
	
	@GetMapping("/hello2/{name}")
	public TUsers index2(@PathVariable String name) throws Exception {
//		JaxWsDynamicClientFactory dcf =JaxWsDynamicClientFactory.newInstance();
//        org.apache.cxf.endpoint.Client client =dcf.createClient("http://localhost:8003/test/userWeb?wsdl");
//        //getUser 为接口中定义的方法名称  张三为传递的参数   返回一个Object数组
//        Object[] objects=client.invoke("getUser","411001");
//        User user = (User)objects[0];
//        //输出调用结果
//        System.out.println("*****"+user.toString());
//		userService.createUser(name, 33);
		TUsers user= userService.selectTUsers();
		return user;//objects[0].toString();
	}	
	
}
