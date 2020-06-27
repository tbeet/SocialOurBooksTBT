package com.tbeet.ourbooks.models.dao.implem;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tbeet.ourbooks.models.dao.IUsuarioDao;
import com.tbeet.ourbooks.models.entity.Usuario;


@Repository
public class UsuarioDaoImpl implements IUsuarioDao{

	/*EntityManager es el encargado de manejar las clases entidades y su ciclo  de vida, es decir todas las operaciones la bd pero 
	como objetos - las consultas siempre son a jpa no directamente a la bd*/
	
	@PersistenceContext //contiene la unidad de persistencia, es deecir la bd a la que se va a  conectar
	private EntityManager em; 



	@Override
	public <S extends Usuario> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Usuario> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Optional<Usuario> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Iterable<Usuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Iterable<Usuario> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(Usuario entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAll(Iterable<? extends Usuario> entities) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}




}
