package com.qf.shiroadmin.dao;

import com.qf.shiroadmin.entity.Permission;

public interface PermissionMapper {
    int deleteById(Integer id);

    int insert(Permission record);

    Permission selectById(Integer id);

    int updateByIdSelective(Permission record);
}