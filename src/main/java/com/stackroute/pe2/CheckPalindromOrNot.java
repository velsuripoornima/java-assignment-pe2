package com.stackroute.pe2;

public class CheckPalindromOrNot {
    public CheckPalindromOrNot(){

    }

    public String palindrom(String input) {
            try{
                if(input==null) {
                    return null;
                }
                    StringBuilder reverse=new StringBuilder();
                    for(int i=input.length()-1;i>=0;i--){
                        reverse.append(input.charAt(i));
                    }

                    return input.contentEquals(reverse) ? "palindrom" : "Not a palindrom";
                }
            catch (Exception e){
                return null;
            }
    }
}
