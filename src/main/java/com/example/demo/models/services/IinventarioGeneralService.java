package com.example.demo.models.services;

import com.example.demo.entities.Estudiantes;
import com.example.demo.entities.Inventario_general;

import java.util.List;

public interface IinventarioGeneralService {
    public List<Inventario_general> findAll();

}
