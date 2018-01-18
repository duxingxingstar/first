package com.dxx.boot.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxyFactory implements InvocationHandler{
    private Object target;

    public MyProxyFactory(Object target) {
        this.target = target;
    }

    public MyProxyFactory() {
        super();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("传入参数"+args.toString());
        Object result = method.invoke(target,args);
        System.out.println("得到结果:"+result);
        return result;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
