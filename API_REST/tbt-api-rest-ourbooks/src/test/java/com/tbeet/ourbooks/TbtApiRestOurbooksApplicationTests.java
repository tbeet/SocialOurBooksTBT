package com.tbeet.ourbooks;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.tbeet.ourbooks.models.Usuario;
import com.tbeet.ourbooks.repository.IUsuarioRepository;

@SpringBootTest
class TbtApiRestOurbooksApplicationTests {
	
	@Autowired
	private IUsuarioRepository repo;
	
	@Autowired
	private SpringSecurityConfig encoder;

	@Test
	void crearUsuyarioTest() {
		Usuario user = new Usuario();
		user.setIdUsuario(1);
		user.setNombreUsuario("and9925");
		user.setNombres("andres");
		user.setApellidos("vega");
		user.setCorreo(("and9925@gma00il.com"));
		user.setPais("España");
		user.setContrasena(encoder.passwordEncoder().encode("123"));
		user.setFechaCreacion(new Date());
		
		Usuario retorno = repo.save(user);
		
		assertThat(retorno.getContrasena().equals(user.getContrasena()));
	}

}
