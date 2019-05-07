package com.example.demo.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * @author: admin_gan
 * @Date: 2019/5/7.
 * @version: 1.0
 */
@Controller
public class Hello {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello word!";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello", "<h1>涨涨涨</h1>");
        map.put("user", Arrays.asList("zhangshan","lishi","wangxing"));
        return "success";
    }

}
