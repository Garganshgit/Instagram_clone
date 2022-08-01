package com.instagram.clone.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagram.clone.Entity.Users;
import com.instagram.clone.Repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	public Users submitMetaDataOfUser(Users users) {
		return userRepo.save(users);
	}
	
	public Users displayUserMetaData(String userid) {
		Users user =  this.userRepo.findByUserId(userid);
		return user;
	}
}
