package com.dxx.boot.test;

import com.dxx.boot.proxy.MyProxyFactory;
import com.dxx.boot.service.UserService;
import com.dxx.boot.service.impl.UserSerivceImpl;

public class TestProxy {

    public static void main(String[] args) {
        UserService service = new UserSerivceImpl();
        UserService proxy = (UserService) new MyProxyFactory(service).getProxy();
        proxy.getById(1L);
    }
}
