package com.functional.programming.datastructures.algorithms.linkedin.linkedlists;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(2);
        list.insertAtHead(3);
        list.insertAtHead(1);
        list.insertAtHead(4);
        list.insertAtHead(9);
        list.insertAtHead(8);

        System.out.println(list);
        System.out.println(list.length());

        list.deleteFromHead();
        System.out.println(list);
        System.out.println(list.length());

        System.out.println(list.searchItem(10));

        System.out.println(list.searchItem(11));
    }
}
