package org.znaji;

public class Student implements DailySession{

    private boolean isPresent;

    public Student(boolean isPresent) {
        this.isPresent = isPresent;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    @Override
    public void attendDailySession() {
        System.out.println("Student attended a session");
    }
}
