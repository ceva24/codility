package uk.co.ceva24.codility.brackets;

class Brackets
{
    public int solution(String S)
    {
        int curved = 0;
        int curly = 0;
        int square = 0;
        
        if (S.length() == 0)
        {
            return 1;
        }
        
        if (S.length() % 2 != 0)
        {
            return 0;
        }
        
        if (S.charAt(0) == '}' || S.charAt(0) == ']' || S.charAt(0) == ')')
        {
            return 0;
        }
        
        /*if (S.charAt((S.length() / 2) - 1) == '}' || S.charAt((S.length() / 2) - 1) == ')' || S.charAt((S.length() / 2) - 1) == ']')
        {
            int leftSolution = solution(S.substring(0, (S.length() / 2)));
            int rightSolution = solution(S.substring((S.length() / 2), S.length()));
            
            if (leftSolution == 1  && rightSolution == 1)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        
        System.err.println(S);*/
        
        for (int i = 0; i < S.length(); i++)
        {
            if (S.charAt(i) == ')')
            {
                curved--;
                
                if (S.charAt(i - 1) == '{' || S.charAt(i - 1) == '[')
                {
                    return 0;
                }
            }
            else if (S.charAt(i) == '}')
            {
                curly--;
                
                if (S.charAt(i - 1) == '(' || S.charAt(i - 1) == '[')
                {
                    return 0;
                }
            }
            else if (S.charAt(i) == ']')
            {
                square--;
                
                if (S.charAt(i - 1) == '{' || S.charAt(i - 1) == '(')
                {
                    return 0;
                }
            }
            if (S.charAt(i) == '(')
            {
                curved++;
            }
            else if (S.charAt(i) == '{')
            {
                curly++;
            }
            else if (S.charAt(i) == '[')
            {
                square++;
            }
        }
        
        if ((curved + curly + square) > 0)
        {
            return 0;
        }
        
        return 1;
    }
}