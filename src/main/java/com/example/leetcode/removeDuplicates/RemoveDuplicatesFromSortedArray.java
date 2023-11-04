package com.example.leetcode.removeDuplicates;

import java.lang.reflect.Array;
import java.util.*;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        Integer[] nums = {1,1,3,5,5,6,6};
        HashSet<Integer> out= new HashSet<Integer>();
        Collections.addAll(out, nums);
        for (Integer set:out      ) {
        System.out.println(set.intValue());
        }
    }
}
