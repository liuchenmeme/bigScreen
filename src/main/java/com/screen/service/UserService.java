package com.screen.service;

import com.screen.dao.UserDao;
import com.screen.module.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource// 使用Autowired会报警告，但是没影响
    private UserDao userDao;

    public User getUserById(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }
}