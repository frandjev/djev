package com.ar.djev.service;

import com.ar.djev.dto.ProductoDto;
import com.ar.djev.dto.response.ResponseDto;
import com.ar.djev.entity.Producto;
import com.ar.djev.repository.IProductoRepository;
import com.ar.djev.repository.ProductoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoService implements IProductoService {

    private IProductoRepository repository;

    public ProductoService(ProductoRepository repository) {this.repository = repository;}


    @Override
    public List<ProductoDto> buscarProducto() {
        ObjectMapper mapper = new ObjectMapper();
        return repository.buscarProducto().stream()
                .map(producto -> mapper.convertValue(producto, ProductoDto.class))
                .toList();
    }

    @Override
    public ResponseDto guardarProducto(ProductoDto producto) {
        ObjectMapper mapper = new ObjectMapper();
        Producto productoEntity = mapper.convertValue(producto, Producto.class);
        Producto respuestaReso = repository.guardarProducto(productoEntity);
        if (respuestaReso == null) {
            return  new ResponseDto("No se pudo guardar");
        }
        return new ResponseDto("Se guardo correctamente");
    }


}
