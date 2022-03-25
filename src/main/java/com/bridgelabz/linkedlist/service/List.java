package com.bridgelabz.linkedlist.service;

public interface List<K> {
    void add(INode newNode);

    void append(INode newNode);

    void insert(INode node, INode newNode);

    INode remove();

    void removeLast();

    boolean search(K key);

    void searchAndInsert(int number, INode newNode);

    int size();

    void searchAndDelete(int number);

    void printNodes();
}
