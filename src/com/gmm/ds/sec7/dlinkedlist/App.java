package com.gmm.ds.sec7.dlinkedlist;

import java.util.LinkedList;

public class App {

    public static void main(String[] args) {
        DoublyLinkedList<String> names = new DoublyLinkedList<>();

        names.insert("Adam");
        names.insert("Kevin");
        names.insert("Ana");
        names.insert("Daniel");

        //names.traverseBackward();;


        LinkedList<String> dll = new LinkedList<>();

        //dll.addFirst("Kevin");
        //dll.addFirst("Daniel");
        //dll.addFirst("Ana");

        dll.addLast("Kevin");
        dll.addLast("Daniel");
        dll.addLast("Ana");

        dll.removeFirst();
        dll.removeLast();


        for(String name: dll){
            System.out.println(name);
        }

    }
}
