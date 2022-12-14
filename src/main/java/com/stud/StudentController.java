package com.stud;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StudentController {

	@Autowired
	private RestTemplate restTemplate;
	
	private static String url = "https://jsonplaceholder.typicode.com/posts/1/comments";
	
	@GetMapping(value = "/comments")
	public List<Object> getComments(){
		
	Object[] comments = restTemplate.getForObject(url , Object[].class);
	return Arrays.asList(comments);
		
	}
}
