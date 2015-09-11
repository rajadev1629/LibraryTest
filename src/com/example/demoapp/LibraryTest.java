package com.example.demoapp;

public class LibraryTest {
     public static void printMessage(String message){
    	 int value = 5/2;
    	 System.out.println("value : "+value);
    	 printCallingMessage(message);
     }
     
     static void printCallingMessage(String message){
    	 System.out.println("message : "+message);
     }
}
