package com.example.demo.pojo.db;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author: admin_gan
 * @Date: 2019/5/21.
 * @version: 1.0
 */
@Data
public class User {

    private int id;
    private String name;
    private int age;
    private int dept_id;
    private int performance;
    private BigDecimal salary;
    private BigDecimal bonus;
    private String loginId;



}
