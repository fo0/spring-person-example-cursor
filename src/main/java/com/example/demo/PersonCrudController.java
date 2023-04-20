package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/person")
@RequiredArgsConstructor
public class PersonCrudController {

    private final PersonService personService;

    @GetMapping("/person/{id}")
    public Person getPerson(@PathVariable long id) {
        return personService.getById(id);
    }

    @GetMapping("/persons")
    public List<Person> getPersons() {
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
