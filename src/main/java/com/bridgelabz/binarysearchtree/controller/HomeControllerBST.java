package com.bridgelabz.binarysearchtree.controller;

import com.bridgelabz.binarysearchtree.model.BinaryNode;
import com.bridgelabz.binarysearchtree.service.BinarySearchTreeI;
import com.bridgelabz.binarysearchtree.serviceimpl.BinarySearchTree;

import java.util.Scanner;

public class HomeControllerBST {
    public static void main(String[] args) {

        BinarySearchTreeI binarySearchTree = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter How Many Element you want to insert");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter value : ");
            int value = scanner.nextInt();
            binarySearchTree.add(value);
            System.out.println(value);
        }
        System.out.println(binarySearchTree);
    }
}
