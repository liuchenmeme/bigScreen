package com.screen.controller;

import com.screen.base.module.CommonResponse;
import com.screen.module.UserScreen;
import com.screen.service.AdminScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminScreenService adminScreenService;

    //查询所有用户
    @RequestMapping(value = "/selectUsers",method = RequestMethod.POST)
    public CommonResponse selectUsers(){
        List<UserScreen> userScreens = adminScreenService.selectUsers();
        return new CommonResponse(userScreens);
    }

    //设置中奖用户
    @RequestMapping(value = "/setVip",method = RequestMethod.POST)
    public CommonResponse setVip(@RequestBody UserScreen userScreen){
        adminScreenService.setVip(userScreen);
        return CommonResponse.success();
    }
    //删除用户
    @RequestMapping(value = "/deleteUser",method = RequestMethod.POST)
    public CommonResponse deleteUser(@RequestParam("uid") Integer uid){
        adminScreenService.deleteScreenUser(uid);
        return CommonResponse.success();
    }
}
