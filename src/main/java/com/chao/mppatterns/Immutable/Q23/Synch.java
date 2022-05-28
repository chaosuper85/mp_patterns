package com.chao.mppatterns.Immutable.Q23;

/**
 * @author zhuchao
 * @date 2022/5/15 12:52 下午
 */
class Synch {

    private final String name = "Synch";

    public synchronized String toString() {
        return "[ " + name + "]";
    }
}
