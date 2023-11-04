package com.example.leetcode.fibonacci;

public class fibonacci {
    public static void main(String[] args) {
        fibonacci fibonacci= new fibonacci();
        System.out.println(fibonacci.fib(8));
    }
    int a = 0, b=1 ,sum;
    public int fib(int n)
    {

        if (n<=1)
        return n;
        else
        {
            sum = a + b;
                     a=b;
                     b=sum;
                     n--;
                     System.out.println(sum);
                }
             return fib(n - 1) + fib(n - 2);
    }

}
