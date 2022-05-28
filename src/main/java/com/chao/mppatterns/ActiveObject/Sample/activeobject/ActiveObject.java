package com.chao.mppatterns.ActiveObject.Sample.activeobject;

public interface ActiveObject {

    Result<String> makeString(int count, char fillchar);

    void displayString(String string);

    Result<String> add(String x, String y);
}
