package com.example.demo.mapper.login;

import com.example.demo.pojo.db.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @author: admin_gan
 * @Date: 2019/5/21.
 * @version: 1.0
 */
@Component
@Mapper
public interface UserMapper {
    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */

    @Select("select u.* from user u,password p where u.loginId = #{username} and p.userId = u.id and p.password=#{password}")
    User login(@Param("username") String username,@Param("password") String password );
}
