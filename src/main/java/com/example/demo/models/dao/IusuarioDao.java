package com.example.demo.models.dao;

import com.example.demo.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IusuarioDao extends CrudRepository<Usuario, Long> {

}
