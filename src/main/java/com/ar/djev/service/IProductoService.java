package com.ar.djev.service;

import com.ar.djev.dto.ProductoDto;
import com.ar.djev.entity.Producto;

import java.util.List;

public interface IProductoService {

    List<ProductoDto> buscarProducto();
}
