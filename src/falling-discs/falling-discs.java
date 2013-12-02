class Solution
{
    public int solution(int[] A, int[] B)
    {
        // A - rings
        // B - discs
        
        int lastDiscPosition = A.length - 1; // no discs yet.
        
        int maxRing = A.length - 1;
        int maxRingDiameter = A[A.length -1];
        int totalDiscs = 0;
        
        // When a disc is added, remove elements from the rings array that can't be reached... OR don't go down that far (maxRing variable).
        
        outer :
        for (int i = 0; i < B.length; i++) // looping through discs.
        {
            System.err.println("got a disc " + i + " with diameter " + B[i]);
            
            // Just need the correct break clause now...
            
            inner :
            for (int j = 0; j <= maxRing; j++) // looping through rings.
            {
                System.err.println("looping through rings, this is ring " + j + " with diameter " + A[j]);
                
                if ((B[i] > A[j])) // if this disc diameter is greater than the well's ring's diameter...
                {
                    System.err.println("its hit");
                    // it hits.
                    totalDiscs++;
                    maxRing = j - 2; // we got to position j in the well - maxring is on the level above.
                    System.err.println("now we loop to position " + maxRing);
                     if (maxRing < 0)
                     {
                         break;
                     }
                    continue outer;
                }
            }
            
            System.err.println("disc " + i + " hit on position " + maxRing);
            maxRing--; // its hit.
            totalDiscs++;
                     if (maxRing < 0)
                     {
                         break;
                     }
            

        }
        
        return totalDiscs;
    }
}