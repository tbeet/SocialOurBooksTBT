package com.tbeet.ourbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tbeet.ourbooks.models.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{
 //aca se hace una especie de clausula where, donde se va a buscar por correo
	public Usuario findByCorreo(String correo);
}
