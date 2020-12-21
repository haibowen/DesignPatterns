package com.example.proxypattern;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 创建动态代理
 * <p>
 * 无需实现特定的接口
 */
public class ProxyImageFactory {

    //维护一个目标对象

    private  Object target;

    public ProxyImageFactory (Object target){

        this.target=target;
    }

    //给目标对象生成代理对象
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

                        Object returnValue=method.invoke(target,objects);
                        return returnValue;
                    }
                }
        );
    }
}
