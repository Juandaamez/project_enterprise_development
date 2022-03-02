package com.example.demo.models.services;

import com.example.demo.entities.Estudiantes;
import com.example.demo.entities.Reservas;

import java.util.List;

public interface IReservasService {
    public List<Reservas> findAll();

}
