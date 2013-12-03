import java.util.ArrayList;

class Solution
{
    public int solution(int[] A)
    {
        /*
        
        * rules:
        * find the minimum and then maximum, BUT we have to account for when the maximum is before the minimum.
        * O(N), no nested loops.
        * keep track of the minimum stock price - once we find a lower minimum, store its maximum profit and use the new minimum for the rest of
        * the iterations.
        *
        * because profit/loss is subtraction, can use ints not longs.
        *
        * store all the max profits in an array, find the highest at the end.
        
        * this won't work...
        * day 1 \ day 5 ...? is that correct
        * Maximum possible profit was 356. It would occur if a share was bought on day 1 and sold on day 5." in problem description- WHAT?
        */
        
        // Add some exceptional cases - e.g. empty, one value, two values...?
        
        if (A.length == 0 || A.length == 1)
        {
            return 0;
        }

        if (A.length == 2)
        {
            return (((A[0] - A[1]) > (A[1] - A[0])) ? (A[0] - A[1]) : (A[1] - A[0]));
        }

        //ArrayList<Integer> maxProfits = new ArrayList<Integer>();
        
        
        int absoluteMaxProfit = 0;
        int minStockPrice = A[0];
        int currentMaxProfit = 0;
        
        for (int i = 1; i < A.length; i++)
        {
            if (A[i] == minStockPrice)
            {
                continue;
            }
            else if (A[i] < minStockPrice)
            {
                if (currentMaxProfit > absoluteMaxProfit)
                {
                    absoluteMaxProfit = currentMaxProfit;
                }

                minStockPrice = A[i];
                currentMaxProfit = 0;
                continue;
            }
            else
            {
                // have to check current max profit and see if its higher.
                if ((A[i] - minStockPrice) > currentMaxProfit)
                {
                    currentMaxProfit = A[i] - minStockPrice;
                }
            }
        }
        
        if (currentMaxProfit > absoluteMaxProfit)
        {
            absoluteMaxProfit = currentMaxProfit;
        }
        
        return absoluteMaxProfit;
    }
}