package org.znaji;

public class Main {
    public static void main(String[] args) {
        final DailySession dailySession= new StudentProxy(true);
        dailySession.attendDailySession();
    }
}