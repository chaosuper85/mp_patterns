package com.chao.mppatterns.Introduction1.PrintThread;

public class Main {

    public static void main(String[] args) {
        new PrintThread("Good!").start();
        new PrintThread("Nice!").start();
    }
}
