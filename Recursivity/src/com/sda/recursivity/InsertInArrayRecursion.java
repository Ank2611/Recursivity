package com.sda.recursivity;

import java.util.Arrays;

public class InsertInArrayRecursion {

    static int[] myarr = new int[10];

    static int[] InsertInArray ( int[] arr, int n ) {
        if (n == 0) {
            return new int[]{arr[0]};
        } else {
            for (int i = 0; i < n; i++) {
                myarr[i] = i;
                InsertInArray(myarr, (n - 1));
            }
            return myarr;
        }
    }

    public static void main ( String[] args ) {
        InsertInArray(myarr, 10);
        System.out.println("Array " + Arrays.toString(myarr));
    }
}
