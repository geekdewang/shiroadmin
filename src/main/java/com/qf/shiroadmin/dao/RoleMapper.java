package com.qf.shiroadmin.dao;

import com.qf.shiroadmin.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
    int deleteById(Integer id);

    int insert(Role record);

    Role selectById(Integer id);

    int updateById(Role record);

    Long selectCount();

    //分页查询
    List<Role> selectByPage(@Param("index")int index, @Param("count")Integer limit);
}