package com.bridgelabz.stack.serviceimpl;

import com.bridgelabz.linkedlist.service.INode;
import com.bridgelabz.linkedlist.serviceimpl.LinkedList;
import com.bridgelabz.stack.service.List;

public class Stack<K> implements List<K> {
    private final LinkedList linkedList;

    public Stack() {
        this.linkedList = new LinkedList();
    }

    @Override
    public void push(INode node) {
        linkedList.add(node);
    }

    @Override
    public INode pop() {
        return linkedList.remove();
    }

    @Override
    public void printStack() {
        linkedList.printNodes();
    }

    @Override
    public INode peek() {
        return linkedList.head;
    }
}
