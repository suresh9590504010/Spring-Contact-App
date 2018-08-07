package com.project.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.config.SpringRootConfig;
import com.project.dao.UserDao;
import com.project.domain.User;

public class TestUserDaoupdate {

	public static void main(String[] args) {
	
	ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringRootConfig.class);
	UserDao userDao=ctx.getBean(UserDao.class);
	User u=new User();
	u.setUserid(8); 
	u.setName("siddaaaa");
	u.setPhone("77777");
	u.setEmail("siddaaaa@123");
	u.setAddress("kerur");
	u.setRole(1);
	u.setLoginStatus(1);
	userDao.update(u);
	System.out.println("data updated");
	}

}
