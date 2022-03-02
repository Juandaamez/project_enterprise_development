package com.example.demo.models.services;

import com.example.demo.entities.Inventario_general;
import com.example.demo.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService{

    @Autowired
    private IUsuarioService iUsuarioService;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> findAll(){
        return (List<Usuario>) iUsuarioService.findAll();
    }



}
