class Solution
{
    public int solution(String S)
    {
        /*
        
        * rules:
        *    loop through from i to a third of the way through, increasing length each time.
        *    check that the suffix is equal to the current prefix.
        *    do a contains on the substring in-between.
        *    if all true, est the result to i.
        *
        */
        
        int max = 0;
        for (int i = 1; i <= Math.floor(S.length() / 3); i++)
        {
            String prefix = S.substring(0, i);
            String suffix = S.substring(S.length() - i);
            
            if (!(prefix.equals(suffix)))
            {
                continue;
            }
            else // its a border.
            {
                String middle = S.substring(i, S.length() - i);
                if (middle.contains(prefix))
                {
                    max = i;
                }
            }
        }
        
        return max;
    }
}