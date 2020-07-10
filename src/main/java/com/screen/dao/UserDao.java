package com.screen.dao;

import com.screen.module.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    User selectByPrimaryKey(Integer id);
}
