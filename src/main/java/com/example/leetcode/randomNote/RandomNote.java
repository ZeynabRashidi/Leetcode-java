package com.example.leetcode.randomNote;

import java.util.HashMap;

public class RandomNote {

    public static void main(String[] args) {
        //  charApproach();
        hashMapApproach();
    }

    static void hashMapApproach() {
        String magazine = "magazine";
        String randomNote = "arrayList";
        HashMap<Character, Integer> hashMap = new HashMap();
        for (int i = 0; i < magazine.toCharArray().length; i++) {
            char m = magazine.charAt(i);
            int currentValue = hashMap.getOrDefault(m, 0);
            hashMap.put(m, currentValue + 1);
        }

        for (int i = 0; i < randomNote.toCharArray().length; i++) {
            char m = randomNote.charAt(i);
            int currentValue = hashMap.getOrDefault(m, 0);
            if (currentValue == 0)
                System.out.println(false);
            hashMap.put(m, currentValue - 1);
        }
        hashMap.forEach((o, o2) -> System.out.println(o.toString() + ":" + o2));
    }

    void charApproach() {
        String magazine = "magazine";
        String randomNote = "arrayList";

        for (int i = 0; i < randomNote.toCharArray().length; i++) {

            char randomNoteIndex = randomNote.charAt(i);

            int machIndex = magazine.indexOf(randomNoteIndex);
            if (machIndex == -1)
                System.out.println(false);
            else
                System.out.println(true);
        }
    }
}
