package com.example.demojml;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class BookController {

    @GetMapping("/{nome}")
    public String findById(@PathVariable(name="nome") String nome) {
        return "hello " + nome;
    }
}