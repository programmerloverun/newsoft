package com.leo.spring;

import com.leo.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author leijiong
 * @version 1.0
 */
public class SpringApplication {
    public static void main(String[] args) {
        // 获取Spring的上下文对象
        // ApplicationContext代表Spring容器，通过容器获取对象
        // ClassPathXmlApplicationContext是ApplicationContext的实现类，表示从类路径中加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
}
