package com.codecool;

public class Challenge {

    public static int minPositive(int a, int b) {
        boolean aPos = a>0;
        boolean bPos = b>0;

        if(aPos){
            if(bPos){
                return a>b ? b : a;
            }
            return a;
        }
        if(bPos){
            return b;
        }
        return -1;

    }
}
