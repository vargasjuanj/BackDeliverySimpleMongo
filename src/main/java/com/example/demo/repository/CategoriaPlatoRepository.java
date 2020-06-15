package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.CategoriaPlato;

@Repository
public interface CategoriaPlatoRepository extends MongoRepository<CategoriaPlato, String > {

}
