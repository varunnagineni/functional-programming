package com.functional.programming.datastructures.algorithms.linkedin.linkedlists;

public class DoublyLinkedList {

    private DoublyLinkedNode head;

    public void insertAtHead (int data) {
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);
        newNode.setNextNode(this.head);

        if (this.head != null) {
            this.head.setPrevNode(newNode);
        }
        this.head = newNode;
    }
}
