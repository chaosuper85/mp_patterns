package com.chao.mppatterns.SingleThreadedExecution.A16B;

public class EaterThread extends Thread {

    private final Pair pair;
    private final String name;

    public EaterThread(String name, Pair pair) {
        this.name = name;
        this.pair = pair;
    }

    public void run() {
        while (true) {
            eat();
        }
    }

    public void eat() {
        synchronized (pair) {
            System.out.println(name + " takes up " + pair + ".");
            System.out.println(name + " is eating now, yum yum!");
            System.out.println(name + " puts down " + pair + ".");
        }
    }
}
