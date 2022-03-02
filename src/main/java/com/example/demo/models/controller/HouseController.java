package com.example.demo.models.controller;


import com.example.demo.models.services.IHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller

public class HouseController {

    @Autowired
    private IHouseService HouseService;



}
