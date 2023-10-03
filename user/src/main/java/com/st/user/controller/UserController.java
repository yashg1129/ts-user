package com.st.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.user.entity.User;
import com.st.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping
	public User save(@RequestBody User user) {
		return service.saveOrUpdate(user);
	}
	
	@PutMapping
	public User update(@RequestBody User user) {
		return service.saveOrUpdate(user);
	}
	
	@GetMapping
	public List<User> findAll() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public User findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}

	@DeleteMapping("{id}")
	public void deleteById(@PathVariable("id") Integer id) {
		service.deleteById(id);
	}
}
