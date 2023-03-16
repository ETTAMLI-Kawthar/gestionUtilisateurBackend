package com.nadhem.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nadhem.admin.entities.User;
import com.nadhem.admin.service.UserServiceimp;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class usercontroller {

	@Autowired
	private UserServiceimp userService;

	@GetMapping("/all")
	public List<User> getUsr() {
		return userService.getAllUser();
	}

	@PostMapping("/add")
	public void addUtilisateur(@RequestBody User user) {
		userService.saveUser(user);
	}

	@GetMapping("/{id}")
	public User getUtilisateurbyId(@PathVariable("id") Long id) {
		return userService.getUserById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteUtilisateurbyId(@PathVariable("id") Long id) {
		userService.deleteUser(id);
		return "user deleted";
	}

	@PutMapping("/updateUser")
	public User updateUtilisateur(@RequestBody User user) {
		return userService.updateUser(user);
	}
}
