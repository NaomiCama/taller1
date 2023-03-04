package com.msproduct.msproduct.service;

import com.msproduct.msproduct.model.Categoria;

import java.util.List;
public interface CategoriaService {
    Categoria crear(Categoria categoria);
    Categoria actualizar(Long id, Categoria categoria);
    List<Categoria>ListarTodos();
    void eliminar(Long id);
}
