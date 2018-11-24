package com.quedu.fourteam.controller;

import com.quedu.fourteam.pojo.User;
import com.quedu.fourteam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@RestController
public class UserController {
    @Autowired
    private UserService service;
    /**
     * 用户注册
     * @param user 用户填写的用户信息
     * @return 返回注册的user对象
     */
    @PostMapping("/register")
    public User register(User user, HttpServletRequest request) throws UnsupportedEncodingException {

        request.setCharacterEncoding("utf-8");
        System.out.println(user);
        return service.register(user);
    }



}
