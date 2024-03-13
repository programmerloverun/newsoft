package com.leo;

import org.junit.jupiter.api.Test;

public class Singleton {
    // 创建 Singleton 类的一个对象
    private static Singleton instance = new Singleton();

    // 让构造函数为 private，这样该类就不会被实例化
    private Singleton() {}

    // 获取唯一可用的对象
    public static Singleton getInstance() {
        return instance;
    }

    // 显示消息
    public void showMessage() {
        System.out.println("Hello World!");
    }


    @Test
    public void test() {
        NonSingleton instance1 = new NonSingleton("Hello");
        NonSingleton instance2 = new NonSingleton("World");
        instance1.showMessage();  // 输出 "Hello"
        instance2.showMessage();  // 输出 "World"
    }
}