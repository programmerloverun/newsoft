package com.leo.controller;

import com.leo.model.User;
import com.leo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author leijiong
 * @version 1.0
 */
@Controller
public class UserController {

    @Autowired
    private  UserService userService;
    public boolean login(User user){
       return userService.login(user);
    }
    public void register(User user){
        userService.register(user);
    }

}
