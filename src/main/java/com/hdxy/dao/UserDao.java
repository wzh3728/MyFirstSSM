package com.hdxy.dao;

import com.hdxy.entity.User;

import java.util.ArrayList;

/**
 * @author wzh
 * @Description
 * @create 2020-10-19 22:46
 */
public interface UserDao {
    ArrayList<User> getAllUsers();
    User getUserById(Integer id);
    int insertUser(User user);
}
