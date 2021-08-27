package com.learndsa.dsImplementaions.LinkedList.SinglyLinkedList;

public class SinglyLinkedList {
   private Node head;
   private Node tail;
   private int length;


   public SinglyLinkedList(int value) {
       head = new Node(value);
       tail = head;
       length = 1;
   }

   //append to list
   public void append(int value) {
       Node temp = new Node(value);
       tail.next = temp;
       tail = temp;
       length ++;

   }

    //append to list
    public void prepend(int value) {
        Node temp = new Node(value);
        temp.next = head;
        head = temp;
        length ++;

    }

   //get list length
    public int getLength() {
       return length;
    }

    // print list

    public void printList() {
       Node current = this.head;
       while(current != null) {
           System.out.print(current.value+" ");
           current = current.next;
       }
    }

    //insert node

    public void insert(int value, int index) {
       if (index <0 || index > length) {
           System.err.println("Index out of Bounds for Length "+ length);
       } else if (index == 0) {
           prepend(value);
       } else if (index == length) {
           append(value);
       } else {
           Node temp = new Node(value);
           Node current = head;
            // traverse till the index where node needs to be inserted
           for(int i=0; i<index - 1; i++) {
               current = current.next;
           }

           temp.next = current.next;
           current.next = temp;
           length++;

       }
    }

    //delete node
    //* * *


    public void deletebyIndex(int index) {

        if (index == 0) {
            head = head.next;
            length --;
        } else {
            Node current = head;
            int i;
            int Upto;
            //case 1 - delete last node > for case 1 we need to traverse till last but 1 element
            // 1 2 *
            //case 2 - delete node by index > for case 2 we need to traverse till last but 2 elements
            // 1 * 3
            Upto = (index == length -1) ? 1 : 2 ;

            for(i=0; i<index - Upto; i++) {
                current = current.next;
            }

            if (index == length -1) {
                current.next = null;
                current = tail;

            } else {
                current.next = current.next.next;
            }
            length --;
        }
    }

   /* public void deletebyValue(int valueToDelete, int lengthofLinkedList) {

        Node current = head;
        Node earlierNode = head;
        //int lengthofLinkedList = getLength();
        int i;
        int Upto;
        //case 1 - delete last node > for case 1 we need to traverse till last but 1 element
        // 1 2 *
        //case 2 - delete node by index > for case 2 we need to traverse till last but 2 elements
        // 1 * 3
        //Upto = (index == length -1) ? 1 : 2 ;
        // 1 4 5 6 7
        for(i=0; i< lengthofLinkedList - 1; i++) {
            if (current.value == valueToDelete) {
                break;
            }
            current = current.next;
            if (i==0) {
                continue;
            } else {
                earlierNode = current.next;
            }


        }

        if (i == 0) {
            head = head.next;

        } else if (i == lengthofLinkedList -1) {
            earlierNode.next = null;
            earlierNode = tail;

        } else {
            current.next = current.next.next;
        }
        length --;

    }*/
    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList(5);
        //append node
        ll.append(38);
        ll.append(48);
        ll.append(58);
        ll.append(68);
        //System.out.println(ll.getLength());
        //prepend node
       // ll.prepend(55);
       // ll.prepend(59);
       // System.out.println(ll.getLength());
        //print list
        //ll.printList();
        //insert node
        //ll.insert(99, 3);
        //print list
      /*  System.out.println("Before deleting value at index 0");
        ll.printList();
        System.out.println();
        ll.deletebyIndex(0);
        System.out.println("After deleting value at index 0");
        ll.printList();
        System.out.println();
        ll.deletebyIndex(1);
        System.out.println("After deleting value at index 1");
        ll.printList();
        System.out.println();
        ll.deletebyIndex(ll.getLength());
        //ll.remove(3);
        System.out.println("After deleting value at index 3");
        ll.printList();*/
        ll.printList();
        System.out.println();
       // ll.deletebyValue(48, ll.getLength());
        ll.printList();

    }
}

