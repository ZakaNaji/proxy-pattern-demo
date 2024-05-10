package org.znaji;

public class StudentProxy extends Student{

    public StudentProxy(boolean isPresent) {
        super(isPresent);
    }

    @Override
    public void attendDailySession() {
        if (isPresent()) {
            super.attendDailySession();
        } else {
            System.out.println("Student did not attend a session");
        }
    }
}
