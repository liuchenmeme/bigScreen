package com.screen.dao;

import com.screen.module.UserScreen;
import java.util.List;

public interface UserScreenMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserScreen record);

    UserScreen selectByPrimaryKey(Integer id);

    List<UserScreen> selectAll();

    int updateByPrimaryKey(UserScreen record);
}