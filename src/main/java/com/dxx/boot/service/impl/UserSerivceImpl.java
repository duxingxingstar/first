package com.dxx.boot.service.impl;

import com.dxx.boot.entity.User;
import com.dxx.boot.service.UserService;

public class UserSerivceImpl implements UserService{
    @Override
    public User getById(Long id) {
        System.out.println("执行了getById方法");
        return null;
    }
}
