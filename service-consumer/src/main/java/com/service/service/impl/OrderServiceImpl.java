package com.service.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.service.service.OrderService;
import com.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: admin_gan
 * @Date: 2019/5/27.
 * @version: 1.0
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService{

    //@Autowired
    @Reference
    UserService userService;

    /**
     * 初始化订单
     * @param userId
     */
    @Override
    public void intoOrder(String userId) {


        //查询用户收货地址
        System.out.println(userService.getUserAddressLsit(userId));
        System.out.println("-----------------消费成功--------------------------");
    }
}
