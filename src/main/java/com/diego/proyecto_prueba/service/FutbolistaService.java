package com.diego.proyecto_prueba.service;

import com.diego.proyecto_prueba.entity.Futbolistas;
import com.diego.proyecto_prueba.interfaces.IFutbilistas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FutbolistaService {

    @Autowired
    private IFutbilistas data;

    public List<Futbolistas> getFutbolistas() {
        return data.findAll();
    }


}
