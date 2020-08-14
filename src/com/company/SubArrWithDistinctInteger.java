package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SubArrWithDistinctInteger {

    public int totalSubArr(ArrayList<Integer> A, int B){
        if(A==null || A.size()==0)
            return -1;
        int left=0,right=0,count=0;
        Map<Integer,Integer> myMap=new HashMap<>();

        while(right<A.size()){

            myMap.put(A.get(right),myMap.getOrDefault(A.get(right),0)+1);

            while(myMap.size()>B && left<A.size()){
                myMap.put(A.get(left),myMap.get(A.get(left))-1);
                if(myMap.get(A.get(left))==0)
                    myMap.remove(A.get(left));
                left++;
            }

            count+=right-left+1;
            right++;
        }
        return count;
    }

    public int solve(ArrayList<Integer> A, int B) {
        return totalSubArr(A,B)-totalSubArr(A,B-1);
    }
}
