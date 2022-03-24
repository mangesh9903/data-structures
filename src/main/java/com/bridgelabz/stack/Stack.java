package com.bridgelabz.stack;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.NewLinkedList;

public class Stack {
    private final NewLinkedList linkedList;

    public Stack() {
        this.linkedList = new NewLinkedList();
    }

    public void push(INode node) {
        linkedList.add(node);
    }

    public INode pop() {
        return linkedList.pop();
    }

    public void printStack() {
        linkedList.printNodes();
    }

    public INode peek() {
        return linkedList.head;
    }
}
