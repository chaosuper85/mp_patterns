package com.chao.mppatterns.ActiveObject.Sample;

import com.chao.mppatterns.ActiveObject.Sample.activeobject.ActiveObject;
import com.chao.mppatterns.ActiveObject.Sample.activeobject.Result;

public class MakerClientThread extends Thread {

    private final ActiveObject activeObject;
    private final char fillchar;

    public MakerClientThread(String name, ActiveObject activeObject) {
        super(name);
        this.activeObject = activeObject;
        this.fillchar = name.charAt(0);
    }

    public void run() {
        try {
            for (int i = 0; true; i++) {
                // 有返回值的调用
                Result<String> result = activeObject.makeString(i, fillchar);
                Thread.sleep(10);
                String value = result.getResultValue();
                System.out.println(Thread.currentThread().getName() + ": value = " + value);
            }
        } catch (InterruptedException e) {
        }
    }
}
