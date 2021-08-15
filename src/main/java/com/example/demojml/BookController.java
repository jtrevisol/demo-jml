package com.example.demojml;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api/lista")

public class BookController {

    private HashMap<String, String> ma;

    public BookController() {
        ma = new HashMap<>(0);
    }

    @GetMapping("/add/{nome}")
    public String add(@PathVariable(name = "nome") String nome) {
        ma.put(nome, null);
        return "versao: 1.0 -->> add " + nome;
    }


    @GetMapping("/remove/{nome}")
    public String remove(@PathVariable(name = "nome") String nome) {
        ma.remove(nome, null);
        return "versao: 1.0 -->> remove " + nome;
    }
}