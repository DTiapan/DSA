package com.learndsa.dsImplementaions.LinkedList.DoublyLinkedList;

public class Node {
    Node next;
    Node previous;
    int value;

    public Node(int value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }
}