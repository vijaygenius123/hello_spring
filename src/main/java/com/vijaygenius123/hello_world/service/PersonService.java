package com.vijaygenius123.hello_world.service;

import com.vijaygenius123.hello_world.dao.PersonDao;
import com.vijaygenius123.hello_world.model.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonDao personDao;

    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }

    public List<Person> getAllPeople(){
        return personDao.selectAll();
    }
}
