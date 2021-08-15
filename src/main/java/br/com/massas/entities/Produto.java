package br.com.massas.entities;

import lombok.Data;

import java.util.List;

@Data
public class Produto extends ItemBase {
    private long id;
    private List<Opcao> opcao;
}
