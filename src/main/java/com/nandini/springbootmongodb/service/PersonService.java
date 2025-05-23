package com.nandini.springbootmongodb.service;

import com.nandini.springbootmongodb.collection.Person;
import org.bson.Document;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface PersonService {
    String save(Person person);



    List<Person> getPersonStartWith(String name);

    void delete(String personId);

    List<Person> getByPersonAge(Integer minAge, Integer maxAge);

    Page<Person> search(String name, Integer minAge, Integer maxAge, String city, Pageable pageable);

    List<Document> getOldestPersonByCity();

    List<Document> getPopulationBycity();
}
