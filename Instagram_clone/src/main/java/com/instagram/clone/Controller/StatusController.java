package com.instagram.clone.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.instagram.clone.Entity.Status;
import com.instagram.clone.Service.StatusService;

@RestController
@RequestMapping("/status")
public class StatusController {
	
	@Autowired
	StatusService statusService;
	
	@PostMapping("")
	public Status submitStatus(@RequestBody Status status) {
		return statusService.submitDataIntoDB(status);
	}
	
	@GetMapping("")
	public ArrayList<Status> getAllStatus(){
		return statusService.retrieveStatus();
	}
	
}
