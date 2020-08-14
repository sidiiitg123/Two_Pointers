package com.company;

import java.util.*;

public class PairWithGivenDiff {

    public int solve(ArrayList<Integer> A, int B) {
        Map<Integer,Integer> myMap=new HashMap<>();

        for(int i=0;i<A.size();i++){
            if(!myMap.containsKey(A.get(i))){
                myMap.put(A.get(i),1);
            }else{
                myMap.put(A.get(i),myMap.get(A.get(i))+1);
            }
        }
        if(B==0){
            for(Map.Entry<Integer,Integer> x :myMap.entrySet()){
                if(x.getValue()>=2){
                    return 1;
                }
            }
            return 0;
        }else{
            for(int i=0;i<A.size();i++){
                if(myMap.containsKey(A.get(i) + B))
                    return 1;
            }
        }
        return 0;
    }
}
