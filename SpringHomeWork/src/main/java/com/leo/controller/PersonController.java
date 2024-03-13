package com.leo.controller;

import com.leo.model.Person;
import com.leo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author leijiong
 * @version 1.0
 */
@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    // 增删改查四个接口
    public void add(Person person) {
        personService.add(person);
    }

    public boolean delete(String id) {
        return personService.delete(id);
    }

    public Person update(Person person) {
        // 查询当前用户是否存在
        Person personres = null;
        if (personService.queryusername(person.getName()) == null){
            System.out.println("用户不存在");
        } else {
             personres = personService.update(person);
        }
        return personres;
    }

    public Person query(String id) {
        return personService.query(id);
    }

    public Person queryusername(String username) {
        return personService.queryusername(username);
    }

}
