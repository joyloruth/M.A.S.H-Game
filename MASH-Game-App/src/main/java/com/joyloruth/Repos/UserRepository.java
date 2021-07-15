package com.joyloruth.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joyloruth.Models.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
}


