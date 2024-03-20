package com.leo.controller;

import com.leo.domain.Person;
import com.leo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author leijiong
 * @version 1.0
 */
@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    public boolean login(String name, String pwd) {
        return personService.login(name, pwd);
    }

    public List<Person> queryAll() {
        return personService.queryAll();
    }

    public boolean register(Person person) {
        return personService.register(person);
    }

    public Person queryByName(String name) {
        return personService.queryByName(name);
    }

    public boolean delByName(String name) {
        return personService.delByName(name);
    }

    public boolean alter(Person person) {
        return personService.alter(person);
    }
}
