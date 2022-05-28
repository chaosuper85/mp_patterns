package com.chao.mppatterns.ActiveObject.Q122a;

import com.chao.mppatterns.ActiveObject.Sample.activeobject.ActiveObject;
import com.chao.mppatterns.ActiveObject.Sample.activeobject.ActiveObjectFactory;

public class Main {

    public static void main(String[] args) {
        ActiveObject activeObject = ActiveObjectFactory.createActiveObject();
        new AddClientThread("Diana", activeObject).start();
    }
}
