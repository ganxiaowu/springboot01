package com.service.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.service.bean.UserAddress;
import com.service.service.OrderService;
import com.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: admin_gan
 * @Date: 2019/5/27.
 * @version: 1.0
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService{


    @Reference(version = "2.0.0",stub="com.service.service.UserserviceStu" )
    UserService userService;

    /**
     * 初始化订单
     * @param userId
     */
    @Override
    public List<UserAddress> intoOrder(String userId) {


        //查询用户收货地址
        System.out.println("-----------------消费成功--------------------------");
        return userService.getUserAddressLsit(userId);
    }
}
