package com.screen.dao;

import com.screen.module.UserScreen;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserScreenMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserScreen record);

    UserScreen selectByPrimaryKey(Integer id);

    List<UserScreen> selectAll();

    int updateByPrimaryKey(UserScreen record);
}