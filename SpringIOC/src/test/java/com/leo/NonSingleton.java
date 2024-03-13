package com.leo;

public class NonSingleton {
    private String message;

    // 公开的构造函数，允许外部创建实例
    public NonSingleton(String message) {
        this.message = message;
    }

    // 显示消息
    public void showMessage() {
        System.out.println(this.message);
    }
}