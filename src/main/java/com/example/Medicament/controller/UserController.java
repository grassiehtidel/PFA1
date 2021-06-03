package com.example.Medicament.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Medicament.entites.User;
import com.example.Medicament.service.BusinessResourceException;
import com.example.Medicament.service.UserService;



@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@RestController
@RequestMapping("/user/*")
@PostMapping(value = "/users")
@Transactional

public class UserController {
	@Autowired
	private UserService userService;	
	
	@GetMapping(value = "/users")
	public ResponseEntity<Collection<User>> getAllUsers() throws BusinessResourceException {
		List<User> users = userService.findAll();
		return new ResponseEntity<Collection<User>>(users, HttpStatus.FOUND);
	}
	
	public ResponseEntity<User> saveUser(@RequestBody User user) throws BusinessResourceException {
		
		User userSaved = userService.saveOrUpdateUser(user);		
 		return new ResponseEntity<User>(userSaved, HttpStatus.CREATED);
 	}
	
	  @PutMapping(value = "/users")
	    public ResponseEntity<User> updateUser(@RequestBody User user) throws BusinessResourceException {
			User userUpdated = userService.saveOrUpdateUser(user);
			return new ResponseEntity<User>(userUpdated, HttpStatus.OK);
		}
	  
	  @GetMapping("/user/{userId}")
	    public Optional<User> findUserById (@PathVariable long userId) throws BusinessResourceException{
		return userService.findById(userId);
	    }
	    
	  
	  
	@DeleteMapping(value = "/users")
	public ResponseEntity<Void> deleteUser(@RequestParam(value = "id", required = true) Long id) throws BusinessResourceException {
		userService.deleteUser(id);
		return new ResponseEntity<Void>(HttpStatus.GONE);
 	}
	
	
	
	@GetMapping(value = "/users/{id}")
	public ResponseEntity<User> findUserById(@PathVariable(value = "id") Long id) throws BusinessResourceException {
		Optional<User> userFound = userService.findById(id);
		return new ResponseEntity<User>(userFound.get(), HttpStatus.FOUND);
	}
	
	@GetMapping(value = "/")
	public String get() {
		return "index";}
	
}


