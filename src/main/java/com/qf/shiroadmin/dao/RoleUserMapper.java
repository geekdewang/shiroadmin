package com.qf.shiroadmin.dao;

import com.qf.shiroadmin.entity.Role;
import com.qf.shiroadmin.entity.RoleUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleUserMapper {
    int deleteById(Integer id);
    int deleteByUid(Integer id);

    int insert(RoleUser record);

    List<Role> selectByUid(Integer Uid);

    //实现批量新增
    int insertBath(@Param("uid")Integer uid,@Param("rids") List<Integer> rids);
}