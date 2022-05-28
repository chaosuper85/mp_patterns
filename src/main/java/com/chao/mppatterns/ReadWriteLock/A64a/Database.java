package com.chao.mppatterns.ReadWriteLock.A64a;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Database<K, V> {

    private final Map<K, V> map = new HashMap<K, V>();

    private final ReadWriteLock lock = new ReentrantReadWriteLock(true /* fair */);
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    // 全部清除
    public void clear() {
        writeLock.lock();
        try {
            verySlowly();
            map.clear();
        } finally {
            writeLock.unlock();
        }
    }

    // 给key分配value
    public void assign(K key, V value) {
        writeLock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+":assign:begin");
            verySlowly();
            map.put(key, value);
            System.out.println(Thread.currentThread().getName()+":assign:end");
        } finally {
            writeLock.unlock();
        }
    }

    // 获取给key分配的值
    public V retrieve(K key) {
        readLock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+":retrieve:begin");
            slowly();
            System.out.println(Thread.currentThread().getName()+":retrieve:end");
            return map.get(key);
        } finally {
            readLock.unlock();
        }
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
