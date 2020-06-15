package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entities.CategoriaArticulo;

@Repository
public interface CategoriaArticuloRepository extends MongoRepository<CategoriaArticulo, String > {

}
