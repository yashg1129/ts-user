package com.st.user.service;

import java.util.List;

import com.st.user.entity.User;

public interface UserService {
	
	public User saveOrUpdate(User user);
	
	public List<User> findAll();
	
	public User findById(Integer id);
	
	public void deleteById(Integer id);
		
}
