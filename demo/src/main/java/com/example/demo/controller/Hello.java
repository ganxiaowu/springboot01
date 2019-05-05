package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: adimn
 * @Date: 2019/5/5.
 * @version: 1.0
 */
@Controller
public class Hello {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "hello----word";
    }
}
