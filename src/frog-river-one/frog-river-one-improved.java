import java.util.HashSet;

class Solution
{
    public int solution(int X, int[] A)
    {
        HashSet<Integer> leavesPlaced = new HashSet<Integer>();
        
        for (int i = 0; i < A.length; i++)
        {
            leavesPlaced.add(A[i]);
            if (leavesPlaced.size() == X)
            {
                return i;
            }
        }
        
        return -1;
    }
}