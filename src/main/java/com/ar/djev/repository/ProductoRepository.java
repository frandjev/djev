package com.ar.djev.repository;

import com.ar.djev.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ProductoRepository implements IProductoRepository {

    private List<Producto> dataBase = new ArrayList<>();

    @Override
    public List<Producto> buscarProducto() {
        return dataBase;
    }
}
