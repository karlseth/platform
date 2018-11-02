package com.kz.annotation;


import java.awt.print.Printable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

// 集成InvocationHandler
public class LogProxy implements InvocationHandler {

    private Object object;

    // object=userService
    public static Object getInstance(Object object){
        LogProxy logProxy = new LogProxy();

        logProxy.object = object; //userService

//        object.getClass().getInterfaces();

        Object result = Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), logProxy);

        return result;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("the method name is : " + method.getName());

        if (method.isAnnotationPresent(LogInfo.class)) {
            LogInfo logInfo = method.getAnnotation(LogInfo.class);

            System.out.println(new Date().toString() + " ### " +logInfo.value());
        }


        if (method.isAnnotationPresent(Printer.class)) {
            Printer printer = method.getAnnotation(Printer.class);
            System.out.println("####" + printer.value() + " -- " + printer.name() + " -- " + printer.date());
        }

        Object o = method.invoke(object, args);

        return o;
    }
}
