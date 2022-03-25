package com.bridgelabz.stack.controller;

import com.bridgelabz.linkedlist.model.Node;
import com.bridgelabz.linkedlist.service.INode;
import com.bridgelabz.stack.service.List;
import com.bridgelabz.stack.serviceimpl.Stack;

import java.util.Scanner;

public class HomeControllerStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List stack = new Stack();
        while (true) {
            System.out.println("======== Menu ========");
            System.out.println("1. Push Element In Stack.");
            System.out.println("2. Pop Element From Stack.");
            System.out.println("3. Peek Element Of Stack.");
            System.out.println("4. Print Stack.");
            System.out.println("5. Exit From Stack.");
            System.out.println("======================");
            int ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter First Node : ");
                    int number1 = scanner.nextInt();
                    INode firstNode = new Node(number1);
                    stack.push(firstNode);
                    System.out.println("Enter Second Node : ");
                    int number2 = scanner.nextInt();
                    INode secondNode = new Node(number2);
                    stack.push(secondNode);
                    System.out.println("Enter Third Node : ");
                    int number3 = scanner.nextInt();
                    INode thirdNode = new Node(number3);
                    stack.push(thirdNode);
                    System.out.println("--------- Stack ------------");
                    stack.printStack();
                    System.out.println("-----------------------------");
                    break;
                case 2:
                    try {
                        System.out.println("--------- Stack Before Pop Opertaion  ------------");
                        stack.printStack();
                        stack.pop();
                        System.out.println("--------- Stack After Pop Opertaion  ------------");
                        stack.printStack();
                    } catch (NullPointerException e) {
                        System.out.println("Stack Is Empty.");
                    }
                    System.out.println("--------------------------------------------------");
                    break;
                case 3:
                    System.out.println("---------      Stack      ------------");
                    INode peek = stack.peek();
                    System.out.println(peek.getKey());
                    System.out.println("---------------------------------------");
                    break;
                case 4:
                    try {
                        System.out.println("---------      Stack      ------------");
                        stack.printStack();
                        System.out.println("---------------------------------------");
                    } catch (NullPointerException e) {
                        System.out.println("Stack Is Empty.");
                    }
                    break;
                case 5:
                    System.out.println("Exit From Stack.");
                    System.exit(0);
                default:
                    System.out.println("Invalid Input.");
                    break;
            }

        }
    }
}
