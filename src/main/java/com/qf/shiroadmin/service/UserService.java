package com.qf.shiroadmin.service;

import com.qf.shiroadmin.common.vo.ResultVo;
import com.qf.shiroadmin.dao.UserMapper;
import com.qf.shiroadmin.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface UserService {

    public ResultVo findByName(String name, String password);
}
