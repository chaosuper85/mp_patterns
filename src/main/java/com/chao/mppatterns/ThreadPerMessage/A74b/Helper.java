package com.chao.mppatterns.ThreadPerMessage.A74b;

/**
 * @author zhuchao
 * @date 2022/5/24 11:42 上午
 */ // Inner class
class Helper {

    public void handle(int count, char c) {
        System.out.println("        handle(" + count + ", " + c + ") BEGIN");
        for (int i = 0; i < count; i++) {
            slowly();
            System.out.print(c);
        }
        System.out.println();
        System.out.println("        handle(" + count + ", " + c + ") END");
    }

    private void slowly() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
