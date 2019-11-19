package com.sda.recursivity;

public class tema10afisari {

    static void printHello(int i){
        if(i<1){
            return;
        } else {
            System.out.println("Hello recursion");
//            System.out.println(i + " Hello recursion");
            printHello(i-1);
            return;
        }
    }

    public static void main ( String[] args ) {
        int i = 10;
        printHello(i);
    }
}
