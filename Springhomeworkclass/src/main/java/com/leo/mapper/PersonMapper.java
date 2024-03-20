package com.leo.mapper;

import com.leo.domain.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leijiong
 * @version 1.0
 */
public interface PersonMapper {


    Person selectPersonByNameAndPwd(String name, String pwd);

    List<Person> selectAll();

    boolean insertPerson(Person person);

    Person selectPersonByName(String name);

    boolean delByName(String name);

    boolean alter(Person person);
}
