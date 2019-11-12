package com.sda.recursivity;

public class TemaFibonaciRecursion {
    static int n1=0;
    static int n2=1;
    static int n3=1;

    static void serieFibonaci(int i){
        if(i>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");
            serieFibonaci(i-1);
        }
    }

    public static void main ( String[] args ) {
        int j = 9;
        System.out.print(n1 +" " + n2 + " ");
        serieFibonaci(j-2);
    }
}
