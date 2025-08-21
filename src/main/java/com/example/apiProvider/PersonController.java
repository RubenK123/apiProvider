package com.example.apiProvider;

import com.example.apiProvider.models.Person;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/people")
public class PersonController {

    private final PersonRepository repo;

    public PersonController(PersonRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Person> getAllPeople() {
        return repo.findAll();
    }

    @GetMapping("/search")
    public List<Person> searchByName(@RequestParam String firstname,
                                     @RequestParam String surname) {
        return repo.findByName(firstname, surname);
    }
}
