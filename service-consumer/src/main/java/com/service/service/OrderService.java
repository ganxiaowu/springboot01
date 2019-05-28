package com.service.service;

import com.service.bean.UserAddress;

import java.util.List;

/**
 * @author: admin_gan
 * @Date: 2019/5/27.
 * @version: 1.0
 */
public interface OrderService {

    public List<UserAddress> intoOrder(String userId);
}
