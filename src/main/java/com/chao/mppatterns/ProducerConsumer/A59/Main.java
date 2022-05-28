package com.chao.mppatterns.ProducerConsumer.A59;

public class Main {

    public static void main(String[] args) {
        System.out.println("BEGIN");
        try {
            Something.method(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("END");
    }
}
