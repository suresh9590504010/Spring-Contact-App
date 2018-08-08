package com.project.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.mysql.cj.exceptions.FeatureNotAvailableException;
import com.project.domain.Contact;
import com.project.domain.User;
import com.project.rm.ContactRowMapper;

@Repository
public class ContactDaoImpl extends BaseDao implements ContactDao {

	public void save(Contact C) {
		String sql="insert into contact(userId, name, phone, email, address, remark)"
				+ "values(:userId, :name, :phone, :email, :address, :remark)";
		Map m=new HashMap();
		m.put("userId", C.getUserId());
		m.put("name", C.getName());
		m.put("phone", C.getPhone());
		m.put("email", C.getEmail());
		m.put("address", C.getAddress());
		m.put("remark", C.getRemark());
        SqlParameterSource ps=new MapSqlParameterSource(m);
        KeyHolder kh=new GeneratedKeyHolder();
        getNamedParameterJdbcTemplate().update(sql, ps, kh);
        C.setContactId(kh.getKey().intValue());
	}

	public void update(Contact C) {
	
		String sql="UPDATE contact SET name=:name, phone=:phone, email=:email, address=:address, remark=:remark WHERE contactId=:contactId";
		Map m= new HashMap();
		m.put("contactId", C.getContactId());
		m.put("name", C.getName());
		m.put("phone", C.getPhone());
		m.put("email", C.getEmail());
		m.put("address", C.getAddress());
		m.put("remark", C.getRemark());
		getNamedParameterJdbcTemplate().update(sql, m);
	}

	public void delete(Contact C) {
		this.delete(C.getContactId());
	}

	public void delete(Integer contactid) {
	
		String sql="delete from contact where contactId=?";
	    getJdbcTemplate().update(sql, contactid);
	}

	public Contact findById(Integer contactid) {
		
		String sql="select contactId, userid, name, phone, email, address, remark from contact where contactId=?";
		Contact c=getJdbcTemplate().queryForObject(sql, new ContactRowMapper(), contactid);
		return c;
		
	}

	public List<Contact> findAll() {
		String sql="select contactId, userid, name, phone, email, address, remark from contact";
		return getJdbcTemplate().query(sql, new ContactRowMapper());
		
	}

	public List<Contact> findByProperty(String propName, Object propValue) {
		String sql="select contactId, userid, name, phone, email, address, remark from contact where "+propName+"=?";
		return getJdbcTemplate().query(sql, new ContactRowMapper(), propValue);
	}

}
