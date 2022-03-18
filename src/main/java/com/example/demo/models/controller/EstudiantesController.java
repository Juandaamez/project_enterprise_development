package com.example.demo.models.controller;

import com.example.demo.models.services.IEstudianteService;
import lombok.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller

public class EstudiantesController {

    @Autowired
    private IEstudianteService EstudianteService;


}
