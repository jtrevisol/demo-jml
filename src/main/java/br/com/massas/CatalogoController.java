package br.com.massas;

import br.com.massas.entities.Categoria;
import br.com.massas.entities.Produto;
import br.com.massas.services.CategoriaService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/catalogo")
@AllArgsConstructor
@Slf4j
public class CatalogoController {

    private CategoriaService categoriaService;

    @PostConstruct
    public void setup() {
        List<Categoria> categorias = new ArrayList<>();

        {
            Categoria categoria = new Categoria();
            categoria.setNome("Massas");
            categoria.setProdutos(new ArrayList<>());
            {
                Produto e = new Produto();
                e.setNome("Bigole");
                categoria.getProdutos().add(e);
            }
            {
                Produto e = new Produto();
                e.setNome("Parafuso");
                categoria.getProdutos().add(e);
            }
            {
                Produto e = new Produto();
                e.setNome("Espaguete");
                categoria.getProdutos().add(e);
            }

            categorias.add(categoria);
        }

        {
            Categoria categoria = new Categoria();
            categoria.setNome("Paes e Cucas");
            categoria.setProdutos(new ArrayList<>());

            {
                Produto e = new Produto();
                e.setNome("Pão Colonial");
                categoria.getProdutos().add(e);
            }
            {
                Produto e = new Produto();
                e.setNome("Pão de Forma");
                categoria.getProdutos().add(e);
            }
            {
                Produto e = new Produto();
                e.setNome("Pão de Cachorro Quente");
                categoria.getProdutos().add(e);
            }

            categorias.add(categoria);
        }
        {
            Categoria categoria = new Categoria();
            categoria.setNome("Massas diversas");
            categoria.setProdutos(new ArrayList<>());

            {
                Produto e = new Produto();
                e.setNome("Massa pronta de Pastel");
                categoria.getProdutos().add(e);
            }

            {
                Produto e = new Produto();
                e.setNome("Massa pronta de Pizza");
                categoria.getProdutos().add(e);
            }
            {
                Produto e = new Produto();
                e.setNome("Agnoline");
                categoria.getProdutos().add(e);
            }

            categorias.add(categoria);
        }

        {
            Categoria categoria = new Categoria();
            categoria.setNome("Salgados");
            categoria.setProdutos(new ArrayList<>());
            {
                Produto e = new Produto();
                e.setNome("Cachorrinho");
                categoria.getProdutos().add(e);
            }

            {
                Produto e = new Produto();
                e.setNome("Pastel");
                categoria.getProdutos().add(e);
            }
            {
                Produto e = new Produto();
                e.setNome("Pão de Queijo");
                categoria.getProdutos().add(e);
            }
            {
                Produto e = new Produto();
                e.setNome("Pastel de Queijo");
                categoria.getProdutos().add(e);
            }
            {
                Produto e = new Produto();
                e.setNome("Pastel de Frango");
                categoria.getProdutos().add(e);
            }
            {
                Produto e = new Produto();
                e.setNome("Risole");
                categoria.getProdutos().add(e);
            }
            categorias.add(categoria);
        }

        {
            Categoria categoria = new Categoria();
            categoria.setNome("Tortas e Bolos");
            categoria.setProdutos(new ArrayList<>());
            {
                Produto e = new Produto();
                e.setNome("Bolo de Chocolate");
                categoria.getProdutos().add(e);
            }
            {
                Produto e = new Produto();
                e.setNome("Bolo de Milho");
                categoria.getProdutos().add(e);
            }

            {
                Produto e = new Produto();
                e.setNome("Bolo de Doce de Leite");
                categoria.getProdutos().add(e);
            }
            {
                Produto e = new Produto();
                e.setNome("Torta de aniversário");
                categoria.getProdutos().add(e);
            }
            categorias.add(categoria);
        }

        if (categoriaService.findAll() == null || categoriaService.findAll().isEmpty()) {
            log.info("nada no banco");
            categoriaService.saveAll(categorias);
        }

        categoriaService.findAll().stream().forEach(a -> log.info(a.toString()));
    }

    @GetMapping(path = "/categorias", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> categorias() {
        return new ResponseEntity<Object>(categoriaService.findAll(), HttpStatus.OK);
    }
}