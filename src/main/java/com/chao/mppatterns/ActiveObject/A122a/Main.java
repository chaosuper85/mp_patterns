package com.chao.mppatterns.ActiveObject.A122a;

import com.chao.mppatterns.ActiveObject.A122a.activeobject.ActiveObject;
import com.chao.mppatterns.ActiveObject.A122a.activeobject.ActiveObjectFactory;

public class Main {

    public static void main(String[] args) {
        ActiveObject activeObject = ActiveObjectFactory.createActiveObject();
        new AddClientThread("Diana", activeObject).start();
    }
}
