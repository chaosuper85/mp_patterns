package com.chao.mppatterns.AppendixB.SingleThreadedExecution;

import java.util.Date;

public class MySystem {

    private static MySystem instance = null;
    private final Date date = new Date();

    private MySystem() {
    }

    public static synchronized MySystem getInstance() {
        if (instance == null) {
            instance = new MySystem();
        }
        return instance;
    }

    public Date getDate() {
        return date;
    }
}
