package com.chao.mppatterns.ThreadPerMessage.A74b;

public class Host {

    private final Helper helper = new Helper();

    public void request(int count, char c) {
        System.out.println("    request(" + count + ", " + c + ") BEGIN");
        new HelperThread(count, c).start();
        System.out.println("    request(" + count + ", " + c + ") END");
    }

    // Inner class
    private class HelperThread extends Thread {

        private final int count;
        private final char c;

        public HelperThread(int count, char c) {
            this.count = count;
            this.c = c;
        }

        public void run() {
            helper.handle(count, c);
        }
    }
}
