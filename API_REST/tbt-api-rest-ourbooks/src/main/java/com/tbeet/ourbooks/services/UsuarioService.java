package com.tbeet.ourbooks.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tbeet.ourbooks.SpringSecurityConfig;
import com.tbeet.ourbooks.models.Usuario;
import com.tbeet.ourbooks.repository.IUsuarioRepository;

@Service
public class UsuarioService implements UserDetailsService{

	@Autowired
	private IUsuarioRepository repoUsuario;
	
	@Autowired
	private SpringSecurityConfig encoder;

	
	public List<Usuario> getUsuarios() {
		Iterable<Usuario> users = repoUsuario.findAll();
		List<Usuario> list = new ArrayList<Usuario>();
		users.forEach(list::add);
		return list;
	}
	

	public Optional<Usuario> getUsuario(int idUsuario) {
		Optional<Usuario> user = repoUsuario.findById(idUsuario);		
		return user;
	}
	
	
	public Usuario crearCuenta(Usuario usuario) {
		usuario.setContrasena(encoder.passwordEncoder().encode(usuario.getContrasena()));
		return repoUsuario.save(usuario);
	}


	
	/*aqui se indica de donde se va a sacar los datos del usuario que se intenta autenticar*/
	@Override
	public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException {
		Usuario us = repoUsuario.findByCorreo(correo);
		//estos roles se debn sacar de la bd, aqui es solo para pruebas
		List<GrantedAuthority> roles = new ArrayList<>();
		roles.add(new SimpleGrantedAuthority("ADMIN"));
		roles.add(new SimpleGrantedAuthority("DEVELOPER"));
		roles.add(new SimpleGrantedAuthority("QA"));
		
		
		//aca indico con que parametro va a acceder el usuario (correo), contrasena y roles que tenga
		UserDetails userDEt = new User(us.getCorreo(), us.getContrasena(),roles);
		
		return userDEt;//SE RETORNA LA INFORMACION DEL USUARIO QUE QUIERE INICIAR SESION
		
	}
}
