package io.yzecho.springbootvuedemo.controller;

import io.yzecho.springbootvuedemo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class LoginController {

    @CrossOrigin
    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody User user) {
        Map<String, Object> map = new HashMap<>();
        if (user.getUsername().equals("yzecho") && user.getPassword().equals("1015515")) {
            map.put("flag", true);
            map.put("msg", "登录成功");
            return map;
        }
        map.put("flag", false);
        map.put("msg", "用户名或密码不正确");
        return map;
    }
}
