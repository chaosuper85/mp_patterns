package com.chao.mppatterns.TwoPhaseTermination.A102;

public class CountupThread extends Thread {

    // 计数值
    private long counter = 0;

    // 终止请求
    public void shutdownRequest() {
        interrupt();
        System.out.println("interrupt called");
        //stop = true;
    }

    // 线程体
    public void run() {
        try {

            while (!Thread.currentThread().isInterrupted()) {
                System.out.println(Thread.currentThread().isInterrupted());
                doWork();
            }
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        } finally {
            doShutdown();
        }
    }

    // 操作
    private void doWork() throws InterruptedException {
        counter++;
        System.out.println("doWork: counter = " + counter);
        //try {
            Thread.sleep(5000);
        //} catch (InterruptedException e) {
       //     System.out.println(e.toString());
       // } catch (Exception e) {
        //    System.out.println(e.toString());
        //}
    }

    // 终止处理
    private void doShutdown() {
        System.out.println("doShutdown: counter = " + counter);
    }
}
