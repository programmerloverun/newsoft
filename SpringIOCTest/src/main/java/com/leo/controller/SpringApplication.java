package com.leo.controller;

import com.leo.pojo.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author leijiong
 * @version 1.0
 */
public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dog dog1 = (Dog) applicationContext.getBean("dog");
        System.out.println(dog1);
        Dog dog2 = (Dog) applicationContext.getBean("dog2");
        System.out.println(dog2);
        Dog dog3 = (Dog) applicationContext.getBean("dog3");
        System.out.println(dog3);
        ((ClassPathXmlApplicationContext) applicationContext).close();

    }
}
