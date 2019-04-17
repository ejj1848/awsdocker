package com.astontech.awsdocker;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    Person savePerson(Person person);
    void deletePerson(Long id);
    Optional<Person> getPersonById(Long id);
    List<Person> getAllPeople();

}
