package com.screen.controller;

import com.screen.base.module.CommonResponse;
import com.screen.module.User;
import com.screen.module.UserScreen;
import com.screen.service.UserScreenService;
import com.screen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserScreenService userScreenService;
    @Autowired
    private UserService userService;

    @RequestMapping("/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public CommonResponse insertUser(@RequestBody UserScreen userScreen){
        userScreenService.insertUser(userScreen);
        return CommonResponse.success();
    }
}
