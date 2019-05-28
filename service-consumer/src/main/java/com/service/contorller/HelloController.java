package com.service.contorller;

import com.service.bean.UserAddress;
import com.service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @author: admin_gan
 * @Date: 2019/5/28.
 * @version: 1.0
 */
@Controller
public class HelloController {

    @Autowired
    OrderService orderService;

    @ResponseBody
    @RequestMapping("/hello")
    public List<UserAddress> getOrederAddress(@RequestParam("uid") String userId){
        System.out.println("-----------:"+userId);
        return orderService.intoOrder(userId);
    }
}
