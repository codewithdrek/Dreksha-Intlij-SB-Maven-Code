package com.luv2code.springcoredemo.common;

import java.util.Arrays;

public class loop {
    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = 0; i < 100; i++) {
            if(i!=50)
                a[i] = i;
        }
        System.out.println(Arrays.toString(a));

        for(int i = 0, j=a.length-1; i < a.length/2; i++, j--) {

            if(a[i+1]-a[i] != 1) {
                //missing
                System.out.println("Missing number is: " + (a[i]+1));
                break;
            }

            if(a[j]-a[j-1] != 1) {
                //missing
                System.out.println("Missing number is: " + (a[j]-1));
                break;
            }


        }
    }
}

