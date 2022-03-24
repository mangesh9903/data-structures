package com.bridgelabz.linkedlisttest;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.NewLinkedList;
import com.bridgelabz.linkedlist.Node;
import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
    @Test
    public void givenNumber_whenLinked_shouldReturnTrue() {
        INode<Integer> firstNode = new Node<>(56);
        INode<Integer> secondNode = new Node<>(30);
        INode<Integer> thirdNode = new Node<>(70);

        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);

        boolean result = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenThreeNumbers_whenAdded_toLinkedListShouldAdd() {
        NewLinkedList linkedList = new NewLinkedList();
        INode<Integer> firstNode = new Node<>(70);
        INode<Integer> secondNode = new Node<>(30);
        INode<Integer> thirdNode = new Node<>(56);

        linkedList.add(firstNode);
        linkedList.add(secondNode);
        linkedList.add(thirdNode);
        linkedList.printNodes();

        boolean result = linkedList.head.equals(thirdNode) && linkedList.head.getNext().equals(secondNode) &&
                linkedList.tail.equals(firstNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenThreeNumbers_whenAppend_toLinkedListShouldAdded() {
        NewLinkedList linkedList = new NewLinkedList();
        INode<Integer> firstNode = new Node<>(56);
        INode<Integer> secondNode = new Node<>(30);
        INode<Integer> thirdNode = new Node<>(76);
        linkedList.add(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.printNodes();

        boolean result = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(secondNode) &&
                linkedList.tail.equals(thirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenThreeNumber_whenInsertedToLinkedList_shouldBeAddedInBetween() {

        INode firstNode = new Node(56);
        INode secondNode = new Node(30);
        INode thirdNode = new Node(70);

        NewLinkedList linkedList = new NewLinkedList();
        linkedList.add(firstNode);
        linkedList.append(thirdNode);
        linkedList.insert(firstNode, secondNode);
        linkedList.printNodes();
        boolean result = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(secondNode) &&
                linkedList.tail.equals(thirdNode);
        Assert.assertTrue(result);

    }

    @Test
    public void givenThreeNumber_whenDeleted_fromLinkedList_shouldBecomeTwoNumber() {

        INode firstNode = new Node(56);
        INode secondNode = new Node(30);
        INode thirdNode = new Node(70);

        NewLinkedList linkedList = new NewLinkedList();
        linkedList.add(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.printNodes();
        linkedList.pop();
        linkedList.printNodes();
        boolean result = linkedList.head.equals(secondNode) &&
                linkedList.head.getNext().equals(thirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenThreeNumber_whenDeletedLastNumber_fromLinkedList_shouldBecomeTwoNumber() {

        INode firstNode = new Node(56);
        INode secondNode = new Node(30);
        INode thirdNode = new Node(70);

        NewLinkedList linkedList = new NewLinkedList();
        linkedList.add(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);

        linkedList.printNodes();
        System.out.println("After Removing Last Element");
        linkedList.removeLast();
        linkedList.printNodes();

        boolean result = linkedList.head.equals(firstNode) &&
                linkedList.head.getNext().equals(secondNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenThreeNumbers_whenSearchAnyNumber_shouldReturnTrue() {
        INode firstNode = new Node(56);
        INode secondNode = new Node(30);
        INode thirdNode = new Node(70);

        NewLinkedList linkedList = new NewLinkedList();
        linkedList.add(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.printNodes();

        boolean result = linkedList.search(30);
        Assert.assertTrue(result);
    }
}


