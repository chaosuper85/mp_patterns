package com.chao.mppatterns.ReadWriteLock.A62;

public class ReaderThread extends Thread {

    private final Data data;

    public ReaderThread(Data data) {
        this.data = data;
    }

    public void run() {
        try {
            while (true) {
                char[] readbuf = data.read();
                System.out.println(
                        Thread.currentThread().getName() + " reads " + String.valueOf(readbuf));
            }
        } catch (InterruptedException e) {
        }
    }
}
