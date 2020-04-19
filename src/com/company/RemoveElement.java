package com.company;

import java.util.ArrayList;

public class RemoveElement {
    public int removeElement(ArrayList<Integer> a, int b) {

        int k=0;
        int n = a.size();
        for(int i=0;i<n;i++){

            if(!a.get(i).equals(b)){
                a.set(k, a.get(i));
                k++;
            }
        }

        return k;

    }
}
