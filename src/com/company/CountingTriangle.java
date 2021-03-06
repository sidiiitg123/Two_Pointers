package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class CountingTriangle {
    final int M = (int) 1e9+7;

    public int nTriang(ArrayList<Integer> A) {

        int count = 0;

        Collections.sort(A);

        for(int i=0;i<A.size()-2;i++){

            int k = i+2;
            for(int j=i+1;j<A.size();j++){

                while(k<A.size() && A.get(i) + A.get(j) > A.get(k)){
                    k++;
                }

                count = (count + (k-j-1))%M;
            }
        }

        return count%M;

    }
}
