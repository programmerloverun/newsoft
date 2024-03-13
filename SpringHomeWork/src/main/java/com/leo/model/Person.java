package com.leo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author leijiong
 * @version 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Person {

    private String id;
    private String name;
    private String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
