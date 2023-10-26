package com.ar.djev.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDto {
    private Long id;
    private String nombre;
    private String detalle;
    private Long id_categoria;
    private Double precio;
    private String type;
    private Boolean estado;
}
