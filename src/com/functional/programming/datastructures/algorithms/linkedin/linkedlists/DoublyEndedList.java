package com.functional.programming.datastructures.algorithms.linkedin.linkedlists;

public class DoublyEndedList {

    private Node head;
    private Node tail;

    public void insertAtTail (int data) {
        Node newNode = new Node(99);
        if (this.head == null)
            this.head = newNode;

        if (this.tail != null) {
            this.tail.setNextNode(newNode);
            this.tail = newNode;
        }
    }

    @Override
    public String toString() {
        return "DoublyEndedList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}
