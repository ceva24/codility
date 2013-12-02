import java.util.HashSet;

class Solution
{
    public int solution(int X, int[] A)
    {
        HashSet<Integer> leavesPlaced = new HashSet<Integer>();
        
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] < X)
            {
                leavesPlaced.add(A[i]);
            }
            else if ((A[i] == X) && (leavesPlaced.size() == (X - 1)))
            {
                return i;
            }
        }
        
        return -1;
    }
}