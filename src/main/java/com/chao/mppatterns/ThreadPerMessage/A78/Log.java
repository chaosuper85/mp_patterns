package com.chao.mppatterns.ThreadPerMessage.A78;

/**
 * @author zhuchao
 * @date 2022/5/24 3:26 下午
 */
class Log {

    public static void println(String s) {
        System.out.println(Thread.currentThread().getName() + ":" + s);
    }
}
