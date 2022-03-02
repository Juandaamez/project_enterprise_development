package com.example.demo.models.controller;

import com.example.demo.models.services.IEstudianteService;
import com.example.demo.models.services.IReservasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller

public class ReservasController {

    @Autowired
    private IReservasService ReservasService;



}
