package com.qf.shiroadmin.dao;

import com.qf.shiroadmin.entity.Permission;
import com.qf.shiroadmin.entity.RolePermission;

import java.util.List;

public interface RolePermissionMapper {

    int deleteById(Integer id);

    int deleteByRid(Integer Rid);

    int insert(RolePermission record);

    List<Permission> selectByRid(Integer rid);

}