package com.service.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.service.bean.UserAddress;
import com.service.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author: admin_gan
 * @Date: 2019/5/27.
 * @version: 1.0
 */
@Service(version = "2.0.0")
@Component
public class UserServiceNewImpl implements UserService{
    @Override
    public List<UserAddress> getUserAddressLsit(String userId) {
        UserAddress address1 = new UserAddress(1, "成都一环路", "1", "李老师", "1895654", "7878");
        UserAddress address2 = new UserAddress(1, "成都五环路", "2", "张老师", "1895655", "7879");
        System.out.println("-------服务被调用 新版本-----");
        return Arrays.asList(address1,address2);
    }
}
