package com.chao.mppatterns.ActiveObject.jucSample.activeobject;

public class ActiveObjectFactory {

    public static ActiveObject createActiveObject() {
        return new ActiveObjectImpl();
    }
}
