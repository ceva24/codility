package uk.co.ceva24.codility.maxproductofthree;

import java.util.ArrayList;
import java.util.Collections;

class MaxProductOfThreeImproved
{
    public int solution(int[] A)
    {
        // idea: sort all the values, return the product of the highest 3?
        ArrayList<Integer> values = new ArrayList<Integer>(); // we do care about duplicates.
        
        for (int i = 0; i < A.length; i++)
        {
            values.add(A[i]);
        }
        Collections.sort(values);
        
        int posVal = (values.get(values.size() - 1) * values.get(values.size() - 2) * values.get(values.size() - 3));
        int negVal = values.get(0) * values.get(1) * values.get(values.size() - 1);
        
        return (posVal > negVal ? posVal : negVal);
    }
}