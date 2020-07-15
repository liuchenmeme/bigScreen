package com.screen.controller;

import com.screen.base.module.CommonResponse;
import com.screen.module.UserScreen;
import com.screen.service.LuckScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/luck")
public class LuckController {

    @Autowired
    private LuckScreenService service;

    //查询所有用户
    @RequestMapping(value = "/luckDraw")
    public CommonResponse luckDraw(@RequestParam("level") Integer level){
        List<UserScreen> userScreens = service.luckDraw(level);
        return new CommonResponse(userScreens);
    }
}
