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

    public void insert(int index, int value) {
        Node newNode = new Node(value);
        if (index == 0) {
            prepend(value);
        } else if(index == length) {
            append(value);
        } else {
            Node current = this.head;
            for(int i=0; i<index-1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            newNode.previous = current;
            current.next.previous = newNode;
            length++;
        }
    }

    public void removebyIndex(int index) {

        if (index == 0) {
            head = head.next;
            head.previous = null;
            length --;
        } else if (index== length-1) {
            tail = tail.previous;
            tail.next = null;
            length --;
        } else {
            Node current = this.head;
            for (int i=0; i<index-1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            current.next.previous = current.previous.previous;
            length--;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList(5);
        dl.append(6);
        dl.append(7);
        dl.append(8);
        System.out.println(Arrays.toString(dl.printList()));
       /* dl.prepend(1);
        dl.prepend(2);
        dl.prepend(3);
        dl.prepend(4);*/
        dl.insert(2, 4);
        dl.insert(2, 99);
        System.out.println(Arrays.toString(dl.printList()));
        dl.removebyIndex(0);
        System.out.println(Arrays.toString(dl.printList()));
        dl.removebyIndex(dl.getLength());
        System.out.println(Arrays.toString(dl.printList()));
        dl.removebyIndex(2);
        System.out.println(Arrays.toString(dl.printList()));
        dl.removebyIndex(1);
        System.out.println(Arrays.toString(dl.printList()));
    }
}
