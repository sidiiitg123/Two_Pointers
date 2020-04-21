package com.company;

import java.util.ArrayList;

public class MaxContainer {
    public int maxArea(ArrayList<Integer> A) {
        int area = 0;
        int l = 0;
        int r = A.size()-1;

        while(l<r){

            area = Math.max(area, Math.min(A.get(l),A.get(r))*(r-l));

            if(A.get(l) < A.get(r)){
                l++;
            }
            else{
                r--;
            }
        }

        return area;
    }
}
