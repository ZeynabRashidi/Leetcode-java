package com.example.leetcode;


import org.springframework.boot.test.context.SpringBootTest;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class LeetcodeApplicationTests {

    public static void main(String[] args) {

        args = new String[]{"orange", "orange", "banana", "apple"};
        List<String> groceries = Arrays.asList(args);

        Set<String> fruits = new HashSet<String>();
         Collections.sort(groceries);
         fruits.addAll(groceries);

        fruits.stream().sorted().forEach(System.out::println);


        //  fruits.stream().sorted().forEach(System.out::println);

//        groceries.add("orange");
//        groceries.add("orange");
//        groceries.add("banana");
//        groceries.add("apple");
        //groceries = List.of("orange", "orange", "banana","apple");
        // groceries.stream().sorted().forEach(System.out::println);
//         Collections.sort(groceries);
//        for(int i=0;i<groceries.size();i++){
//            System.out.println(groceries.get(i));
//          //  groceries.remove(Collections.min(groceries));
//        }


        // groceries=   fruits.stream().sorted().collect(Collectors.toList());

//        while(!fruits.isEmpty()) {
//            System.out.println(Collections.min(fruits));
//            fruits.remove(Collections.min(fruits));
//        }


//        List<String> list = new ArrayList<String>();
//
//        for(char c = 'A'; c <= 'Z'; ++c)
//           list.add(String.valueOf(c));
//        list = list.stream().sorted().collect(Collectors.toList());
//        System.out.println(list);
//    }



//     String   filename="GoodnightMoon.txt";
//     String[]   array=new String[]{"1", "2", "3", "4","5"};
//
//        Stream<String> arrayStream= Arrays.stream(array);
//        Path path = Paths.get(filename);
//        Stream<String> fileStream = Stream.empty();
//        try {
//            fileStream = Files.lines(path);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        arrayStream.forEach(System.out::println);
//        fileStream.forEach(System.out::println);



//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
//        LocalTime time = LocalTime.now();
//        System.out.println(time.format(formatter));


//       //  String   timestamp="2023-01-01T11:50";
//        LocalDateTime date = LocalDateTime.parse(timestamp);
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
//        System.out.println(date.getDayOfMonth());

      String  timeZoneRegion="Europe/London";
     String    timestamp="2023-02-01T11:50:37Z";
        ZoneId zoneId = ZoneId.of(timeZoneRegion);
        Instant instant= Instant.parse(timestamp);

        ZonedDateTime zoneDate=ZonedDateTime.ofInstant(instant,zoneId);
    String s=    zoneDate.format(DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(s);

        String s2= "test";
        System.out.println(s2.indexOf("s",0));


    }
}
