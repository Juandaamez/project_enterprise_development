package com.example.demo.models.services;

import com.example.demo.entities.Estudiantes;
import com.example.demo.entities.House_inventary;

import java.util.List;

public interface IHouseInventaryService {
    public List<House_inventary> findAll();

}
