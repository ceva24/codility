import java.util.HashMap;
import java.util.HashSet;

class Solution
{
    public int solution(int[] A)
    {
        final HashMap<Integer, Integer> counters = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < A.length; i++)
        {
            if (counters.get(A[i]) != null)
            {
                counters.put(A[i], counters.get(A[i]) + 1);
            }
            else
            {
                counters.put(A[i], 1);
            }
        }

        int highestCounter = 0;
        int dominatingNumber = -1;
        for (Integer i : counters.keySet())
        {
            if (counters.get(i) > highestCounter)
            {
                highestCounter = counters.get(i);
                dominatingNumber = i;
            }
        }
        
        HashSet<Integer> noDups = new HashSet<Integer>();
        for (Integer i : counters.values())
        {
            if (i == highestCounter && !noDups.add(i))
            {
                return -1;
            }
        }

        for (int i = 0; i < A.length; i++)
        {
            if (A[i] == dominatingNumber)
            {
                return i;
            }
        }
        
        return -1;
    }
}