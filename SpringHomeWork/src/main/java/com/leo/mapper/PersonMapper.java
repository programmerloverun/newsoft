package com.leo.mapper;

import com.leo.model.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leijiong
 * @version 1.0
 */
@Component
public class PersonMapper {

    List<Person> personlist = new ArrayList<>();

    public List<Person> getPersonList() {
        return personlist;
    }

    {
        /**
         *
         *     private String name;
         *     private String age;
         */
        personlist.add(new Person("1", "张三", "20"));
        personlist.add(new Person("2", "李四", "21"));
        personlist.add(new Person("3", "王五", "22"));
        personlist.add(new Person("4", "赵六", "23"));
        personlist.add(new Person("5", "孙七", "24"));
    }

    public void add(Person person) {
        personlist.add(person);
    }

    public void delete(String id) {
        personlist.removeIf(p -> p.getId().equals(id));
    }

    public Person update(Person person) {
        return personlist.stream().filter(p -> p.getId().equals(person.getId())).findFirst().map(p -> {
            p.setName(person.getName());
            p.setAge(person.getAge());
            return p;
        }).orElse(null);
    }

    public Person select(String id) {
        return personlist.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    public Person selectusername(String username) {
        return personlist.stream().filter(p -> p.getName().equals(username)).findFirst().orElse(null);
    }
}
