package com.ar.djev.repository;



import com.ar.djev.entity.Categoria;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
@Repository
public class CategoriaRepository implements ICategoriaRepository {

    private List<Categoria> dataBaseCategory = new ArrayList<>();
    @Override
    public List<Categoria> fullCategoria() {
        return dataBaseCategory;
    }

    @Override
    public Categoria guardarCategoria(Categoria categoria) {
        dataBaseCategory.add(categoria);
        return categoria;
    }
}
