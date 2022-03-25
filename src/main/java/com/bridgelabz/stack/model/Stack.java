package com.bridgelabz.stack.model;

import com.bridgelabz.linkedlist.service.INode;
import com.bridgelabz.linkedlist.serviceimpl.LinkedList;

public class Stack {
    private final LinkedList linkedList;

    public Stack() {
        this.linkedList = new LinkedList();
    }

    public void push(INode node) {
        linkedList.add(node);
    }

    public INode pop() {
        return linkedList.remove();
    }

    public void printStack() {
        linkedList.printNodes();
    }

    public INode peek() {
        return linkedList.head;
    }
}
