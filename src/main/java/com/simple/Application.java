package com.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableAutoConfiguration
public class Application implements EmbeddedServletContainerCustomizer{
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
	/* (设置启动端口)
	 * @see org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer#customize(org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer)
	 */
	@Override
	public void customize(ConfigurableEmbeddedServletContainer con) {
		con.setPort(8004);  
	}
}
