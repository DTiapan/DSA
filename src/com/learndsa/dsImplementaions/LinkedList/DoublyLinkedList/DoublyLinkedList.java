package com.learndsa.dsImplementaions.LinkedList.DoublyLinkedList;

import java.util.Arrays;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value) {
        head = new Node(value);
        tail = head;
        length++;
    }

    //append -> operation will be always on tail side

    public void append(int value) {
        Node newNode = new Node(value);
        newNode.previous = tail;
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    //prepend - Operation will be always on head side

    public void prepend(int value) {
        Node newNode = new Node(value);
        head.previous = newNode;
        newNode.next = head;
        head = newNode;
        length++;
    }

    public int getLength() {
        return length;
    }

    public int[] printList() {
        int list[] = new int[length];
        int i = 0;
        Node current = this.head;
        while(current != null) {
            list[i] = current.value;
            current = current.next;
            i++;
        }

        return list;
    }
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList(5);
        dl.append(6);
        dl.append(7);
        dl.append(8);
        System.out.println(Arrays.toString(dl.printList()));
        dl.prepend(1);
        dl.prepend(2);
        dl.prepend(3);
        dl.prepend(4);
        System.out.println(Arrays.toString(dl.printList()));
    }
}
