package com.chao.mppatterns.ActiveObject.Sample;

import com.chao.mppatterns.ActiveObject.Sample.activeobject.ActiveObject;
import com.chao.mppatterns.ActiveObject.Sample.activeobject.ActiveObjectFactory;

public class Main {

    public static void main(String[] args) {
        ActiveObject activeObject = ActiveObjectFactory.createActiveObject();
        new MakerClientThread("Alice", activeObject).start();
        new MakerClientThread("Bobby", activeObject).start();
        new DisplayClientThread("Chris", activeObject).start();
    }
}
