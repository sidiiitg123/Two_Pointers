package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class ThreeSum0 {
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        Collections.sort(A);
        for(int low=0;low<A.size();low++)
        {
            int end=A.size()-1;
            int mid=low+1;
            int x=A.get(low);
            while(mid<end)
            {
                int y=A.get(end),z=A.get(mid);
                int sum=x+y+z;
                if(sum==0)
                {
                    ArrayList<Integer> ad=new ArrayList<Integer>();
                    ad.add(x);ad.add(z);ad.add(y);
                    if(!res.contains(ad))
                        res.add(ad);
                }
                if(sum<=0)
                    mid++;
                else
                    end--;
            }
        }
        return res;
    }
}
