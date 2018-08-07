package com.project.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.config.SpringRootConfig;
import com.project.dao.UserDao;
import com.project.domain.User;

public class TestUserDaofindByAll {

	public static void main(String[] args) {
	
	ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringRootConfig.class);
	UserDao userDao=ctx.getBean(UserDao.class);

	List<User> users=userDao.findAll();
	for(User u : users) {
		System.out.println(u.getUserid()+" "+u.getName()+" "+u.getPhone());
	}
	
	}
}
