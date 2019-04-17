package com.astontech.awsdocker;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PersonServiceIMPL implements PersonService {
    private final PersonRepository personRepository;

    public PersonServiceIMPL(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public void deletePerson(Long id) {

        personRepository.deleteById(id);

    }

    @Override
    public Optional<Person> getPersonById(Long id) {
        return personRepository.findById(id);
    }

    @Override
    public List<Person> getAllPeople() {
        return (List<Person>) personRepository.findAll();
    }
}
