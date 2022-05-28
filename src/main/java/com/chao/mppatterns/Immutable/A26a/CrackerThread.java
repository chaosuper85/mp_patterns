package com.chao.mppatterns.Immutable.A26a;

import com.chao.mppatterns.Immutable.A26a.person.ImmutablePerson;
import com.chao.mppatterns.Immutable.A26a.person.MutablePerson;

/**
 * @author zhuchao
 * @date 2022/5/15 10:14 上午
 */
class CrackerThread extends Thread {

    private final MutablePerson mutable;

    public CrackerThread(MutablePerson mutable) {
        this.mutable = mutable;
    }

    public void run() {
        while (true) {
            ImmutablePerson immutable = new ImmutablePerson(mutable);
            if (!immutable.getName().equals(immutable.getAddress())) {
                System.out.println(currentThread().getName() + " ***** BROKEN ***** " +
                        "name:"+immutable.getName() +
                        "address:"+immutable.getAddress()
                );
            }
        }
    }
}
