package com.chao.mppatterns.SingleThreadedExecution.JucSemaphore;

import java.util.Random;

/**
 * @author zhuchao
 * @date 2022/5/9 8:16 上午
 */ // 使用资源的线程
class UserThread extends Thread {

    private final static Random random = new Random(26535);
    private final BoundedResource resource;

    public UserThread(BoundedResource resource) {
        this.resource = resource;
    }

    public void run() {
        try {
            while (true) {
                resource.use();
                Thread.sleep(random.nextInt(3000));
            }
        } catch (InterruptedException e) {
        }
    }
}
