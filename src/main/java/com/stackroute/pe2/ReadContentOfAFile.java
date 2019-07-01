package com.stackroute.pe2;


import java.io.File;
import java.io.FileReader;

public class ReadContentOfAFile {
    public int readFile(String filepath){
        try{
            FileReader fr = new FileReader(filepath);
            File f=new File(filepath);

            int i;
            while ((i=fr.read()) != -1)
//                System.out.println(i);
                System.out.print(Character.toUpperCase((char)i));

            return (int)f.length();
        }
        catch (Exception e) {
            return 0;
        }
    }
}
