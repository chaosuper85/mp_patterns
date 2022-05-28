package com.chao.mppatterns.SingleThreadedExecution.JucSemaphore;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * @author zhuchao
 * @date 2022/5/9 8:16 上午
 */ // 资源个数有限
class BoundedResource {

    private final static Random random = new Random(314159);
    private final Semaphore semaphore;
    private final int permits;

    // 构造函数(permits为资源个数)
    public BoundedResource(int permits) {
        this.semaphore = new Semaphore(permits);
        this.permits = permits;
    }

    // 使用资源
    public void use() throws InterruptedException {
        semaphore.acquire();
        try {
            doUse();
        } finally {
            semaphore.release();
        }
    }

    // 实际使用资源(此处仅使用Thread.sleep)
    protected void doUse() throws InterruptedException {
        Log.println("BEGIN: used = " + (permits - semaphore.availablePermits()));
        Thread.sleep(random.nextInt(500));
        Log.println("END:   used = " + (permits - semaphore.availablePermits()));
    }
}
