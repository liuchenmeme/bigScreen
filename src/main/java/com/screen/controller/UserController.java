package com.screen.controller;

import com.screen.base.module.CommonResponse;
import com.screen.module.UserScreen;
import com.screen.service.UserScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserScreenService userScreenService;
//    @Autowired
//    private UserService userService;
//
//    @RequestMapping("/{id}")
//    public User getUserById(@PathVariable Integer id) {
//        return userService.getUserById(id);
//    }

    //添加用户 用户扫码操作
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public CommonResponse insertUser(@RequestBody UserScreen userScreen){
        userScreenService.insertUser(userScreen);
        return CommonResponse.success();
    }

    //查询所有用户
    @RequestMapping(value = "/selectusers",method = RequestMethod.POST)
    public CommonResponse selectusers(){
        return new CommonResponse(userScreenService.selectUsers());
    }
}
