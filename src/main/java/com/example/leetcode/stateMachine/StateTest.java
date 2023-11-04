package com.example.leetcode.stateMachine;

public class StateTest {

    public static void main(String[] args) {
        Package pkg = new Package();
        pkg.printStatus();
    //   assertTrue(pkg.getState() instanceOf OrderedState);
        pkg.nextState();
        pkg.printStatus();

      //  assertTrue(pkg.getState() instanceOf DeliveredState);
        pkg.nextState();
        pkg.printStatus();
        //assertTrue(pkg.getState() instanceOf ReceivedState);
    }

}
