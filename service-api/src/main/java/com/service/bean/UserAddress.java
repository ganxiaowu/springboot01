package com.service.bean;

import lombok.Data;

/**
 * @author: admin_gan
 * @Date: 2019/5/27.
 * @version: 1.0
 */
@Data
public class UserAddress {
    private Integer id;
    private String userAddress;
    private String userId;
    private String consignee;
    private String phoneNum;
    private String isDefault;
    public UserAddress(){
        super();
    }

    public UserAddress(Integer id, String userAddress, String userId, String consignee, String phoneNum, String isDefault) {
        this.id = id;
        this.userAddress = userAddress;
        this.userId = userId;
        this.consignee = consignee;
        this.phoneNum = phoneNum;
        this.isDefault = isDefault;
    }


}
