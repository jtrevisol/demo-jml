package com.example.demojml.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class Categoria {

    private long id;
    private String nome;

    private List<Produto> produtos;

}
