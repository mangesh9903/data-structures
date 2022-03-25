package com.bridgelabz.queue.controller;

import com.bridgelabz.linkedlist.model.Node;
import com.bridgelabz.linkedlist.service.INode;
import com.bridgelabz.queue.service.QueueInterface;
import com.bridgelabz.queue.serviceimpl.Queue;

import java.util.Scanner;

public class HomeControllerQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueueInterface queue = new Queue();
        while (true) {
            System.out.println("======== Menu ========");
            System.out.println("1. Enqueue  Element In Queue.");
            System.out.println("2. Dequeue Element From Queue.");
            System.out.println("3. First Node Of Queue.");
            System.out.println("4. Print Queue.");
            System.out.println("5. Exit From Queue.");
            System.out.println("======================");
            int ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter First Node : ");
                    int number1 = scanner.nextInt();
                    INode firstNode = new Node(number1);
                    queue.enQueue(firstNode);
                    System.out.println("Enter Second Node : ");
                    int number2 = scanner.nextInt();
                    INode secondNode = new Node(number2);
                    queue.enQueue(secondNode);
                    System.out.println("Enter Third Node : ");
                    int number3 = scanner.nextInt();
                    INode thirdNode = new Node(number3);
                    queue.enQueue(thirdNode);
                    System.out.println("--------- Queue ------------");
                    queue.printQueue();
                    System.out.println("-----------------------------");
                    break;
                case 2:
                    try {
                        System.out.println("--------- Queue Before Dequeue Opertaion  ------------");
                        queue.printQueue();
                        queue.deQueue();
                        System.out.println("--------- Queue After Dequeue Opertaion  ------------");
                        queue.printQueue();
                    } catch (NullPointerException e) {
                        System.out.println("Queue Is Empty.");
                    }
                    System.out.println("--------------------------------------------------");
                    break;
                case 3:
                    System.out.println("---------      Queue      ------------");
                    INode peek = queue.firstNodeOfQueue();
                    System.out.println(peek.getKey());
                    System.out.println("---------------------------------------");
                    break;
                case 4:
                    try {
                        System.out.println("---------      Queue      ------------");
                        queue.printQueue();
                        System.out.println("---------------------------------------");
                    } catch (NullPointerException e) {
                        System.out.println("Queue Is Empty.");
                    }
                    break;
                case 5:
                    System.out.println("Exit From Queue.");
                    System.exit(0);
                default:
                    System.out.println("Invalid Input.");
                    break;
            }

        }
    }
}
