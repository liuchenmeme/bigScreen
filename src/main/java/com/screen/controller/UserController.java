package com.screen.controller;

import com.screen.base.module.CommonResponse;
import com.screen.module.User;
import com.screen.module.UserScreen;
import com.screen.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

//    @GetMapping("/{id}")
//    public User getUserById(@PathVariable Integer id) {
//        return userService.getUserById(id);
//    }
//    @PostMapping("/insertUser")
    @GetMapping("/{id}")
    public CommonResponse insertWxUser(){
        UserScreen userScreen = new UserScreen();
        userScreen.setAvatarUrl("123123123123");
        return new CommonResponse(userScreen);
    }
}
