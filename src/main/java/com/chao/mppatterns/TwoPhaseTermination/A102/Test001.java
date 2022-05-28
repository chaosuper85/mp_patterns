package com.chao.mppatterns.TwoPhaseTermination.A102;

/**
 * @author zhuchao
 * @date 2022/5/27 10:35 上午
 */
public class Test001 {

    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                while (!this.isInterrupted()) {
                    System.out.println(this.isInterrupted());
                }
                System.out.println("thread end");
            }
        };
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
        System.out.println(thread.isInterrupted());
        System.out.println("main end");
    }

}
