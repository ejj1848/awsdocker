package com.astontech.awsdocker;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/person")
public class PersonRest {
    private final PersonService personService;

    public PersonRest(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/")
    public List<Person> findAllPeople(){
        return personService.getAllPeople();
    }

    @PostMapping("/")
    public Person savePerson(@RequestBody Person person){
        return  personService.savePerson(person);
    }

    @GetMapping("/{id}")
    public Optional<Person> findPersonById(@PathVariable Long id){
        return personService.getPersonById(id);
    }
}
