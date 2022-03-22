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
    public void given3Numbers_whenAdded_toLinkedListShouldAdd() {
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

}


