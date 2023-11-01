package com.ar.djev.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaDto {
    private Long id;
    private String nombreCategoria;
    private Boolean estadoCategoria;
}
