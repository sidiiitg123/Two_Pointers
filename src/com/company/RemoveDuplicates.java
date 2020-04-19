package com.company;

import java.util.ArrayList;

public class RemoveDuplicates {
    public int removeDuplicates(ArrayList<Integer> a) {

        int i = 0;
        int k = 0;
        while(i<a.size()){
            if(!a.get(i).equals(a.get(k))){
                a.set(k+1, a.get(i));
                k++;
            }
            i++;
        }

        return k+1;
    }

}
