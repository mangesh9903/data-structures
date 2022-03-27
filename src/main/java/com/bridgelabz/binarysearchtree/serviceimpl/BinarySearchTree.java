package com.bridgelabz.binarysearchtree.serviceimpl;

import com.bridgelabz.binarysearchtree.model.BinaryNode;
import com.bridgelabz.binarysearchtree.service.BinarySearchTreeI;

public class BinarySearchTree<K extends Comparable<K>> implements BinarySearchTreeI<K> {
    private BinaryNode<K> root;

    @Override
    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    @Override
    public BinaryNode<K> addRecursively(BinaryNode<K> current, K key) {
        if (current == null) {
            return new BinaryNode<>(key);
        }

        int compareResult = key.compareTo(current.key);
        if (compareResult == 0) {
            return current;
        }
        if (compareResult < 0) {
            current.left = addRecursively(current.left, key);
        }
        if (compareResult > 0) {
            current.right = addRecursively(current.right, key);
        }
        return current;
    }

    @Override
    public String toString() {
        return " =============== BinarySearchTree =========== \n{ " +
                " root =" + root +
                '}';
    }
}
