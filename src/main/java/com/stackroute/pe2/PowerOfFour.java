package com.stackroute.pe2;

public class PowerOfFour {
    public PowerOfFour(){

    }
    public boolean isPower(long input){

        if(input == 0){
            return false;
        }
        while (input != 1){
            if( input % 4 != 0 )
                return false;

            input = input/4;

        }return true;
    }
}

