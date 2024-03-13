package com.leo.service.impl;

import com.leo.mapper.PersonMapper;
import com.leo.model.Person;
import com.leo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author leijiong
 * @version 1.0
 */
@Component
public class PersonServiceimpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;


    @Override
    public void add(Person person) {
        person.setId(UUID.randomUUID().toString());
        personMapper.getPersonList().add(person);
    }
// Person(id=b3dbbaaf-e705-4a9d-b05a-fa75998890a9, name=gege, age=13)
    @Override
    public boolean delete(String id) {
        try {
            personMapper.delete(id);
        }
        catch (Exception e) {
            return false;
        }
        return true;

    }

    @Override
    public Person update(Person person) {
        return personMapper.update(person);
    }

    @Override
    public Person query(String id) {
        return personMapper.select(id);
    }

    @Override
    public Person queryusername(String username) {
        return personMapper.selectusername(username);
    }
}
