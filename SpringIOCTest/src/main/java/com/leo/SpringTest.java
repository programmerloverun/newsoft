package com.leo;

import com.leo.pojo.Dog;
import com.leo.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class SpringTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Dog dog1 = (Dog) applicationContext.getBean("dog");
        System.out.println(dog1);

        Dog dog2 = (Dog) applicationContext.getBean("dog2");
        System.out.println(dog2);

        Dog dog3 = (Dog) applicationContext.getBean("dog3");
        System.out.println(dog3);

        Person person = (Person) applicationContext.getBean("person");
        System.out.println("Person name: " + person.getPname());
        System.out.println("Person age: " + person.getPage());

        Dog personDog = person.getDog();
        System.out.println("Person's dog: " + personDog);

        List<String> list = person.getList();
        System.out.println("Person's list: " + list);

        List<Dog> listDog = person.getListDog();
        System.out.println("Person's list of dogs: " + listDog);

        Map<String, String> map = person.getMap();
        System.out.println("Person's map: " + map);

        Map<String, Dog> mapDog = person.getMapDog();
        System.out.println("Person's map of dogs: " + mapDog);

        Set<String> set = person.getSet();
        System.out.println("Person's set: " + set);

        Set<Dog> setDog = person.getSetDog();
        System.out.println("Person's set of dogs: " + setDog);

        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}