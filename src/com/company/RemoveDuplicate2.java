package com.company;

import java.util.ArrayList;

public class RemoveDuplicate2 {
    public int removeDuplicates(ArrayList<Integer> a) {

        int k=0;
        int n = a.size();
        for(int i=0;i<n;i++){

            if(i<n-2 && a.get(i).equals(a.get(i+1)) && a.get(i+2).equals(a.get(i+1)) ){
                continue;
            }
            else{
                a.set(k, a.get(i));
                k++;
            }
        }

        return k;

    }
}
