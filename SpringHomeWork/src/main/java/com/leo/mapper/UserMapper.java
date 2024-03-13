package com.leo.mapper;

import com.leo.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leijiong
 * @version 1.0
 */
@Component
public class UserMapper {

    List<User> userList = new ArrayList<>();


    public List<User> getUserList() {
        return userList;
    }

    {
        /**
         * private String uid;
         *     private String username;
         *     private String password;
         */
        userList.add(new User( "张三", "123"));
        userList.add(new User( "李四", "123"));
        userList.add(new User("王五", "123"));
        userList.add(new User("赵六", "123"));
    }


    public void add(User user) {
        userList.add(user);
    }
    public void delete(User user) {
        userList.remove(user);
    }
    public void update(User user) {
        userList.set(userList.indexOf(user), user);
    }
    public User select(User user) {
        return  userList.stream().filter(u -> u.getUsername().equals(user.getUsername())).findFirst().orElse(null);
    }
}
