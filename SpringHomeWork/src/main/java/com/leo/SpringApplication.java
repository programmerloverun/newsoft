package com.leo;

import com.leo.controller.PersonController;
import com.leo.controller.UserController;
import com.leo.model.Person;
import com.leo.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


import java.util.Scanner;

@Component
public class SpringApplication {
    private static Scanner scanner = new Scanner(System.in);


    private static UserController userController;


    private static PersonController personController;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:springApplicationContext.xml");
        userController = context.getBean(UserController.class);
        personController = context.getBean(PersonController.class);
        while (true) {
            printMenu();
            try {
                String line = scanner.nextLine();
                switch (line) {
                    case "0":
                        System.exit(0);
                        break;
                    case "1":
                        System.out.println("请输入用户名：");
                        String username = scanner.nextLine();
                        System.out.println("请输入密码：");
                        String password = scanner.nextLine();
                        userController.register(new User(username, password));
                        break;
                    case "2":
                        System.out.println("请输入用户名：");
                        String username1 = scanner.nextLine();
                        System.out.println("请输入密码：");
                        String password1 = scanner.nextLine();
                        System.out.println(userController.login(new User(username1, password1)));
                        break;
                    case "3":
                        System.out.println("请输入姓名");
                        String name = scanner.nextLine();
                        System.out.println("请输入年龄");
                        String age = scanner.nextLine();
                        personController.add(new Person(name, age));
                        break;
                    case "4":
                        System.out.println("请输入id：");
                        String id = scanner.nextLine();
                        personController.delete(id);
                        break;
                    case "5":
                        System.out.println("请输入id");
                        String id1 = scanner.nextLine();
                        personController.update(new Person(id1, "张三", "123456"));
                        break;
                    case "6":
                        System.out.println("请输入id：");
                        String id2 = scanner.nextLine();
                        System.out.println(personController.query(id2));
                        break;
                    default:
                        System.out.println("输入错误");
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void printMenu() {
        System.out.println("==========欢迎进入人员管理系统==========");
        System.out.println("0.退出");
        System.out.println("1.注册");
        System.out.println("2.登录");
        System.out.println("3.增加人员");
        System.out.println("4.删除人员");
        System.out.println("5.修改人员");
        System.out.println("6.查询人员");
    }

    @Test
    public void test01() {
        System.out.println(userController.login(new User("123", "123")));
    }

}