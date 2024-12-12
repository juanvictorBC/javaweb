package com.lptecnologia.javaweb.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lptecnologia.javaweb.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u  = new User(1L, "Maria", "testeemail", "teste Phone", "Teste pass");
		return ResponseEntity.ok().body(u);
	}
}
