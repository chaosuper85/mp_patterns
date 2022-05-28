package com.chao.mppatterns.SingleThreadedExecution.JucSemaphore;

/**
 * @author zhuchao
 * @date 2022/5/9 8:16 上午
 */
class Log {

    public static void println(String s) {
        System.out.println(Thread.currentThread().getName() + ": " + s);
    }
}
