package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {

        int remainder = k % j;
        int longjumps = (k - remainder) / j;

        return remainder + longjumps;
    }

}
