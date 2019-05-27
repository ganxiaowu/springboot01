package com.service.service.impl;

import com.service.bean.UserAddress;
import com.service.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @author: admin_gan
 * @Date: 2019/5/27.
 * @version: 1.0
 */
public class UserServiceImpl implements UserService{
    @Override
    public List<UserAddress> getUserAddressLsit(String userId) {
        UserAddress address1 = new UserAddress(1, "成都一环路", "1", "李老师", "1895654", "7878");
        UserAddress address2 = new UserAddress(1, "成都五环路", "2", "张老师", "1895655", "7879");
        return Arrays.asList(address1,address2);
    }
}
