package com.msproduct.msproduct.service.impl;

import com.msproduct.msproduct.model.Categoria;
import com.msproduct.msproduct.repository.CategoriaRepository;
import com.msproduct.msproduct.service.CategoriaService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoriaServiceImpl implements CategoriaService {
    private final CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public Categoria crear(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override

    public Categoria actualizar(Long id, Categoria categoria) {
        return categoriaRepository.findById(id)
                .map(categoriaEncontrada -> {
                    categoria.setId(categoriaEncontrada.getId());
                    return categoriaRepository.save(categoria);
                })
                .orElseThrow(() -> new RuntimeException("La categoria con el codigo: " + id + " no existe"));
    }

    @Override
    public List<Categoria> ListarTodos() {
        return categoriaRepository.obtenerTodos();
    }

    @Override
    public void eliminar(Long id) {

    }
}
