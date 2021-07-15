package com.joyloruth.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joyloruth.Models.User;
import com.joyloruth.Repos.UserRepository;


@Service
@Transactional
public class UserService {
	
	
	@Autowired
	private UserRepository repo;
	
	public List<User> listAll() {
		return repo.findAll();
	}
	
	public void save(User user) {
		repo.save(user);
	}
	
	public User get(long cityId) {
		return repo.findById(cityId).get();
	}
	
	public void delete(long cityId) {
		repo.deleteById(cityId);
	}
	
	
	
	
	
	

}
