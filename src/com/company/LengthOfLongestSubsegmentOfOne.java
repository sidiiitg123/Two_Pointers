package com.company;

import java.util.ArrayList;

public class LengthOfLongestSubsegmentOfOne {
    public int solve(ArrayList<Integer> A, int B) {
        int wr=0,wl=0,BestL=0,BestR=0,ZeroCount=0;

        while(wr<A.size()){

            if(ZeroCount<=B){
                if(A.get(wr).equals(0)){
                    ZeroCount++;
                }
                wr++;
            }
            if(ZeroCount>B){
                if(A.get(wl).equals(0)){
                    ZeroCount--;
                }
                wl++;
            }
            if((wr-wl)>(BestR-BestL)){
                BestL=wl;
                BestR=wr;
            }
        }
        int length=BestR-BestL-1;
        return length;
    }
}
