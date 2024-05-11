package org.znaji;

import org.znaji.proxy.DailySessionDynamicProxy;

public class Main {
    public static void main(String[] args) {
        final DailySession dailySession= DailySessionDynamicProxy.getNewInstance(new Student(false));
        dailySession.attendDailySession();
    }
}