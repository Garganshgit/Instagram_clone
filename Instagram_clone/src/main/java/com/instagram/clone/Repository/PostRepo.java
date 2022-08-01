package com.instagram.clone.Repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.instagram.clone.Entity.Post;

public interface PostRepo extends CrudRepository<Post, Integer>{
	
	Post save(Post post);
	ArrayList<Post> findAll();
	
}
