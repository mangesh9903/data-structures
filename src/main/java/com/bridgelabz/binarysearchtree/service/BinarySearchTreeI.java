package com.bridgelabz.binarysearchtree.service;

import com.bridgelabz.binarysearchtree.model.BinaryNode;

public interface BinarySearchTreeI<K extends Comparable<K>> {

    void add(K key);

    BinaryNode<K> addRecursively(BinaryNode<K> current, K key);

}
