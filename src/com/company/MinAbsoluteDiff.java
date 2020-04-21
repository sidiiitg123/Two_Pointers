package com.company;

import java.util.ArrayList;

public class MinAbsoluteDiff {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {

        int i=0;
        int j=0;
        int k=0;

        int min_diff = Math.abs(Math.max(A.get(i), Math.max(B.get(j), C.get(k))) - Math.min(A.get(i), Math.min(B.get(j), C.get(k))));

        while(i<A.size() && j<B.size() && k<C.size()){

            int max = Math.max(A.get(i), Math.max(B.get(j), C.get(k)));
            int min = Math.min(A.get(i), Math.min(B.get(j), C.get(k)));
            int current = Math.abs(max - min);

            if(current < min_diff){
                min_diff = current;
            }

            if(min == A.get(i)){
                i++;
            }
            else if(min == B.get(j)){
                j++;
            }
            else{
                k++;
            }
        }

        return min_diff;
    }
}
