package com.example.demo.config;

import com.example.demo.server.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: adimn
 * @Date: 2019/5/5.
 * @version: 1.0
 */
@Configuration
public class MyAppConfig {
    @Bean
    public UserService userService(){
        return new UserService();
    }

}
