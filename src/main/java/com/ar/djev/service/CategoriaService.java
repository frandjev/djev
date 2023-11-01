package com.ar.djev.service;

import com.ar.djev.dto.CategoriaDto;
import com.ar.djev.dto.response.ResponseDto;
import com.ar.djev.entity.Categoria;
import com.ar.djev.repository.CategoriaRepository;
import com.ar.djev.repository.ICategoriaRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoriaService implements ICategoriaService{

    private ICategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository){
        this.repository = repository;
    }
    @Override
    public List<CategoriaDto> fullCategoria() {
        ObjectMapper mapper = new ObjectMapper();
        return repository.fullCategoria().stream()
                .map(categoria -> mapper.convertValue(categoria, CategoriaDto.class))
                .toList();
    }

    @Override
    public ResponseDto guardarCategoria(CategoriaDto categoriaDto) {
        ObjectMapper mapper = new ObjectMapper();
        Categoria categoriaEntity = mapper.convertValue(categoriaDto,Categoria.class);
        Categoria resultado = repository.guardarCategoria(categoriaEntity);

        if (resultado == null) {
            return new ResponseDto("No se puedo guardar la categoria");
        } else {
            return new ResponseDto("Se guardo correctamente la categoria: ");
        }
    }


}
