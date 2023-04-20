package com.example.demo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

    Optional<Person> findByName(String name);

    Optional<Person> findByNameAndAge(String name, int age);

    Optional<Person> findByNameAndAddress(String name, String address);

    Iterable<Person> findByAge(int age);

}

