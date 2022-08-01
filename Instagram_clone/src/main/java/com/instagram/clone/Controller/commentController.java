package com.instagram.clone.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.instagram.clone.Entity.Comments;
import com.instagram.clone.Service.CommentsService;

@CrossOrigin
@RestController
@RequestMapping("/comments")
public class commentController {
	
	@Autowired
	CommentsService commentsService;
	
	@PostMapping("")
	private Comments submitComment(@RequestBody Comments comments) {
		return commentsService.submitCommentToDB(comments);
	}
	
	@GetMapping("/{postId}")
	private ArrayList<Comments> getCommentsForPost(@PathVariable String postId){
		return commentsService.getAllCommentsForDB(postId);
	}
	
}
