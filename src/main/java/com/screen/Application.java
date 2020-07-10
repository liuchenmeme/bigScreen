package com.screen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.wx.user.dao") 不在Application.java默认扫描路径下的需使用该注解
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}