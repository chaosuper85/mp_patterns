package com.chao.mppatterns.ReadWriteLock.A64b;

import java.util.HashMap;
import java.util.Map;

public class Database<K, V> {

    private final Map<K, V> map = new HashMap<K, V>();

    // 全部清除
    public synchronized void clear() {
        verySlowly();
        map.clear();
    }

    // 给key分配value
    public synchronized void assign(K key, V value) {
        System.out.println(Thread.currentThread().getName()+"assign begin");
        verySlowly();
        map.put(key, value);
        System.out.println(Thread.currentThread().getName()+"assign end");
    }

    // 获取给key分配的值
    public synchronized V retrieve(K key) {
        System.out.println(Thread.currentThread().getName()+"retrieve begin");
        slowly();
        System.out.println(Thread.currentThread().getName()+"retrieve end");
        return map.get(key);
    }

    // 模拟耗时的操作
    private void slowly() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
        }
    }

    // 模拟非常耗时的操作
    private void verySlowly() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
    }
}
