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

    //添加用户 用户扫码操作
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public CommonResponse insertUser(@RequestBody UserScreen userScreen){
        userScreenService.insertUser(userScreen);
        return CommonResponse.success();
    }

}
