package com.example.demo.models.dao;

import com.example.demo.entities.Reservas;
import org.springframework.data.repository.CrudRepository;

public interface IreservasDao extends CrudRepository<Reservas, Long> {
}
