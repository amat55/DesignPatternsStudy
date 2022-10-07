package com.ahmetsenocak.singletondesign.challenge;

public class SelectCaptain {

    private SelectCaptain() {

    }

    //Bill Pugh Solution
    private static class SingletonHelper {
        private static final SelectCaptain _captain = new SelectCaptain();
    }

    public static SelectCaptain getCaptain() {
        return SingletonHelper._captain;
    }

    public static void main(String[] args) {
        System.out.println("Trying to select new captain for our team!");
        SelectCaptain s1 = SelectCaptain.getCaptain();

        System.out.println("Trying to select another captain for our team!");
        SelectCaptain s2 = SelectCaptain.getCaptain();

        if(s1 == s2){
            System.out.println("S1 and S2 are the same instance");
        }
    }
}
