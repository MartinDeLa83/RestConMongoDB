package com.atsistemas.poc.rest.repositorio;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.atsistemas.poc.rest.entidades.Usuario;

public interface UsuarioMongoRepository extends MongoRepository<Usuario, Long> {
    Usuario findByNombre(String nombre);
    Usuario findById(String id);
}
