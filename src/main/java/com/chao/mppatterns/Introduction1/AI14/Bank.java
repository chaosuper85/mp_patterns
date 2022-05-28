package com.chao.mppatterns.Introduction1.AI14;

public class Bank {

    private int money;
    private final String name;

    public Bank(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public  synchronized void deposit(int m) {
        money += m;
        System.out.println(Thread.currentThread().getName()+"deposit : "+money);
    }

    public  synchronized boolean withdraw(int m) {
        if (money >= m) {
            money -= m;
            check();
            System.out.println(Thread.currentThread().getName()+"withdraw : "+money+" return "+true);
            return true;
        } else {
            System.out.println(Thread.currentThread().getName()+"withdraw : "+money+" return "+false);
            return false;
        }
    }

    public String getName() {
        return name;
    }

    private void check() {
        if (money < 0) {
            System.out.println(Thread.currentThread().getName()+"可用余额为负数! money = " + money);
        }
    }
}
