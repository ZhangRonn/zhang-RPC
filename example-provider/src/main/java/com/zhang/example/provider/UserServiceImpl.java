package com.zhang.example.provider;

import com.zhang.example.common.model.User;
import com.zhang.example.common.service.UserService;

/**
 * 用户服务实现类
 *
 */
public class UserServiceImpl implements UserService {

    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}
