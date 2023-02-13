package com.functional.programming.datastructures.algorithms.linkedin.linkedlists;

public class LinkedList {

    private Node head;

    public void insertAtHead(int data) {
        //Create New Node object
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public int length() {
        int len = 0;

        Node current = this.head;
        while (current != null) {
            len++;
            current = current.getNextNode();
        }
        return len;
    }

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;
        while (current != null) {
            result += current + ",";
            current = current.getNextNode();
        }
        return result + "}";
    }

    public void deleteFromHead() {
        this.head = this.head.getNextNode();
    }

    public Node searchItem(int target) {
        Node current = this.head;
        while (current != null) {
            if (current.getData() == target)
                return current;
            current = current.getNextNode();
        }
        return null;
    }
}
