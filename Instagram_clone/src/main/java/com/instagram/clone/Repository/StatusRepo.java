package com.instagram.clone.Repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.instagram.clone.Entity.Status;

public interface StatusRepo extends CrudRepository<Status, Integer>{
	
	Status save(Status status);
	ArrayList<Status> findAll();
	
}
