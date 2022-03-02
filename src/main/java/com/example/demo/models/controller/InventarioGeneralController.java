package com.example.demo.models.controller;

import com.example.demo.models.services.IEstudianteService;
import com.example.demo.models.services.IinventarioGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller

public class InventarioGeneralController {

    @Autowired
    private IinventarioGeneralService inventarioGeneralService;



}
