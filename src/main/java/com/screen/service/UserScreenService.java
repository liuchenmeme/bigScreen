package com.screen.service;

import com.screen.module.UserScreen;
import org.nutz.dao.Cnd;
import org.nutz.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserScreenService {

    @Autowired
    private Dao dao;

    public void insertUser(UserScreen user) {
        dao.insertOrUpdate(user);
    }

    public List<UserScreen> selectUsers() {
        return dao.query(UserScreen.class,Cnd.cri());
    }
}