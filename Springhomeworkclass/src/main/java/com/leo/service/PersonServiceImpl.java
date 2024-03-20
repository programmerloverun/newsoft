package com.leo.service;

import com.leo.domain.Person;
import com.leo.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author leijiong
 * @version 1.0
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper  personMapper;
    @Override
    public boolean login(String name, String pwd) {
       Person person = personMapper.selectPersonByNameAndPwd(name, pwd);
         if(person != null) {
             return true;
         }
        return false;
    }

    @Override
    public List<Person> queryAll() {
        return personMapper.selectAll();
    }

    @Override
    public boolean register(Person person) {
        return  personMapper.insertPerson(person);
    }

    @Override
    public Person queryByName(String name) {
        return  personMapper.selectPersonByName(name);
    }

    @Override
    public boolean delByName(String name) {
        return personMapper.delByName(name);
    }

    @Override
    public boolean alter(Person person) {
        return personMapper.alter(person);
    }
}
