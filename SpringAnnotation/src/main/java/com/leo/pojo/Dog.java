package com.leo.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author leijiong
 * @version 1.0
 */


@Data
@Component("dog")
public class Dog {

    @Autowired
    private Person person;


}
