package com.leo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author leijiong
 * @version 1.0
 */
@Data
@AllArgsConstructor
public class Dog {
    private String name;
    private Integer age;
    public Dog() {
        System.out.println("create Dog");
    }
    public void init(){
        System.out.println("init Dog");
    }
    public void destroy() {
        System.out.println("destroy Dog");
    }
    public void bark() {
        System.out.println("汪汪汪");
    }
}
