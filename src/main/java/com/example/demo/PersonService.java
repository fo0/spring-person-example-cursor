package com.example.demo;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

/**
 * The PersonService class provides methods to interact with the
 * PersonRepository.
 */
@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository repository;

    /**
     * Returns the person with the specified ID.
     * 
     * @param id The ID of the person to retrieve.
     * @return The person with the specified ID, or null if not found.
     */
    public Person getById(long id) {
        return repository.findById(id).orElse(null);
    }

    /**
     * Returns all persons in the repository.
     * 
     * @return An Iterable containing all persons in the repository.
     */
    public Iterable<Person> getAll() {
        return repository.findAll();
    }

    /**
     * Saves the specified person to the repository.
     * 
     * @param person The person to save.
     */
    public void save(Person person) {
        repository.save(person);
    }

    /**
     * Deletes the person with the specified ID from the repository.
     * 
     * @param id The ID of the person to delete.
     */
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    /**
     * Returns the default person.
     * 
     * @return The default person.
     */
    public String getDefaultPerson() {
        return null;
    }

    // New APIs
    /**
     * Returns the person with the specified name.
     * 
     * @param name The name of the person to retrieve.
     * @return The person with the specified name, or null if not found.
     */
    public Person getByName(String name) {
        return repository.findByName(name).orElse(null);
    }

    /**
     * Returns all persons with the specified age.
     * 
     * @param age The age of the persons to retrieve.
     * @return An Iterable containing all persons with the specified age.
     */
    public Iterable<Person> getByAge(int age) {
        return repository.findByAge(age);
    }

}
