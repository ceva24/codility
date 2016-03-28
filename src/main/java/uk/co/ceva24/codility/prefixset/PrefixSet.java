package uk.co.ceva24.codility.prefixset;

import java.util.HashSet;

class PrefixSet
{
    public int solution(int[] A)
    {
        if (A.length == 1)
        {
            return 0;
        }
        
        final HashSet<Integer> values = new HashSet<Integer>();
        for (int v : A)
        {
            values.add(v);
        }

        final HashSet<Integer> matchedValues = new HashSet<Integer>();
        
        for (int i = 0; i < A.length; i++)
        {
            matchedValues.add(A[i]);
            if (matchedValues.equals(values))
            {
                return i;
            }
        }
        
        return (A.length - 1); // Should never be reached.
    }
}