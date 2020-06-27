package com.tbt.api.ourbooks.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tbt.api.ourbooks.models.User;

//se indica que entidad(modleo) va a trabajar y con que atributos <clase user, atributo id>
public interface IUserRepository extends JpaRepository<User, Integer>{

}
