package com.project.dao;

import java.util.List;

import com.project.domain.Contact;
import com.project.domain.User;

public interface ContactDao {


	public void save(Contact C);
	public void update(Contact C);
	public void delete(Contact C);
	public void delete(Integer contactid);
	public Contact findById(Integer contactid);
	public List<Contact> findAll();
	public List<Contact> findByProperty(String propName, Object propValue);
}
