package com.project.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.project"})
public class SpringRootConfig {

	//Database,Services,etc....
	
	@Bean
	public BasicDataSource getDataSource() {
		
		BasicDataSource bs=new BasicDataSource();
		
		bs.setDriverClassName("com.mysql.jdbc.Driver");
		bs.setUrl("jdbc:mysql://localhost:3306/contactapp_db");
		bs.setUsername("hbstudent");
		bs.setPassword("hbstudent");
		bs.setMaxTotal(2);
		bs.setInitialSize(1);
		bs.setTestOnBorrow(true);
		bs.setValidationQuery("select 1");
		bs.setDefaultAutoCommit(true);
		return bs;
	
		
	}
}
