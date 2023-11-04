package com.example.leetcode.stepNumber;

public class NumberReduce {

    public static void main(String[] args) {

        int n =32;
        while (n!=0){
            if(n%2==0)
                n=n/2;
            else
                n=n-1;
            System.out.println(n);
        }




    }
}
