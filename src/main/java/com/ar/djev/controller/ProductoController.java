package com.ar.djev.controller;

import com.ar.djev.service.IProductoService;
import com.ar.djev.service.ProductoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {

    private IProductoService service;

    public ProductoController(ProductoService service){
        this.service = service;
    }

    @GetMapping("/producto")
    public ResponseEntity<?> buscarProducto() {
        return new ResponseEntity<>(service.buscarProducto(), HttpStatus.OK);
    }

}
