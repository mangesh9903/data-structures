package com.bridgelabz.stack.service;

import com.bridgelabz.linkedlist.service.INode;

public interface List<K> {
    void push(INode node);

    INode pop();

    void printStack();

    INode peek();
}
