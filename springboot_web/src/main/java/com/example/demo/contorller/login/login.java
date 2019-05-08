package com.example.demo.contorller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: admin_gan
 * @Date: 2019/5/8.
 * @version: 1.0
 */
@Controller
public class login {
    @RequestMapping(value = "user/login",method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password){
        //todo 登录验证
        System.out.println(username);
        System.out.println(password);
        return "index";
    }
}
