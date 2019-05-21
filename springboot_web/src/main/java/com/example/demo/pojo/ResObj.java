package com.example.demo.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: admin_gan
 * @Date: 2019/5/21.
 * @version: 1.0
 */
@Data
public class ResObj implements Serializable{
    private String code;
    private String message;
    private Object data;

    public ResObj(){}
    public ResObj(String code,String message,Object data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
