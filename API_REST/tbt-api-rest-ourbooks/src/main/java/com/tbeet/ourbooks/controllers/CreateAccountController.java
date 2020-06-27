package com.tbeet.ourbooks.controllers;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.hibernate.JDBCException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tbeet.ourbooks.models.Usuario;
import com.tbeet.ourbooks.services.UsuarioService;

@RestController
public class CreateAccountController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	
	@PostMapping("/createAccount")
	public ResponseEntity<Usuario> createAccount(@RequestBody Usuario usuario){
		Usuario account = usuarioService.crearCuenta(usuario);
		return new ResponseEntity<Usuario>(account, HttpStatus.CREATED);
	}
	
	@GetMapping("/user")
	public ResponseEntity<Optional<Usuario> > user(@RequestParam(name = "idUsuario") int idUsuario){
		Optional<Usuario> user = usuarioService.getUsuario(idUsuario);
		return new ResponseEntity<Optional<Usuario> >(user, HttpStatus.OK);
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<Usuario>> users(){
		try {
			List<Usuario> listUsersAll = usuarioService.getUsuarios();
			return new ResponseEntity<List<Usuario>>(listUsersAll,HttpStatus.OK);	
		} catch (JDBCException e) {
			SQLException cause = (SQLException) e.getCause();
			//evaluate cause and find out what was the problem
			System.out.println("El error se produce por = " +cause.getCause());
			return null;
		}
		
	}
}
