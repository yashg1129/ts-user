package com.st.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.st.user.entity.User;
import com.st.user.repository.UserRepository;
import com.st.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repo;
	
	@Override
	public User saveOrUpdate(User user) {
		return repo.save(user);
	}

	@Override
	public List<User> findAll() {
		return repo.findAll();
	}

	@Override
	public User findById(Integer id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public void deleteById(Integer id) {
		repo.deleteById(id);
	}

}
