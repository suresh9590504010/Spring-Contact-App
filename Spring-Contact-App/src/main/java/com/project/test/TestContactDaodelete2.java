package com.project.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.config.SpringRootConfig;
import com.project.dao.ContactDao;
import com.project.dao.UserDao;
import com.project.domain.User;

public class TestContactDaodelete2 {

	public static void main(String[] args) {
	
	ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringRootConfig.class);
	ContactDao contactDao=ctx.getBean(ContactDao.class);

	contactDao.delete(1);
	System.out.println("data deleted");
	}

}
