package com.tbt.api.ourbooks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tbt.api.ourbooks.Repository.IUserRepository;
import com.tbt.api.ourbooks.models.User;

@RestController
@RequestMapping("/")
public class loginController {

	
	@Autowired
	private IUserRepository UserRepo;
	
	
	
	@GetMapping("prueba")
	public String prueba() {
		
		User user = new User();
		user.setIdUsuario(1);
		user.setCorreo("correo");
		user.setClaveIngreso("123");
		
		UserRepo.save(user);
		return "prueba";
		
	}
}
