package com.qf.shiroadmin.dao;

import com.qf.shiroadmin.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectById(Integer id);

    User selectByName(String name);

    int updateByIdFlag(@Param("id")int id, @Param("flag")int flag);

    int updateByIdPassword(@Param("id")int id, @Param("password")String password);
}