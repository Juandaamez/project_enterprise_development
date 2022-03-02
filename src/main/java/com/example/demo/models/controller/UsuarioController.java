package com.example.demo.models.controller;

import com.example.demo.models.services.IEstudianteService;
import com.example.demo.models.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller

public class UsuarioController {

    @Autowired
    private IUsuarioService UsuarioService;



}
