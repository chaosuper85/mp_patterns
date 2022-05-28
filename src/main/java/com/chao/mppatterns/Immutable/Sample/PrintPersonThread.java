package com.chao.mppatterns.Immutable.Sample;

public class PrintPersonThread extends Thread {

    private final Person person;

    public PrintPersonThread(Person person) {
        this.person = person;
    }

    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " prints " + person);
        }
    }
}
