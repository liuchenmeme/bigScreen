package com.screen.service;

import com.screen.dao.UserDao;
import com.screen.dao.UserScreenMapper;
import com.screen.module.User;
import com.screen.module.UserScreen;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserScreenService {

    @Resource// 使用Autowired会报警告，但是没影响
    private UserScreenMapper userScreenMapper;

    public void insertUser(UserScreen user) {
        userScreenMapper.insert(user);
    }
}