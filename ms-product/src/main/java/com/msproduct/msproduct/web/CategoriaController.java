package com.msproduct.msproduct.web;

import com.msproduct.msproduct.model.Categoria;
import com.msproduct.msproduct.service.CategoriaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ms-product/v1/categorias")
public class CategoriaController {
    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }
    @GetMapping
    public List<Categoria> obtenerTodos(){
        return categoriaService.ListarTodos();
    }
}
