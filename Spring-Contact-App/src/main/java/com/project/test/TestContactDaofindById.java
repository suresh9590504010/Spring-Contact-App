package com.project.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.config.SpringRootConfig;
import com.project.dao.ContactDao;
import com.project.dao.UserDao;
import com.project.domain.Contact;
import com.project.domain.User;

public class TestContactDaofindById {

	public static void main(String[] args) {
	
	ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringRootConfig.class);
	ContactDao contactDao=ctx.getBean(ContactDao.class);

	Contact c=contactDao.findById(3);
	System.out.println("user detailes");
	System.out.println("\n");
	System.out.println(c.getContactId());
	System.out.println(c.getUserId());
	System.out.println(c.getName());
	System.out.println(c.getPhone());
	System.out.println(c.getEmail());
	System.out.println(c.getAddress());
	System.out.println(c.getRemark());
	
	}

}
