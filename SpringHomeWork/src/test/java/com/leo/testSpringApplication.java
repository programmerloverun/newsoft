package com.leo;

import com.leo.controller.PersonController;
import com.leo.controller.UserController;
import com.leo.model.Person;
import com.leo.model.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author leijiong
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:springApplicationContext.xml")
public class testSpringApplication {

    @Autowired
    private UserController userController;

    @Before
    public void test00() {
        userController.register(new User("leo", "123456"));
    }

    @Test
    public void test01() {
        System.out.println(userController.login(new User("leo", "123456")));
    }

    @Autowired
    private PersonController personController;

    @Test
    public void test02() {
        personController.add(new Person("leo", "123456"));
    }

    @Test
    public void test03() {
        System.out.println(personController.query("1"));
    }

    @Test
    public void test04() {
        personController.delete("1");
        System.out.println(personController.query("1"));
    }

    @Test
    public void test05() {
        System.out.println(personController.update(new Person("1","张三", "123456")));
        System.out.println(personController.queryusername("张三"));

    }

}
