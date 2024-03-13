package com.leo.controller;

import com.leo.pojo.Dog;
import com.leo.pojo.Paper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author leijiong
 * @version 1.0
 */
public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 狗子案例
        // 构造器方法
        Dog dog = (Dog) applicationContext.getBean("dog");
        System.out.println(dog);

        // 工厂方法
        Dog dog2 = (Dog) applicationContext.getBean("dog2");
        System.out.println(dog2);

        // 静态工厂方法
        Dog dog3 = (Dog) applicationContext.getBean("dog3");
        System.out.println(dog3);

        // 纸张案例
        // 构造器方法
         Paper paper = (Paper) applicationContext.getBean("paper");
         System.out.println(paper);

        // 工厂方法
        Paper paper2 = (Paper) applicationContext.getBean("paper2");
        System.out.println(paper2);

        // 静态工厂方法
        Paper paper3  = (Paper) applicationContext.getBean("paper3");
        System.out.println(paper3);

        // bean生命周期
        Dog dog4 = (Dog) applicationContext.getBean("dog4");
        dog4.bark();
        ((ClassPathXmlApplicationContext) applicationContext).close();



    }
}
