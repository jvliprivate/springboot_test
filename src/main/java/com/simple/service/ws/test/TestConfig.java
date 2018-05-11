package com.simple.service.ws.test;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.simple.service.ws.service.UserWebServiceImp;

//@Configuration
 public class TestConfig {
     
//          @Bean
//         public ServletRegistrationBean dispatcherServlet() {
//             return new ServletRegistrationBean(new CXFServlet(), "/test/*");
//         }
//         @Bean(name = Bus.DEFAULT_BUS_ID)
//         public SpringBus springBus() {
//             return new SpringBus();
//         }
//         @Bean
//         public UserWebServiceImp userWebService() {
//             return new UserWebServiceImp();
//         }
//         @Bean
//         public Endpoint endpoint() {
//             EndpointImpl endpoint = new EndpointImpl(springBus(), userWebService());
//             endpoint.publish("/userWeb");
//             return endpoint;
//         }
 
 }
