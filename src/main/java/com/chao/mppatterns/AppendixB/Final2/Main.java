package com.chao.mppatterns.AppendixB.Final2;

public class Main {

    public static void main(String[] args) {
        // 线程A
        new Thread() {
            public void run() {
                Something.create();
            }
        }.start();

        // 线程B
        new Thread() {
            public void run() {
                Something.print();
            }
        }.start();
    }
}
