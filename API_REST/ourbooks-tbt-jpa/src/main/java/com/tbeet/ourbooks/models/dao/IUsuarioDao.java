package com.tbeet.ourbooks.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tbeet.ourbooks.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{


	
}
