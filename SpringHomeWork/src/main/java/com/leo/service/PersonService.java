package com.leo.service;

import com.leo.model.Person;


/**
 * @author leijiong
 * @version 1.0
 */
public interface PersonService {

    // 增删改查四个接口
    void add(Person person);
    boolean delete(String id);
    Person update(Person person);

    Person query(String id);
    Person queryusername(String username);
}
