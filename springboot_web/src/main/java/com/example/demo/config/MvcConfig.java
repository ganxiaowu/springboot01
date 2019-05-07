package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * 自定义 mvc配置类
 * @author: admin_gan
 * @Date: 2019/5/7.
 * @version: 1.0
 */
@Configuration
public class MvcConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        //指定登录页面
       // registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("login");
        registry.addViewController("/viewTest").setViewName("login");
        super.addViewControllers(registry);
    }

    /*定义静态资源*/
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
    }
    //自定义方法
  /*  @Bean
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {

        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");


            }
        };

        return adapter;
    }*/

    /*自定义视图解析器*/



}
