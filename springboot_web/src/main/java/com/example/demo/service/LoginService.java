package com.example.demo.service;

import com.example.demo.pojo.ResObj;

/**
 * @author: admin_gan
 * @Date: 2019/5/21.
 * @version: 1.0
 */

public interface LoginService {

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    public ResObj login(String username, String password);
}
