package com.instagram.clone.Repository;

import org.springframework.data.repository.CrudRepository;

import com.instagram.clone.Entity.Users;

public interface UserRepo extends CrudRepository<Users, Integer>{
	
	Users save(Users users);
	Users findByUserId(String userid);
	
}
