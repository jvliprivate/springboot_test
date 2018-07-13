package com.simple;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication 
//@EnableAutoConfiguration
//@MapperScan("com.simple.mapper")        
//@EnableTransactionManagement(proxyTargetClass = true)  
public class Application {//implements EmbeddedServletContainerCustomizer{
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
	/** (设置启动端口)
	 * @see org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer#customize(org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer)
	 */
	/*@Override
	public void customize(ConfigurableEmbeddedServletContainer con) {
		con.setPort(8004);  
	}*/
//	@Bean
//	@ConfigurationProperties(prefix = "spring.datasource")    //作用：加载application.properties文件中的数据库连接参数
//	public DataSource dataSource(){
//	    return new DataSource();
//	}
	
}
