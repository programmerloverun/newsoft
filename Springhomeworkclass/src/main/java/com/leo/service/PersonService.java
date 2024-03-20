package com.leo.service;


import com.leo.domain.Person;

import java.util.List;

/**
 * @author leijiong
 * @version 1.0
 */
public interface PersonService {
    boolean login(String name, String pwd);

    List<Person> queryAll();

    boolean register(Person person);

    Person queryByName(String name);

    boolean delByName(String name);

    boolean alter(Person person);
}
