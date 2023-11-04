package com.example.leetcode.fizBuz;

import java.util.ArrayList;

public class Items {

    private ArrayList<Integer> value;
     Items(ArrayList<Integer> value){
         this.value=value;

     }

    public Items() {

    }

    public ArrayList<Integer> getValue() {
        return value;
    }

    public void setValue(ArrayList<Integer> value) {
        this.value = value;
    }
}
