package uk.co.ceva24.codility.fish;

import java.util.ArrayList;

class Fish
{
    public int solution(int[] A, int[] B)
    {
        // each index is a fish.
        ArrayList<Integer> AList = new ArrayList<Integer>();
        ArrayList<Integer> BList = new ArrayList<Integer>();
        for (int i = 0; i < A.length; i++)
        {
            AList.add(A[i]);
            BList.add(B[i]);
        }
        
        // the later indices are downstream.
        
        // each fish is a different size.
        
        // rules:
        /*
          find the first place where fish meet (this != prev).
          decide the winner.
          remove the loser from both arrays.
          
          re-loop and repeat.
          
          // while loop until all are 0, or all are 1?
        
          // account arrays/loops properly for when only 1 fish is left.
        */
        boolean differentFlowingFish = true;
        
        outer :
        while (differentFlowingFish)
        {
            inner :
            for (int i = 0; i < BList.size() - 1; i++)
            {
                
                if ((BList.get(i) == 1) && (BList.get(i +1) == 0))
                {
                    // found a fish-off.
                    if (AList.get(i) > AList.get(i +1))
                    {
                        // i is the winner - remove i - 1.
                        AList.remove(i + 1);
                        BList.remove(i + 1);

                        continue outer;
                    }
                    else
                    {
                        // i is the loser - Remove i.
                        AList.remove(i);
                        BList.remove(i);

                        continue outer;
                    }
                    
                }
            }
            
            differentFlowingFish = false;
        }
        
        return BList.size();
    }
}