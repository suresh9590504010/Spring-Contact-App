package com.project.test;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.project.config.SpringRootConfig;

public class TestDataSource {

	public static void main(String[] args) {
		
ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringRootConfig.class);

DataSource ds=ctx.getBean(DataSource.class);
JdbcTemplate jt=new JdbcTemplate(ds);
String sql="insert into user(name, phone, email, address, loginName, password) values(?,?,?,?,?,?)";
	
Object[] param=new Object[] {"umesh","9580504010","umesh@123","chikodi","ddd","ddd1"};

jt.update(sql, param);



System.out.println("sql executed");

	}

}
