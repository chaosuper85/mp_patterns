package com.chao.mppatterns.AppendixB.Final1;

public class Main {

    public static void main(String[] args) {
        // 线程A
        new Thread() {
            public void run() {
                new Something();
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
