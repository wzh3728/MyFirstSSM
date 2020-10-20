package com.hdxy.controll;

import com.hdxy.entity.User;
import com.hdxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author wzh
 * @Description
 * @create 2020-10-20 20:38
 */
@Controller
public class UserControll {
    @Autowired
    UserService userService;



    @RequestMapping("/getAllUsers.do")
    @ResponseBody
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping("/getUserById.do")
    @ResponseBody
    public User getUserById(Integer id) {
        System.out.println(id);
        return userService.getUserById(id);
    }

    @RequestMapping("/addUser.do")
    @ResponseBody
    public int addUser(User user) {
        System.out.println(user);
        return userService.insertUser(user);
    }

}
