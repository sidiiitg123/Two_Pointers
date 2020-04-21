package com.company;

import java.util.ArrayList;

public class Maxcontinuos1 {
    public ArrayList<Integer> maxone(ArrayList<Integer> A, int B) {

        int wL = 0, wR = 0;
        int bestL = 0, bestR = 0;

        int zeroCount= 0;

        while(wR < A.size()){

            if(zeroCount <= B){
                if(A.get(wR).equals(0)){
                    zeroCount++;
                }
                wR++;
            }

            if(zeroCount > B){
                if(A.get(wL).equals(0)){
                    zeroCount--;
                }
                wL++;
            }

            if((wR-wL) > (bestR-bestL)){
                bestL = wL;
                bestR = wR;
            }
        }

        ArrayList<Integer> r = new ArrayList<>();
        for(int i=bestL;i<bestR;i++){
            r.add(i);
        }

        return r;
    }
}
