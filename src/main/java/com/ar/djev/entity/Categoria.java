package com.ar.djev.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Categoria {
    private Long id;
    private String nombreCategoria;
    private Boolean estadoCategoria;


}
