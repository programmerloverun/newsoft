package com.leo.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author leijiong
 * @version 1.0
 */
public class SpringApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springapplication.xml");
        System.out.println(applicationContext.getBean("dog"));
    }
}
