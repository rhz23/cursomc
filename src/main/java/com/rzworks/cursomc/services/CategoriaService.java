package com.rzworks.cursomc.services;

import com.rzworks.cursomc.domain.Categoria;
import com.rzworks.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Optional<Categoria> buscar(Integer id){
        Optional<Categoria> obj = repo.findById(id);
        return obj; //.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrato! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }
}
