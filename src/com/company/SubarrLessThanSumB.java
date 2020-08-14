package com.company;

import java.util.ArrayList;

public class SubarrLessThanSumB {

    public int solve(ArrayList<Integer> A, int B) {
        int start=0,end=0,count=0,sum=A.get(0);
        while(start<A.size() && end<A.size()){

            if(sum<B){
                end++;
                if(end>=start){
                    count+=end-start;
                }
                if(end<A.size()){
                    sum+=A.get(end);
                }

            }else{
                sum-=A.get(start);
                start++;
            }
        }
        return count;
    }
}
