package com.bridgelabz.linkedlist;

public class NewLinkedList<K> {
    public INode head;
    public INode tail;

    public NewLinkedList() {
        this.head = head;
        this.tail = tail;
    }

    public void add(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void append(INode newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void insert(INode node, INode newNode) {
        INode tempNode = node.getNext();
        node.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode pop() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            if (head != tail) {
                INode current = head;
                while (current.getNext() != tail) {
                    current = current.getNext();
                }
                tail = current;
                tail.setNext(null);
            } else {
                head = tail = null;
            }
        }
    }

    public boolean search(K key) {
        INode tempNode = head;
        while (tempNode != null && tempNode.getNext() != null) {
            if (tempNode.getNext().getKey().equals(key)) {
                return true;
            }
            tempNode = tempNode.getNext();
        }
        return false;
    }

    public void searchAndInsert(int number, INode newNode) {
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            if (tempNode.getKey().equals(number)) {
                INode temp = tempNode.getNext();
                tempNode.setNext(newNode);
                newNode.setNext(temp);
            }
            tempNode = tempNode.getNext();
        }
    }

    public int size() {
        INode tempNode = head;
        int counter = 0;
        while (tempNode != null) {
            counter++;
            tempNode = tempNode.getNext();
        }
        return counter;
    }

    public void searchAndDelete(int number) {
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            if (tempNode.getNext().getKey().equals(number)) {
                INode temp = tempNode.getNext().getNext();
                tempNode.setNext(temp);
            }
            tempNode = tempNode.getNext();
        }
    }

    public void printNodes() {
        StringBuffer nodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            nodes.append(tempNode.getKey());
            if (!tempNode.equals(tail))
                nodes.append("->");
            tempNode = tempNode.getNext();
        }
        nodes.append(tempNode.getKey());
        System.out.println(nodes);
    }

}
