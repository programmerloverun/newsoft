package com.leo.service;

import com.leo.model.User;

/**
 * @author leijiong
 * @version 1.0
 */
public interface UserService {
    // 登录
    boolean login(User user);

    // 注册
    void register(User user);
}
