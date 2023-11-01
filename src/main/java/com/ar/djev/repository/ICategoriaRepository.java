package com.ar.djev.repository;


import com.ar.djev.entity.Categoria;

import java.util.List;

public interface ICategoriaRepository {

    List<Categoria> fullCategoria();

    Categoria guardarCategoria(Categoria categoria);
}
