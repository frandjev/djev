package com.ar.djev.service;

import com.ar.djev.dto.ProductoDto;
import com.ar.djev.dto.response.ResponseDto;


import java.util.List;

public interface IProductoService {

    List<ProductoDto> buscarProducto();

    ResponseDto guardarProducto(ProductoDto productoDto);
}
