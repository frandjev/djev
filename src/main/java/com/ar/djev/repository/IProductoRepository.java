package com.ar.djev.repository;

import com.ar.djev.dto.ProductoDto;
import com.ar.djev.dto.response.ResponseDto;
import com.ar.djev.entity.Producto;

import java.util.List;

public interface IProductoRepository {

    List<Producto> buscarProducto();

    Producto guardarProducto(Producto producto);
}
