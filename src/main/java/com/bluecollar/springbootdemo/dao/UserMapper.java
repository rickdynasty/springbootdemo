package com.bluecollar.springbootdemo.dao;

import com.bluecollar.springbootdemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT id,username,age,phone,email FROM users WHERE age=#{age}")
    List<User> getUser(int age);
}
