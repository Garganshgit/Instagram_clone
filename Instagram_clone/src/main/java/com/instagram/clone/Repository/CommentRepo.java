package com.instagram.clone.Repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.instagram.clone.Entity.Comments;

@Repository
public interface CommentRepo extends CrudRepository<Comments, Integer>{
	
	Comments save(Comments comments);
	ArrayList<Comments> findAllByPostId(String postId);
	ArrayList<Comments> findAll();
	
}
