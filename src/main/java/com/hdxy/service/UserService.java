package com.hdxy.service;

import com.hdxy.entity.User;

import java.util.ArrayList;

/**
 * @author wzh
 * @Description
 * @create 2020-10-19 23:38
 */
public interface UserService {
    ArrayList<User> getAllUsers();
    User getUserById(Integer id);
    int insertUser(User user);
}
