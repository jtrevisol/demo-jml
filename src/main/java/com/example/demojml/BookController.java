package com.example.demojml;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/alpha")
public class BookController {

    @GetMapping("/{nome}")
    public String findById(@PathVariable(name = "nome") String nome) {
        return "versao: 1.0 -->> oi " + nome + " --> :)";
    }
}