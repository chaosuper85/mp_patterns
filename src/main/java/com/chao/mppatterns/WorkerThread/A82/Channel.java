package com.chao.mppatterns.WorkerThread.A82;

public final class Channel {

    public Channel(int threads) {
    }

    public void startWorkers() {
    }

    public void putRequest(final Request request) {
        new Thread() {
            public void run() {
                request.execute();
            }
        }.start();
    }
}
