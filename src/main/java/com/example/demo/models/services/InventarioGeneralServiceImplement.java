package com.example.demo.models.services;

import com.example.demo.entities.House;
import com.example.demo.entities.Inventario_general;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InventarioGeneralServiceImplement implements IinventarioGeneralService{

    @Autowired
    private IinventarioGeneralService iinventarioGeneralService;

    @Override
    @Transactional(readOnly = true)
    public List<Inventario_general> findAll(){
        return (List<Inventario_general>) iinventarioGeneralService.findAll();
    }



}
