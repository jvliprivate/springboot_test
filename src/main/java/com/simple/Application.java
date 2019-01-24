package com.simple;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class})
@EnableAutoConfiguration
@ComponentScan
@MapperScan("com.simple.mapper")
@EnableTransactionManagement(proxyTargetClass = true)
@EnableDubboConfiguration
public class Application {//implements EmbeddedServletContainerCustomizer{
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
}
