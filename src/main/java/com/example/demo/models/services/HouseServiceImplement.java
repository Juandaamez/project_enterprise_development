package com.example.demo.models.services;

import com.example.demo.entities.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HouseServiceImplement implements IHouseService{

    @Autowired
    private IHouseService iHouseService;

    @Override
    @Transactional(readOnly = true)
    public List<House> findAll(){
        return (List<House>) iHouseService.findAll();
    }


}
