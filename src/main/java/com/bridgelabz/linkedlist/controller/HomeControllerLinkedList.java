package com.bridgelabz.linkedlist.controller;

import com.bridgelabz.linkedlist.model.Node;
import com.bridgelabz.linkedlist.service.INode;
import com.bridgelabz.linkedlist.service.List;
import com.bridgelabz.linkedlist.serviceimpl.LinkedList;

import java.util.Scanner;

public class HomeControllerLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List linkedList = new LinkedList();
        while (true) {
            System.out.println("======== Menu ========");
            System.out.println("1. Add Element In Linked List.");
            System.out.println("2. Append Element In Linked List.");
            System.out.println("3. Insert Element In Linked List.");
            System.out.println("4. Remove First Element From Linked List.");
            System.out.println("5. Remove Last Element From Linked List.");
            System.out.println("6. Search Element From Linked List.");
            System.out.println("7. Search And Insert Element In Linked List.");
            System.out.println("8. Size Of Linked List.");
            System.out.println("9. Search And Delete Element From Linked List.");
            System.out.println("10. Print Linked List.");
            System.out.println("11. Exit From Linked List");
            System.out.println("======================");
            int ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter First Node : ");
                    int number1 = scanner.nextInt();
                    INode firstNode = new Node(number1);
                    linkedList.add(firstNode);
                    System.out.println("Enter Second Node : ");
                    int number2 = scanner.nextInt();
                    INode secondNode = new Node(number2);
                    linkedList.add(secondNode);
                    System.out.println("Enter Third Node : ");
                    int number3 = scanner.nextInt();
                    INode thirdNode = new Node(number3);
                    linkedList.add(thirdNode);
                    System.out.println("--------- Linked List ------------");
                    linkedList.printNodes();
                    System.out.println("----------------------------------");
                    break;
                case 2:
                    System.out.println("Enter First Node : ");
                    number1 = scanner.nextInt();
                    firstNode = new Node(number1);
                    linkedList.append(firstNode);

                    System.out.println("Enter Second Node : ");
                    number2 = scanner.nextInt();
                    secondNode = new Node(number2);
                    linkedList.append(secondNode);
                    System.out.println("Enter Third Node : ");
                    number3 = scanner.nextInt();
                    thirdNode = new Node(number3);
                    linkedList.append(thirdNode);

                    System.out.println("--------- Linked List ------------");
                    linkedList.printNodes();
                    System.out.println("----------------------------------");
                    break;
                case 3:
                    List newLinkedList = new LinkedList();
                    System.out.println("Enter First Node : ");
                    number1 = scanner.nextInt();
                    firstNode = new Node(number1);
                    newLinkedList.add(firstNode);

                    System.out.println("Enter Second Node : ");
                    number2 = scanner.nextInt();
                    secondNode = new Node(number2);
                    newLinkedList.append(secondNode);
                    System.out.println("Enter Third Node : ");
                    number3 = scanner.nextInt();
                    thirdNode = new Node(number3);
                    newLinkedList.append(thirdNode);
                    newLinkedList.printNodes();
                    System.out.println("Enter New Node");
                    INode newNode = new Node(scanner.nextInt());
                    newLinkedList.insert(firstNode, newNode);
                    System.out.println("--------- Linked List ------------");
                    newLinkedList.printNodes();
                    System.out.println("----------------------------------");
                    break;
                case 4:
                    System.out.println(" ======== Before Delete First Element =======");
                    linkedList.printNodes();
                    linkedList.remove();
                    System.out.println(" ======== After Delete First Element =======");
                    try {
                        linkedList.printNodes();
                    } catch (NullPointerException e) {
                        System.out.println("Linked List Became Empty.");
                    }
                    break;
                case 5:
                    System.out.println(" ======== Before Delete Last Element =======");
                    linkedList.printNodes();
                    linkedList.removeLast();
                    System.out.println(" ======== After Delete Last Element =======");
                    try {
                        linkedList.printNodes();
                    } catch (NullPointerException e) {
                        System.out.println("Linked List Became Empty.");
                    }
                    break;
                case 6:
                    linkedList.printNodes();
                    System.out.println("Enter Number you want to search.");
                    int number = scanner.nextInt();
                    boolean result = linkedList.search(number);
                    if (result) {
                        System.out.println("Number is Present In the Linked List.");
                    } else {
                        System.out.println("NUmber is Not Present In the Linked List");
                    }
                    break;
                case 7:
                    linkedList.printNodes();
                    System.out.println("Enter Position where you want to Insert the New Element.");
                    number = scanner.nextInt();
                    System.out.println("Enter new Element to Insert In the Linked List");
                    number2 = scanner.nextInt();
                    newNode = new Node(number2);
                    linkedList.searchAndInsert(number, newNode);
                    linkedList.printNodes();
                    break;
                case 8:
                    linkedList.printNodes();
                    int sizeOfLinkedList = linkedList.size();
                    System.out.println("Size Of Linked List : " + sizeOfLinkedList);
                    break;
                case 9:
                    linkedList.printNodes();
                    System.out.println("Enter element you want to delete from the Linked List");
                    number = scanner.nextInt();
                    linkedList.searchAndDelete(number);
                    linkedList.printNodes();
                    break;
                case 10:
                    System.out.println("===================  Linked List =====================");
                    linkedList.printNodes();
                    System.out.println("=======================================================");
                    break;
                case 11:
                    System.out.println("Exit From Linked List.");
                    System.exit(0);
                default:
                    System.out.println("Invalid Input.");
                    break;
            }

        }
    }
}
