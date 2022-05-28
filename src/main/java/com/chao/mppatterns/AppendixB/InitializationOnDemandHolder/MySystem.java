package com.chao.mppatterns.AppendixB.InitializationOnDemandHolder;

import java.util.Date;

public class MySystem {

    private final Date date = new Date();

    private MySystem() {
    }

    public static MySystem getInstance() {
        return Holder.instance;
    }

    public Date getDate() {
        return date;
    }

    private static class Holder {

        public static MySystem instance = new MySystem();
    }
}
