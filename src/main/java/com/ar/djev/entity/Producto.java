package com.ar.djev.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Producto {
    private Long id;
    private String nombre;
    private String detalle;
    private Long id_categoria;
    private Double precio;
    private String type;
    private Boolean estado;
}
