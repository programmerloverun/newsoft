package com.leo.service.impl;

import com.leo.mapper.UserMapper;
import com.leo.model.User;
import com.leo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author leijiong
 * @version 1.0
 */
@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean login(User user) {
        return userMapper.getUserList().stream()
                .anyMatch(u -> u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword()));
    }

    @Override
    public void register(User user) {
        if (userMapper.select(user) != null) {
            throw new RuntimeException("用户已存在");
        }
        userMapper.getUserList().add(user);
    }
}
