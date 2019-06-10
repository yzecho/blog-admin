package io.yzecho.springbootvuedemo.controller;

import io.yzecho.springbootvuedemo.model.User;
import io.yzecho.springbootvuedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getAllUser")
    public List<User> queryAllUser() {
        return userService.queryAllUser();
    }
}
