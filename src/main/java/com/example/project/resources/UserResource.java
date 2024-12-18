package com.example.project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entities.User;

@RestController // significa que é um recurso disponível web
@RequestMapping(value = "/users") // isso configura um endpoint /users
public class UserResource {
	
	@GetMapping // isso diz que toda requisição http do tipo get vai invocar o método findAll
	public ResponseEntity<User> findAll() {
		User user = new User(1,"Luana", "luana@email.com", "5562999999", "123456789");
		return ResponseEntity.ok().body(user);
	}
}
