package com.example.demo.contorller.login;

import com.example.demo.pojo.ResObj;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    LoginService loginService;

    @RequestMapping(value = "login.htm",method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password){




        ResObj resObj = loginService.login(username, password);
        System.out.println(resObj.getData());
        return "index";
    }
}
