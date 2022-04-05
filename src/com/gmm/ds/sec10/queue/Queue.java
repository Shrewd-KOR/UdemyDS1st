package com.gmm.ds.sec10.queue;

public class Queue<T extends Comparable<T>> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private int count;

    public boolean isEmpty(){
        return this.firstNode == null;
    }

    public int size(){
        return this.count;
    }

    // O(1)
    public void enqueue(T newData){
        this.count++;
        Node<T> oldLastNode = this.lastNode;
        this.lastNode = new Node<>(newData);
        this.lastNode.setNextNode(null);

        if(isEmpty()){
            this.firstNode=this.lastNode;
        }
        else {
            oldLastNode.setNextNode(this.lastNode);
        }
    }

    // O(1)
    public T dequeue(){
        this.count--;
        T dataToDequeue = this.firstNode.getData();
        this.firstNode = this.firstNode.getNextNode();

        if(isEmpty()){
            this.lastNode = null;
        }

        return dataToDequeue;
    }
}

/*

 - Queues

 abstract data type - can be implemented either with arrays or with linked lists
 FIFO structure
 enqueue(), dequeue(), peek()
 has several application in OS and thread management(multithreading)

 - Queue Applications
 useful when a resource is shared with several consumers(threads)
 important in CPU scheduling
 graph algorithms(BFS)

 */