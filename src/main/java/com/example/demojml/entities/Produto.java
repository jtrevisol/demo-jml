package com.example.demojml.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Produto {

    private long id;
    private String nome;
    private Categoria categoria;
}
