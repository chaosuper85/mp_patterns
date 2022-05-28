package com.chao.mppatterns.Introduction1.AI14;

public class ClientThread extends Thread {

    private final Bank bank;

    public ClientThread(Bank bank) {
        this.bank = bank;
    }

    public void run() {
        while (true) {
            boolean ok = bank.withdraw(1000);
            if (ok) {
                System.out.println(Thread.currentThread().getName()+(ok?"ok":"not ok"));
                bank.deposit(1000);
            } else {
                System.out.println(Thread.currentThread().getName()+(ok?"ok":"not ok"));
            }
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
