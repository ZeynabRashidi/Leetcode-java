package com.example.leetcode.DeleteNodeLinkedList;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Stream;

public class DeleteNodeLinkedList {
    public static void main(String[] args) {
//        LinkedList<String> linkedList=  new LinkedList();
//
//        linkedList.add("a");
//        linkedList.add("b");
//        linkedList.add("c");
//        linkedList.add("d");
//        linkedList.removeIf(o->o.endsWith("b"));
//         linkedList.forEach(c->System.out.println(c));
        int[] arr = {1, 2, 3, 4, 5,6,7};
        int n = 3;
        int[] rotatedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int newIndex = (i + n) % arr.length;
            System.out.println((i + n)+ "=%"+newIndex+" /"+(i + n) / arr.length);

            rotatedArr[newIndex] = arr[i];
        }

        System.out.println(Arrays.toString(rotatedArr)); // [4, 5, 1, 2, 3]

        List<String> abc = List.of("orange", "orange", "banana","apple");

        for(int i=0;i<abc.size();i++){
            System.out.println(abc.get(i));
        }



      List<String>  groceries = List.of("orange", "orange", "banana","apple");

          // Collections.sort(groceries);
        for(int i=0;i<groceries.size();i++){
            System.out.println(groceries.get(i));
        }
        char my_temp;
        System.out.print("Displaying Alphabets from A to Z \n");
        for(my_temp= 'A'; my_temp <= 'Z'; ++ my_temp)
            System.out.print(my_temp+ " ");


//                filename="GoodnightMoon.txt";
//        // array=["1","2","3","4","5"];
//
//// WRITE YOUR CODE HERE
//
//        Stream<String> arrayStream= Stream.of(array);
//        Path path= Paths.get(filename);
//        Stream<String> fileStream=Stream.empty();
//        try{
//            fileStream= Files.lines(path);
//        }catch(Exception e){
//            e.printStackTrace();
//        }


//        Stream <String> stream=Stream.of("1","2","3","4","5");
//        System.out.println(stream.map(Integer::valueOf).reduce(0,Integer::sum));
//
//
//     String   timestamp="2019-06-11T15:37";
//        LocalDateTime date=LocalDateTime.parse(timestamp);
//
//        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd");
//        System.out.println(date.format(formatter));
//
//
//
//     String   timeZoneRegion="Europe/London";
//        String   timestamp="2023-02-01T11:50:37Z";
//        ZoneId zoneId = ZoneId.of(timeZoneRegion);
//        Instant instant= Instant.parse(timestamp);
//        ZonedDateTime zoneDT=ZonedDateTime.ofInstant(instant,zoneId);
//        System.out.println(zoneDT.format(DateTimeFormatter.ISO_LOCAL_DATE));
//
//





//        Set<String> fruits = new HashSet<String>();
//
//        fruits.addAll(groceries);
//
//        while(!fruits.isEmpty()) {
//            System.out.println(Collections.min(fruits));
//            fruits.remove(Collections.min(fruits));
//        }



        LocalDate date = LocalDate.parse("2019-06-11");
        System.out.println(date);

        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd");
        System.out.println(date.format(formatter));



        LocalDateTime dateInJanuary = LocalDateTime.parse("2023-01-01T11:50");
        DateTimeFormatter formatterYyyyMMdd =
                DateTimeFormatter.ofPattern("yyyy MM dd");
        System.out.println(dateInJanuary.format(formatterYyyyMMdd));
        DateTimeFormatter formatterMMYyyydd =
                DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(dateInJanuary.format(formatterMMYyyydd));




    }
}
