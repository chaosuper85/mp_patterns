package com.chao.mppatterns.ThreadSpecificStorage.A116;

public class Main {

    private static final int TASKS = 10;

    public static void main(String[] args) {
        for (int t = 0; t < TASKS; t++) {
            // 写日志的任务
            Runnable printTask = new Runnable() {
                @Override
                public void run() {
                    Log.println("Hello!");
                    Log.close();
                }
            };
            // 执行任务
            new Thread(printTask).start();
        }
    }
}
