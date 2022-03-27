package com.bridgelabz.binarysearchtree.model;

public class BinaryNode<K extends Comparable<K>> {
    public K key;
    public BinaryNode<K> left;
    public BinaryNode<K> right;

    public BinaryNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return " : Key=> " + key + "\n left=> " + left + "  right=>" + right;
    }
}
