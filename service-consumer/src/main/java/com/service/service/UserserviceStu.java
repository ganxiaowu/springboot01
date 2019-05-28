package com.service.service;

import com.service.bean.UserAddress;

import java.util.List;

/**
 * @author: admin_gan
 * @Date: 2019/5/28.
 * @version: 1.0
 */
public class UserserviceStu implements UserService{
    /**
     * 注入userService
     */
    private final UserService userService;
    /**
     * 传入 userservice 远程代理对象
     * @param userService
     */
    public UserserviceStu(UserService userService){
        super();
        this.userService = userService;
    }
    /**
     * 当验证通过执行远程方法调用
     * @param userId
     * @return
     */
    @Override
    public List<UserAddress> getUserAddressLsit(String userId) {
        System.out.println("-----------userServiceStub------------------");
        if(!userId.isEmpty()){
            return userService.getUserAddressLsit(userId);
        }else {
            return null;
        }
    }
}
