package com.project.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.config.SpringRootConfig;
import com.project.dao.ContactDao;
import com.project.dao.UserDao;
import com.project.domain.Contact;
import com.project.domain.User;

public class TestContactDaosave {

	public static void main(String[] args) {
	
	ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringRootConfig.class);
	ContactDao contactDao=ctx.getBean(ContactDao.class);
	Contact c=new Contact();
    c.setUserId(1);
	c.setName("santosh");
	c.setPhone("55555");
	c.setEmail("santosh@123");
	c.setAddress("pune");
	c.setRemark("good guy ");

	contactDao.save(c);
	System.out.println("data saved");
	}

}
