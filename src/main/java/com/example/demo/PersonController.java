package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("/person")
    public Person getPerson() {
        return personService.getById(1);
    }

    @GetMapping("/persons")
    public Iterable<Person> getPersons() {
        return personService.getAll();
    }

    @PostMapping("/person")
    public void addPerson(@RequestBody Person person) {
        personService.save(person);
    }

    @PutMapping("/person")
    public void updatePerson(@RequestBody Person person) {
        personService.save(person);
    }

    @DeleteMapping("/person/{id}")
    public void deletePerson(@PathVariable long id) {
        personService.deleteById(id);
    }
}
