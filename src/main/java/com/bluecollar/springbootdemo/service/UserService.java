package com.bluecollar.springbootdemo.service;

import com.bluecollar.springbootdemo.pojo.User;

import java.util.List;

public interface UserService {
    List<User> getUser(int age);
}
