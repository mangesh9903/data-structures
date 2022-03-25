package com.bridgelabz.queue.serviceimpl;

import com.bridgelabz.linkedlist.service.INode;
import com.bridgelabz.linkedlist.serviceimpl.LinkedList;
import com.bridgelabz.queue.service.QueueInterface;

public class Queue implements QueueInterface {

    private final LinkedList linkedList;

    public Queue() {
        this.linkedList = new LinkedList();
    }

    @Override
    public void enQueue(INode node) {
        linkedList.append(node);
    }

    @Override
    public void deQueue() {
        linkedList.removeLast();
    }

    @Override
    public INode firstNodeOfQueue() {
        return linkedList.head;
    }

    @Override
    public void printQueue() {
        linkedList.printNodes();
    }
}
