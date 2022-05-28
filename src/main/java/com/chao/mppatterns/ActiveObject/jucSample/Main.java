package com.chao.mppatterns.ActiveObject.jucSample;

import com.chao.mppatterns.ActiveObject.jucSample.activeobject.ActiveObject;
import com.chao.mppatterns.ActiveObject.jucSample.activeobject.ActiveObjectFactory;

public class Main {

    public static void main(String[] args) {
        ActiveObject activeObject = ActiveObjectFactory.createActiveObject();
        try {
            new MakerClientThread("Alice", activeObject).start();
            new MakerClientThread("Bobby", activeObject).start();
            new DisplayClientThread("Chris", activeObject).start();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        } finally {
            System.out.println("*** shutdown ***");
            activeObject.shutdown();
        }
    }
}
