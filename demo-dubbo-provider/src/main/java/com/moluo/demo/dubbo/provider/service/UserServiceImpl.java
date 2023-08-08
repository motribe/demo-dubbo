package com.moluo.demo.dubbo.provider.service;

import com.moluo.demo.dubbo.api.UserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 实现服务接口
 */
@DubboService
public class UserServiceImpl implements UserService {

    @Override
    public String getUserInfo(String userId) {
        // 查询数据库或其他操作
        return "User info for user " + userId;
    }

}