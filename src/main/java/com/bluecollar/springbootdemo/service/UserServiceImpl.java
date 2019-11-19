package com.bluecollar.springbootdemo.service;

import com.bluecollar.springbootdemo.dao.UserMapper;
import com.bluecollar.springbootdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUser(int age) {
        return userMapper.getUser(age);
    }
}
