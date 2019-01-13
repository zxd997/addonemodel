package com.example.addonemodel.dao;

import com.example.addonemodel.model.Animal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnimalDao extends MongoRepository<Animal,String> {
}
