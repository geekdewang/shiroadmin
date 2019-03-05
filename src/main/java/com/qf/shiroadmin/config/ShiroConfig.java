package com.qf.shiroadmin.config;

import com.qf.shiroadmin.realm.ShiroRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration//标记这是一个配置
public class ShiroConfig {
    //1.生产成本Realm对象
    @Bean
    public ShiroRealm caretRealm() {
        return new ShiroRealm();
    }

//   2.生成管理器对象
    @Bean
    public  DefaultWebSecurityManager securityManager(ShiroRealm shiroRealm) {

        DefaultWebSecurityManager webSecurityManager = new DefaultWebSecurityManager();

        webSecurityManager.setRealm(shiroRealm);

        return webSecurityManager;
    }
//   3.配置过滤器工厂
    @Bean
    public ShiroFilterFactoryBean createShiroFilter(DefaultWebSecurityManager webSecurityManager) {
        ShiroFilterFactoryBean filterFactoryBean = new ShiroFilterFactoryBean();
        // 设置三个路径 一个管理器
        filterFactoryBean.setLoginUrl("login.html");//登录页面
        filterFactoryBean.setSuccessUrl("index.html");//成功页面
        filterFactoryBean.setUnauthorizedUrl("error.html");//失败页面
        filterFactoryBean.setSecurityManager(webSecurityManager);//设备管理器

        //设置放行和拦截的资源
        Map<String, String> map = new HashMap<>();

        //设置放行的资源
        //方形静态 css js  图片, 最后都放在同一个文件夹中国
        map.put("/media/**","anon"); // anon 表示不用登录就可以访问
        map.put("/login.html","anon");
        map.put("/userlogin.do","anon");
        //剩下的全部拦截
        map.put("/**","authc");//必须登录之后才可以访问

        filterFactoryBean.setFilterChainDefinitionMap(map);

        return filterFactoryBean;
    }
}
