package com.stackroute.pe2;

import java.io.*;
import java.util.Scanner;

public class WordCount {
    public WordCount(){

    }
    public String countNoOfCharacter(String filepath){
        try {
            File myObj = new File(filepath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                int count=0;
            String word[]=data.split(" ");
            for(int i=0;i<word.length;i++){
                if(word[i].contentEquals(word[i+1])){
                    System.out.println(word[i]+":"+count);
                    count++;
                }
            }
            }
            myReader.close();
    }catch (Exception e){
            return null;
        }return null;
    }
}
