package org.znaji.proxy;

import org.znaji.DailySession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DailySessionDynamicProxy implements InvocationHandler {

    private final DailySession dailySession;

    public DailySessionDynamicProxy(DailySession dailySession) {
        this.dailySession = dailySession;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //pre-processing
        if (method.getName().equals("attendDailySession") && dailySession.isPresent()) {
            return method.invoke(dailySession, args);
        } else {
            throw new RuntimeException("Student did not attend a session");
        }
    }

    public static DailySession getNewInstance(DailySession dailySession) {
        return (DailySession) Proxy.newProxyInstance(
                DailySession.class.getClassLoader(),
                new Class[]{DailySession.class},
                new DailySessionDynamicProxy(dailySession));
    }
}
