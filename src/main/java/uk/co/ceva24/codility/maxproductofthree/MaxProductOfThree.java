package uk.co.ceva24.codility.maxproductofthree;

import java.util.ArrayList;
import java.util.Collections;

class MaxProductOfThree
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
        
        return (values.get(values.size() - 1) * values.get(values.size() - 2) * values.get(values.size() - 3));
    }
}