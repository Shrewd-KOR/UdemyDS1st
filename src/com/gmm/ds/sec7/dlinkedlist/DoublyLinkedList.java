package com.gmm.ds.sec7.dlinkedlist;

public class DoublyLinkedList<T extends Comparable<T>> {

    private Node<T> head;
    private Node<T> tail;

    public void insert (T data){
        Node<T> newNode = new Node<>(data);

        // this is the first item in the linked list
        if(tail==null){
            // both of the pointers are pointing to the new node
            tail = newNode;
            head = newNode;
        }
        else{
            // we have to insert the new item to the end of the list
            // we just have to manipulate the tail node and its references in O(1)
            newNode.setPreviousNode(tail);
            tail.setNextNode(newNode);
            tail = newNode;
        }
    }

    // Left to Right
    public void traverseForward(){
        Node<T> actualNode = head;

        while(actualNode != null){
            System.out.println(actualNode);
            actualNode = actualNode.getNextNode();
        }
    }

    // Right to Left
    public void traverseBackward(){
        Node<T> actualNode = tail;

        while(actualNode != null){
            System.out.println(actualNode);
            actualNode = actualNode.getPreviousNode();
        }
    }

}

/*
 Double Linked Lists

 Advantages
 - head node, tail node O(1) running time
 - can be traversed in both directions

 Disadvantages
 - need more memory
 - more complicated to implement
 - search for arbitrary items O(N) linear running time

 */