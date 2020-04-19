package com.company;

import java.util.ArrayList;
import java.util.List;

public class IntersectTwoArray {

    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> myarr=new ArrayList<>();

        int i=0;
        int j=0;

        while(i<A.size() && j< B.size()){

            if(A.get(i)==B.get(j)){
                myarr.add(A.get(i));
                i++;
                j++;
            }else if(A.get(i)<B.get(j)){
                i++;
            }else
                j++;
        }
        return myarr;
    }
}
