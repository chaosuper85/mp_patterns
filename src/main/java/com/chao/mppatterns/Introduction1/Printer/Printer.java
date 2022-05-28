package com.chao.mppatterns.Introduction1.Printer;

public class Printer implements Runnable {

    private final String message;

    public Printer(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.print(message);
        }
    }
}
