package com.ar.djev.controller;

import com.ar.djev.dto.CategoriaDto;
import com.ar.djev.service.CategoriaService;
import com.ar.djev.service.ICategoriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class CategoriaController {

    private ICategoriaService categoria;

    public CategoriaController(CategoriaService categoria){
        this.categoria = categoria;
    };

    @GetMapping("/fullCategoria")
    public ResponseEntity<?> fullCategoria() {
        return  new ResponseEntity<>(categoria.fullCategoria(), HttpStatus.OK);
    }

    @PostMapping("/guardarCategoria")
    public ResponseEntity<?> guardarCategoria(@RequestBody CategoriaDto categoriaDto) {
        return new ResponseEntity<>(categoria.guardarCategoria(categoriaDto), HttpStatus.OK);
    }
}
