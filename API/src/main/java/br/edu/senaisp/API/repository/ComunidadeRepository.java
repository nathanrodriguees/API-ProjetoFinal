package br.edu.senaisp.API.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.edu.senaisp.API.model.Comunidade;

@Repository
public interface ComunidadeRepository extends MongoRepository<Comunidade, String> {

}
