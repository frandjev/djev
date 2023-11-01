package com.ar.djev.service;

import com.ar.djev.dto.CategoriaDto;
import com.ar.djev.dto.response.ResponseDto;

import java.util.List;

public interface ICategoriaService {

    List<CategoriaDto> fullCategoria ();

    ResponseDto guardarCategoria(CategoriaDto categoriaDto);

}
