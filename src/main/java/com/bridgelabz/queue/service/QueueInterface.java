package com.bridgelabz.queue.service;

import com.bridgelabz.linkedlist.service.INode;

public interface QueueInterface<K> {
    void enQueue(INode node);

    void deQueue();

    INode firstNodeOfQueue();

    void printQueue();
}
