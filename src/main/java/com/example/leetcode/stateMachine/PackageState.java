package com.example.leetcode.stateMachine;

public interface PackageState {

    void next(Package pkg);
    void prev(Package pkg);
    void printStatus();
}