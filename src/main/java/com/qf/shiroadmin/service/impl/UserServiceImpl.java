package com.qf.shiroadmin.service.impl;

import com.qf.shiroadmin.common.util.ResultUtil;
import com.qf.shiroadmin.common.vo.ResultVo;
import com.qf.shiroadmin.dao.UserMapper;
import com.qf.shiroadmin.entity.User;
import com.qf.shiroadmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userDao;

    @Override
    public ResultVo findByName(String name, String password) {
        User user=userDao.selectByName(name);
        if(user!=null){
            //Objects.equals(user.getPassword(),password);  jdk8 提供的工具类
            if(user.getPassword().equals(password)){
                //登录成功
                return ResultUtil.exec(true,"OK",user);
            }
        }
        return ResultUtil.exec(false,"用户名或密码不正确",null);
    }
}
