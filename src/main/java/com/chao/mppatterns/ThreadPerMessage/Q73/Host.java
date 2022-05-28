package com.chao.mppatterns.ThreadPerMessage.Q73;

import com.chao.mppatterns.ThreadPerMessage.jucSample6.Helper;

public class Host {

    private final Helper helper = new Helper();

    public void request(final int count, final char c) {
        System.out.println("    request(" + count + ", " + c + ") BEGIN");
        new Thread() {
            public void run() {
                helper.handle(count, c);
            }
        }.run();
        System.out.println("    request(" + count + ", " + c + ") END");
    }
}
