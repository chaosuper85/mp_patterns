package com.chao.mppatterns.WorkerThread.Sample;

import java.util.Random;

public class ClientThread extends Thread {

    private static final Random random = new Random();
    private final Channel channel;

    public ClientThread(String name, Channel channel) {
        super(name);
        this.channel = channel;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                Request request = new Request(getName(), i);
                channel.putRequest(request);
                Thread.sleep(random.nextInt(1000));
            }
        } catch (InterruptedException e) {
        }
    }
}
