package com.example.demo.models.services;

import com.example.demo.entities.Estudiantes;
import com.example.demo.models.dao.IestudiantesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EstudianteServiceImplement implements IEstudianteService {

    @Autowired
    private IestudiantesDao iestudiantesDao;

    @Override
    @Transactional(readOnly = true)
    public List<Estudiantes> findAll(){
        return (List<Estudiantes>) iestudiantesDao.findAll();
    }


}
