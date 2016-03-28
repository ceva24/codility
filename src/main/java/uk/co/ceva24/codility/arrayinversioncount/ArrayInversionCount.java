package uk.co.ceva24.codility.arrayinversioncount;

class ArrayInversionCount
{
    public int solution(int[] A)
    {
        int inversionCount = 0;
        
        for (int i = 0; i < A.length; i++)
        {
            for (int j = i + 1; j < A.length; j++)
            {
                if ((i < j) && (A[i] > A[j]))
                {
                     inversionCount++;
                }
                if (inversionCount > 1000000000)
                {
                    inversionCount = -1;
                    break;
                }
            }
        }
        
        return inversionCount;
    }
}