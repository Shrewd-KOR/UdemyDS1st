package com.gmm.ds.sec5.linkedlist.qn;

import com.gmm.ds.sec5.linkedlist.LinkedList;
import com.gmm.ds.sec5.linkedlist.List;

public class linkedlistQn40 {
    public static void main(String[] args) {

        List<Integer> myLinkedList = new LinkedList<>();

        myLinkedList.insert(10);
        myLinkedList.insert(2);
        myLinkedList.insert(13);
        myLinkedList.insert(5);

        myLinkedList.traverse();
        System.out.println();
        myLinkedList.reverse();
        myLinkedList.traverse();
    }
}
