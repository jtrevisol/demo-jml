package br.com.massas.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection = "categorias")
@ToString
public class Categoria extends ItemBase {

    @Id
    private ObjectId id;
    private List<Produto> produtos;
}
