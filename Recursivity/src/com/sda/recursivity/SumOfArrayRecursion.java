package com.sda.recursivity;

public class SumOfArrayRecursion {
    static int calcSum ( int[] arr, int n ) {
        if (n <= 0) {
            return 0;
        } else {
            //System.out.println(calcSum(arr, n - 1) + arr[n - 1]);
            return calcSum(arr, n - 1) + arr[n - 1];
        }
    }

    public static void main ( String[] args ) {
        int[] arr = {2, 15, 4, 35, 79, 22};
        int sum = calcSum(arr, arr.length);
        System.out.println("Sum of array: " + sum);
    }
}
