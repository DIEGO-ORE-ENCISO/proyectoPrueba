package com.diego.proyecto_prueba.controller;

import com.diego.proyecto_prueba.entity.Futbolistas;
import com.diego.proyecto_prueba.service.FutbolistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://proyecto-ee9d5.web.app")
public class FutbolistaController {

    @Autowired
    private FutbolistaService futbolistaService;

    @GetMapping("/futbolista/saludar")
    public String saludarFutbolista() {
        return "Bienvenido al Futbolista";
    }

    @GetMapping("/listar")
    @ResponseBody
    public List<Futbolistas> listar() {
        return futbolistaService.getFutbolistas();
    }

}
