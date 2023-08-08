package com.moluo.demo.dubbo.consumer.controller;

import com.moluo.demo.dubbo.api.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 在消费者中调用服务
 */
@RestController
@RequestMapping("/mo/v1/user")
public class UserController {

    @DubboReference
    private UserService userService;

    @GetMapping("")
    public String getUserInfo(String userId) {
        return userService.getUserInfo(userId);
    }

}