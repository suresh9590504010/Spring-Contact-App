package com.project.rm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.project.domain.Contact;
import com.project.domain.User;

public class ContactRowMapper implements RowMapper<Contact> {

public Contact mapRow(ResultSet rs, int i) throws SQLException {
		
	Contact c=new Contact();
	c.setContactId(rs.getInt("contactId"));
	c.setName(rs.getString("name"));
	c.setPhone(rs.getString("phone"));
	c.setEmail(rs.getString("email"));
	c.setAddress(rs.getString("address"));
	c.setRemark(rs.getString("remark"));
		return c;
}
}
