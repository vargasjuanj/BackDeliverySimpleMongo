package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Articulo;

@Repository
public interface ArticuloRepository extends MongoRepository<Articulo, String > {

}
