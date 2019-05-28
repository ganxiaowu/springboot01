package com.example.demo.service.impl;

import com.example.demo.mapper.login.UserMapper;
import com.example.demo.pojo.ResObj;
import com.example.demo.pojo.db.User;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: admin_gan
 * @Date: 2019/5/21.
 * @version: 1.0
 */
@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public ResObj login(String username, String password) {
        User user =  userMapper.login(username, password);



        return new ResObj("200","查询成功",user);
    }
}
