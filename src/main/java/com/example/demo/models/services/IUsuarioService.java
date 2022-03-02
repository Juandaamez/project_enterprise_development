package com.example.demo.models.services;

import com.example.demo.entities.Reservas;
import com.example.demo.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public List<Usuario> findAll();

}
