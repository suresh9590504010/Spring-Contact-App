package com.project.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.config.SpringRootConfig;
import com.project.dao.UserDao;
import com.project.domain.User;

public class TestUserDaosave {

	public static void main(String[] args) {
	
	ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringRootConfig.class);
	UserDao userDao=ctx.getBean(UserDao.class);
	User u=new User();
	u.setName("siddu");
	u.setPhone("666666");
	u.setEmail("siddu@123");
	u.setAddress("kadapur");
	u.setLoginName("sid");
	u.setPassword("sid123");
	u.setRole(1);
	u.setLoginStatus(1);
	userDao.save(u);
	System.out.println("data saved");
	}

}
