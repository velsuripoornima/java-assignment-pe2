package com.stackroute.pe2;

public class FactorialRangeChecker {
    public FactorialRangeChecker(){

    }
    public String intFactorial(int number){
            int fact = 1;

            while(number > 0)
            {
                fact = fact * (number--);
            }
            System.out.println(fact);

            if(fact < 0)
            {
                return "factorial out of range";
            }
            else
            {
                return fact+"";
            }
        }


        public String longfactorial(int number)
        {
            long fact = 1;

            while(number > 0)
            {
                fact = fact * (number--);
            }
            System.out.println(fact);

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

