package com.gmm.ds.sec9.stack;

public class Stack<T>{

    // the LIFO last item we inserted is the first one we take out
    // when the pop() method is called
    private Node<T> head;
    private int count;

    // O(1)
    public void push(T data){
        count++;

        // this is when the linked list is empty
        if(head == null){
            head = new Node<>(data);
        }
        else{
            // the linked list already contains some items
            Node<T> oldHead = head;
            head = new Node<>(data);
            head.setNextNode(oldHead);
        }
    }

    // removes the last item we have inserted O(1)
    public T pop(){

        if(isEmpty()) return null;

        T item = head.getData();
        head = head.getNextNode();
        count--;
        return item;
    }

    // O(1)
    public int size(){
        return count;
    }

    // O(1)
    public boolean isEmpty(){
        return count == 0;
    }

}


/*

 Stacks
 - abstract data type; it can be implemented either with arrays or linked lists
 - LIFO structure
 - pop(), push(), peek()

 Stacks Applications
 - graph algorithms

 Memory Management
 1) Stack Memory
  - special region in the RAM
  - store the active functions and local variables as well(메소드, 지역변수)
  - fast access
  - no fragmentation
 2) Heap Memory
  - special region in the RAM
  - the size is larger than that of the stack memory
  - objects are store on the heap memory (생성된 객체)
  - slow access
  - may become fragmented
 */
