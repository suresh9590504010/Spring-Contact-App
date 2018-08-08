package com.project.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.config.SpringRootConfig;
import com.project.dao.ContactDao;
import com.project.dao.UserDao;
import com.project.domain.Contact;
import com.project.domain.User;

public class TestContactDaofindByAll {

	public static void main(String[] args) {
	
	ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringRootConfig.class);
	ContactDao contactDao=ctx.getBean(ContactDao.class);

	List<Contact> users=contactDao.findAll();
	for(Contact c : users) {
		System.out.println(c.getUserId()+" "+c.getName()+" "+c.getPhone()+ " "+c.getContactId());
	}
	
	}
}
