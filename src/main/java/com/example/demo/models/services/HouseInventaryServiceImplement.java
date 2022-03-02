package com.example.demo.models.services;


import com.example.demo.entities.House_inventary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HouseInventaryServiceImplement implements IHouseInventaryService{

    @Autowired
    private IHouseInventaryService iHouseInventaryService;

    @Override
    @Transactional(readOnly = true)
    public List<House_inventary> findAll(){
        return (List<House_inventary>) iHouseInventaryService.findAll();
    }


}
