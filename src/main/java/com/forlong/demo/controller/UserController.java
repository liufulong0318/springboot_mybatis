package com.forlong.demo.controller;

import com.forlong.demo.dao.UsersMapper;
import com.forlong.demo.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/11/21.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UsersMapper usersMapper;
    @RequestMapping(value = "add")
    public void addUser(){
        Users users = new Users();
        users.setUsername("wangwu");
        usersMapper.insert(users);
    }
}
