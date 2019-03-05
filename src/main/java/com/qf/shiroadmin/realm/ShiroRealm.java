package com.qf.shiroadmin.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * 自定义用哪个户Realm类
 * 实现登录和授权的方法
 */


public class ShiroRealm extends AuthorizingRealm {

    //授权  查询登录用户的所有权限，并返回
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    //认证登录许可  标记是否登录成功
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获取传递的令牌
        UsernamePasswordToken userToken=(UsernamePasswordToken) authenticationToken;
        //验证令牌是否为空
        if(userToken.getUsername()!=null){

            //创建认证信息  参数说明：1、用户名 2、密码 3、realm的名字
            SimpleAuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(userToken.getUsername(),userToken.getPassword(),getName());
            return authenticationInfo;
        }

        return null;
    }
}
