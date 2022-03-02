package com.example.demo.models.services;

import com.example.demo.entities.Inventario_general;
import com.example.demo.entities.Reservas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReservasServicesImplement implements IReservasService{

    @Autowired
    private IReservasService iReservasService;

    @Override
    @Transactional(readOnly = true)
    public List<Reservas> findAll(){
        return (List<Reservas>) iReservasService.findAll();
    }



}
