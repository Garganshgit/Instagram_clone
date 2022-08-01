package com.instagram.clone.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagram.clone.Entity.Post;
import com.instagram.clone.Repository.PostRepo;

@Service
public class PostService {
	
	@Autowired
	PostRepo postRepo;
	
	@Autowired
	UserService userService;
	
	public Post submitPostToDataBase(Post post) {
		return this.postRepo.save(post);
	}
	
	public ArrayList<Post> retrivePostFromDB(){
		
        ArrayList<Post> postList = postRepo.findAll();
		
		for(int i=0; i<postList.size(); i++) {
			Post postItem = postList.get(i);
			postItem.setUserName(userService.displayUserMetaData(postItem.getUserId()).getUserName());
		}
		
		return postList;
		
	}
	
}
