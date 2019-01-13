package com.example.addonemodel.controller;

import com.example.addonemodel.dao.AnimalDao;
import com.example.addonemodel.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {
    @Autowired
    AnimalDao animalDao;
    @RequestMapping("/add")
    public Animal toAdd(){
        Animal animal = new Animal();
        animal.setName("王二");
        Animal save = animalDao.save(animal);
        return save;
    }
}
