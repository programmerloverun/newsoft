package com.leo;

import com.leo.controller.PersonController;
import com.leo.domain.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

/**
 * @author leijiong
 * @version 1.0
 */
public class PersonApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonController personController = (PersonController) context.getBean("personController");
        Scanner input = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("1. 登录");
            System.out.println("2. 注册");
            System.out.println("3. 查询所有用户");
            System.out.println("4. 根据用户名查询用户");
            System.out.println("5. 根据用户名删除用户");
            System.out.println("6. 根据用户名修改密码");
            System.out.println("7. 退出");
            System.out.println("请选择操作：");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("请输入用户名：");
                    String loginName = input.next();
                    System.out.println("请输入密码：");
                    String loginPwd = input.next();
                    boolean loginResult = personController.login(loginName, loginPwd);
                    if (loginResult) {
                        System.out.println("登录成功");
                    } else {
                        System.out.println("登录失败");
                    }
                    break;

                case 2:
                    System.out.println("请输入用户名：");
                    String registerName = input.next();
                    System.out.println("请输入密码：");
                    String registerPwd = input.next();
                    Person newPerson = new Person();
                    newPerson.setPname(registerName);
                    newPerson.setPwd(registerPwd);
                    boolean registerResult = personController.register(newPerson);
                    if (registerResult) {
                        System.out.println("注册成功");
                    } else {
                        System.out.println("注册失败,用户名已存在");
                    }
                    break;

                case 3:
                    List<Person> userList = personController.queryAll();
                    for (Person person : userList) {
                        System.out.println(person);
                    }
                    break;

                case 4:
                    System.out.println("请输入用户名：");
                    String queryName = input.next();
                    Person queriedPerson = personController.queryByName(queryName);
                    if (queriedPerson != null) {
                        System.out.println(queriedPerson);
                    } else {
                        System.out.println("用户不存在");
                    }
                    break;

                case 5:
                    System.out.println("请输入用户名：");
                    String deleteName = input.next();
                    if (personController.delByName(deleteName)) {
                        System.out.println("删除成功");
                    } else {
                        System.out.println("删除失败, 用户不存在");
                    }
                    break;

                case 6:
                    System.out.println("请输入用户名：");
                    String modifyName = input.next();
                    System.out.println("请输入新密码：");
                    String modifyPwd = input.next();
                    Person modifiedPerson = new Person();
                    modifiedPerson.setPname(modifyName);
                    modifiedPerson.setPwd(modifyPwd);
                    if (personController.alter(modifiedPerson)) {
                        System.out.println("修改成功");
                    } else {
                        System.out.println("修改失败, 用户不存在");
                    }
                    break;

                case 7:
                    running = false;
                    System.out.println("程序退出");
                    break;

                default:
                    System.out.println("无效的选项，请重新选择");
                    break;
            }
        }
    }
}
