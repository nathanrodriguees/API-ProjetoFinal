package br.edu.senaisp.API.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.senaisp.API.model.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

}
