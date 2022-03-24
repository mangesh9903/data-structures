package com.bridgelabz.stacktest;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.Node;
import com.bridgelabz.stack.Stack;
import org.junit.Assert;
import org.junit.Test;

public class StackTest {

    @Test
    public void givenThreeNumbers_whenAdded_shouldHaveAddedLast() {
        INode firstNode = new Node(20);
        INode secondNode = new Node(32);
        INode thirdNode = new Node(21);
        INode newNode = new Node(11);
        Stack stack = new Stack();
        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);
        stack.push(newNode);
        stack.printStack();
        INode result = stack.pop();
        Assert.assertEquals(newNode, result);
    }

    @Test
    public void givenThreeNumbers_whenPeak_shouldGetTopNumber() {
        INode firstNode = new Node(20);
        INode secondNode = new Node(32);
        INode thirdNode = new Node(21);
        INode newNode = new Node(11);
        Stack stack = new Stack();
        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);
        stack.push(newNode);
        stack.printStack();
        INode result = stack.peak();
        Assert.assertEquals(newNode, result);
    }

}
