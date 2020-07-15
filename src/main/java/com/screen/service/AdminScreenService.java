package com.screen.service;

import com.screen.base.CommonStatus;
import com.screen.module.UserScreen;
import org.nutz.dao.Cnd;
import org.nutz.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminScreenService {

    @Autowired
    private Dao dao;


    public List<UserScreen> selectUsers() {
        return dao.query(UserScreen.class,Cnd.cri());
    }

    public void setVip(UserScreen user){
        user.setVip(CommonStatus.Y);
        dao.updateIgnoreNull(user);
    }

    public void deleteScreenUser(Integer uid){
        dao.delete(UserScreen.class,uid);
    }
}