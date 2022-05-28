package com.chao.mppatterns.ActiveObject.Q122b;

import com.chao.mppatterns.ActiveObject.A122b.activeobject.ActiveObject;
import com.chao.mppatterns.ActiveObject.A122b.activeobject.ActiveObjectFactory;

public class Main {

    public static void main(String[] args) {
        ActiveObject activeObject = ActiveObjectFactory.createActiveObject();
        try {
            new AddClientThread("Diana", activeObject).start();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        } finally {
            System.out.println("*** shutdown ***");
            activeObject.shutdown();
        }
    }
}
