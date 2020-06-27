package com.tbeet.ourbooks.controllers;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tbeet.ourbooks.models.dao.IUsuarioDao;
import com.tbeet.ourbooks.models.entity.Usuario;

@RestController
@RequestMapping("/")
public class UsuarioController {

	@Autowired
	private IUsuarioDao usuariosImpl;
	
	@GetMapping("allUsers")
	public List<Usuario> traerTodosLosUsuarios(){		
		List<Usuario> listaUsuarios = (List<Usuario>) usuariosImpl.findAll();	
		return listaUsuarios;
	}

	

	
}
