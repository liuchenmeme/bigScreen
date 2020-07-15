package com.screen.service;

import com.screen.base.CommonStatus;
import com.screen.module.UserScreen;
import org.nutz.dao.Cnd;
import org.nutz.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserScreenService {

    @Autowired
    private Dao dao;

    public void insertUser(UserScreen user) {
        user.setCrtTime(new Date());
        dao.insertOrUpdate(user);
    }

    public List<UserScreen> selectUsers() {
        return dao.query(UserScreen.class,Cnd.cri());
    }

    public void setVip(UserScreen user){
        user.setVip(CommonStatus.Y);
        dao.updateIgnoreNull(user);
    }
}