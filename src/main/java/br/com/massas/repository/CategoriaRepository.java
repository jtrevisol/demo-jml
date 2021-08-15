package br.com.massas.repository;

import br.com.massas.entities.Categoria;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoriaRepository extends MongoRepository<Categoria, ObjectId> {
}
