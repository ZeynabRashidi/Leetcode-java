package com.example.leetcode.bainery;

/*
* A binary tree is a recursive data structure where each node can have 2 children at most.
A common type of binary tree is a binary search tree, in which every
*  node has a value that is greater than or equal to
*  the node values in the left sub-tree, and less than
*  or equal to the node values in the right sub-tree.
* */
public class BinaryTree {
    Node root= new Node(2);

    public static void main(String[] args) {
        BinaryTree binaryTree= new BinaryTree();
        binaryTree.add(5);
        binaryTree.add(4);
        binaryTree.add(3);
        binaryTree.add(7);
        System.out.println("binaryTree");
    }
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }
    public  void add(int value) {
        root = addRecursive(root, value);
    }


}
