package io.yzecho.springbootvuedemo.service;

import io.yzecho.springbootvuedemo.model.User;

import java.util.List;

public interface UserService {
    int add(User user);

    int update(User user);

    int deleteById(Integer id);

    User queryUserById(Integer id);

    List<User> queryAllUser();
}
