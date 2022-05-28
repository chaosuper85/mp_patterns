package com.chao.mppatterns.Immutable.A26a;

import com.chao.mppatterns.Immutable.A26a.person.MutablePerson;

public class Main {

    public static void main(String[] args) {
        MutablePerson mutable = new MutablePerson("start", "start");
        new CrackerThread(mutable).start();
        new CrackerThread(mutable).start();
        new CrackerThread(mutable).start();
        for (int i = 0; i < 1000; i++) {
            mutable.setPerson("" + i, "" + i);
        }
    }
}

