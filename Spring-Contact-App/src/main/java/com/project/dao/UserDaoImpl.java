package com.project.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.project.domain.User;

@Repository
public class UserDaoImpl extends BaseDao implements UserDao {

	public void save(User u) {
	
	String sql="insert into user(name,phone, email, address, loginName, password,role,loginStatus)"
		
			+ "values(:name, :phone, :email, :address, :loginName, :password, :role, :loginStatus)";
	Map m=new HashMap();
	m.put("name", u.getName());
	m.put("phone", u.getPhone());
	m.put("email", u.getEmail());
	m.put("address", u.getAddress());
	m.put("loginName", u.getLoginName());
	m.put("password", u.getPassword());
	m.put("role", u.getRole());
	m.put("loginStatus", u.getLoginStatus());
	
	KeyHolder kh=new GeneratedKeyHolder();
	SqlParameterSource ps=new MapSqlParameterSource(m);
	super.getNamedParameterJdbcTemplate().update(sql, ps, kh);
	
	Integer userid=kh.getKey().intValue();
	u.setUserid(userid);
	
	}

	public void update(User u) {
		
		String sql="update user" + " set name=:name," + "phone=:phone,"
		+ "email=:email, "+ "address=:address," + "role=:role," + "loginStatus=:loginStatus "
				+ "where userid=:userid ";
		
		Map m=new HashMap();
		
		m.put("name", u.getName());
		m.put("phone", u.getPhone());
		m.put("email", u.getEmail());
		m.put("address", u.getAddress());
		m.put("role", u.getRole());
		m.put("loginStatus", u.getLoginStatus());
		m.put("userid", u.getUserid());
		
		getNamedParameterJdbcTemplate().update(sql, m);
		
	}

	public void delete(User u) {
		this.delete(u.getUserid());
		
	}

	public void delete(Integer userid) {
		String sql="delete from user where userid=?";
		getJdbcTemplate().update(sql, userid);
	}

	public User findById(Integer userid) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByProperty(String propName, Object propValue) {
		// TODO Auto-generated method stub
		return null;
	}

}
