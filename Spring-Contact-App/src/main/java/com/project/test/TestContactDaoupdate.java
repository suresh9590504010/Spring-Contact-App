package com.project.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.config.SpringRootConfig;
import com.project.dao.ContactDao;
import com.project.dao.UserDao;
import com.project.domain.Contact;
import com.project.domain.User;

public class TestContactDaoupdate {

	public static void main(String[] args) {
	
	ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringRootConfig.class);
	ContactDao contactDao=ctx.getBean(ContactDao.class);
	Contact c=new Contact();
	c.setContactId(1);
	c.setName("vidya");
	c.setPhone("999");
	c.setEmail("vidya@123");
	c.setAddress("kolhapur");
	c.setRemark("good girl");

	contactDao.update(c);
	System.out.println("data updated");
	}

}
