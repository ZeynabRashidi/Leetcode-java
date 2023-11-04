package com.example.leetcode.fizBuz;

import org.apache.el.lang.EvaluationContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class FizzBuzz {


    public static void main(String[] args) {

    }

      void fizzBuzz(){
          ArrayList<String> list= new ArrayList<String>(10);


           for (int i=1;i<=list.size();i++){
               Boolean by3=i%3==0;
               Boolean by5=i%5==0;
             if (by3&&by5){
                 list.add("FizzBuzz");
             }

             else   if (by3){
                   list.add("Fizz");
               }
              else if (by5){
                   list.add("Buzz");
               }

           }


    }
}
