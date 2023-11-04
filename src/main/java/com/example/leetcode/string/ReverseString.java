package com.example.leetcode.string;

public class ReverseString {
    public static void main(String[] args) {
        String s= "zeynab";
        String r = "";
        char[] c= s.toCharArray();
        for (int i = c.length-1; i >= 0; i--) {
           r+=c[i];
        }
        System.out.println(r);
    }
}
