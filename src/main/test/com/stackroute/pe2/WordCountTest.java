package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordCountTest {
    public static WordCount wordCount;
    @BeforeClass
    public static void setUp(){
        wordCount=new WordCount();
    }
    @AfterClass
    public static void tearDown(){
        wordCount=null;
    }
    @Test
    public void filpath(){
        assertEquals(" ",wordCount.countNoOfCharacter("/home/poornima/Desktop/file.txt"));
    }

}