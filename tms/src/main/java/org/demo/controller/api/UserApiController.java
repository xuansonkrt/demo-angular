package org.demo.controller.api;

import java.util.List;

import org.demo.Services.UserService;
import org.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class UserApiController {
	@Autowired
	UserService userService;
	
	
	 @GetMapping("/hello")
	 public String greet() {
	  return "Hello from the other side!!!";
	 }
	 
	 @GetMapping("/getAll")
	 public List<User> getAllUser() {
	     return userService.getAll();
	     
	 }
}
