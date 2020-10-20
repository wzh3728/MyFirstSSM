package com.hdxy.service.serviceimpl;

import com.hdxy.dao.UserDao;
import com.hdxy.entity.User;
import com.hdxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author wzh
 * @Description
 * @create 2020-10-19 23:41
 */
@Service("uerService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public ArrayList<User> getAllUsers() {

        return userDao.getAllUsers();
    }

    @Override
    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }
}
