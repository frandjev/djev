package com.ar.djev.repository;

import com.ar.djev.entity.Producto;

import java.util.List;

public interface IProductoRepository {

    List<Producto> buscarProducto();
}
