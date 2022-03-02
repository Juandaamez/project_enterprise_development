package com.example.demo.models.dao;

import com.example.demo.entities.House;
import org.springframework.data.repository.CrudRepository;

public interface IhouseDao extends CrudRepository<House, Long> {
}
