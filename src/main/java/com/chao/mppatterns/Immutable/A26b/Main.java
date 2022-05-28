package com.chao.mppatterns.Immutable.A26b;

import com.chao.mppatterns.Immutable.A26b.person.ImmutablePerson;
import com.chao.mppatterns.Immutable.A26b.person.MutablePerson;

public class Main {
    public static void main(String[] args) {
        MutablePerson mutable = new MutablePerson("start", "start");
        new CrackerThread(mutable).start();
        new CrackerThread(mutable).start();
        new CrackerThread(mutable).start();
        for (int i = 0; true; i++) {
            mutable.setPerson("" + i, "" + i);
        }
    }
}

