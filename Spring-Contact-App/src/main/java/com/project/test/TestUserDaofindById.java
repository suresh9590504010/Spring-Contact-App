package com.project.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.config.SpringRootConfig;
import com.project.dao.UserDao;
import com.project.domain.User;

public class TestUserDaofindById {

	public static void main(String[] args) {
	
	ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringRootConfig.class);
	UserDao userDao=ctx.getBean(UserDao.class);

	User u=userDao.findById(1);
	System.out.println("user detailes");
	System.out.println("\n");
	System.out.println(u.getUserid());
	System.out.println(u.getName());
	System.out.println(u.getPhone());
	System.out.println(u.getEmail());
	System.out.println(u.getAddress());
	System.out.println(u.getLoginName());
	System.out.println(u.getRole());
	System.out.println(u.getLoginStatus());
	}

}
