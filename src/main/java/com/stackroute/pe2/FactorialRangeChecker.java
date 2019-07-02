package com.stackroute.pe2;

public class FactorialRangeChecker {
    public FactorialRangeChecker(){

    }
    public String intFactorial(int number)  //this is checks the given inputis integer range and factorial of that number
    {
            int fact = 1;

            while(number > 0)
            {
                fact = fact * (number--);  //condition for factorial
            }

            if(fact < 0)
            {
                return "factorial out of range";
            }
            else
            {
                return fact+"";
            }
        }


        public String longfactorial(long number)  //it checks the given number should be in the range long
        {
            long fact = 1;

            while(number > 0)
            {
                fact = fact * (number--);  //contion for factorial
            }
            if(fact < 0)
            {
                return "factorial out of range";
            }
            else
            {
                return fact+"";
            }

        }
}

