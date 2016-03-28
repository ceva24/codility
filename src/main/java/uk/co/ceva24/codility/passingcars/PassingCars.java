package uk.co.ceva24.codility.passingcars;

class PassingCars
{
    public int solution(int[] A)
    {
        /*
         * Concept: count the number of eastbound cars. In the subsequent iterations, 
         * if we are westbound then we are due to pass all the previous
         * eastbound cars. Therefore we add that number of eastbound cars to the total passing cars.
         */
        
        int numberOfEast = 0;
        int passingCars = 0;
        
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] == 0)
            {
                numberOfEast++;
            }
            else if (A[i] == 1)
            {
                passingCars += numberOfEast;
            }
                        
            if (passingCars > 1000000000)
            {
                return -1;
            }
        }
        
        return passingCars;
    }
}