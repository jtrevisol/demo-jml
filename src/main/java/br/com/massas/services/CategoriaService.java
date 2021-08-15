package br.com.massas.services;

import br.com.massas.entities.Categoria;
import br.com.massas.repository.CategoriaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoriaService {

    private CategoriaRepository categoriaRepository;

    public void saveAll(List<Categoria> categorias) {
        categorias.stream().forEach(a -> categoriaRepository.save(a));
    }

    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }
}
