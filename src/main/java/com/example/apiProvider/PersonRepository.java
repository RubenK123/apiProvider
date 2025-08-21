package com.example.apiProvider;

import com.example.apiProvider.models.Person;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.InputStream;
import java.util.List;

@Repository
public class PersonRepository {

    private List<Person> people;

    public PersonRepository(ObjectMapper objectMapper) {
        try (InputStream is = getClass().getResourceAsStream("/dataset.json")) {
            this.people = objectMapper.readValue(is, new TypeReference<List<Person>>() {});
        } catch (Exception e) {
            throw new RuntimeException("Failed to load people.json", e);
        }
    }

    public List<Person> findAll() {
        return people;
    }

    public List<Person> findByName(String firstname, String surname) {
        return people.stream()
                .filter(p -> p.getFirstname().equalsIgnoreCase(firstname)
                        && p.getSurname().equalsIgnoreCase(surname))
                .toList();
    }
}

