package com.back.p_62_260730;

public class APerson implements Doctor{

    @Override
    public void introduce() {
        System.out.println("A타입 사람입니다");
    }

    @Override
    public void breathe() {
        System.out.println("숨쉬다");
    }

    @Override
    public void diagnosis() {
        System.out.println("진단합니다");
    }
}
