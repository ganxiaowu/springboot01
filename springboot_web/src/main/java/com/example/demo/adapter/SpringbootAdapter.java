package com.example.demo.adapter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author: admin_gan
 * @Date: 2019/5/7.
 * @version: 1.0
 */
//@Configuration
public class SpringbootAdapter extends WebMvcConfigurerAdapter{
    /*@Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("*//**");
    }*/



    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/");
        super.addResourceHandlers(registry);
    }
}
