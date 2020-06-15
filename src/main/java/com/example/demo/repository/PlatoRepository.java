package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Plato;

@Repository
public interface PlatoRepository extends MongoRepository<Plato, String > {

}
