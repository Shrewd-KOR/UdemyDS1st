package com.gmm.ds.sec5.linkedlist;

public class LinkedList<T extends Comparable<T>> implements  List<T>{

    private Node<T> root;
    private int numOfItems;

    // 섹션8. 링크드리스트에서 가운데 노드 찾기
    // 노드 수 카운트하고, 1/2 노드 수 재탐색하는것보다는
    // 느린노드, 빠른노드(느린노드의 2배)를 지정하여 빠른노드가 끝노드에 도착했을대 느린노드의 위치가 가운데 노드임
    public Node<T> getMiddleNode(){
        Node<T> slow = this.root;
        Node<T> fast = this.root;

        // O(N/2) = O(N)
        while(fast.getNextNode()!=null && fast.getNextNode().getNextNode()!=null){
            slow=slow.getNextNode();
            fast=fast.getNextNode().getNextNode();
        }
        return slow;
    }

    @Override
    public void reverse(){
        Node<T> currentNode = this.root;
        Node<T> previousNode = null;
        Node<T> nextNode = null;

        while(currentNode != null){
            nextNode = currentNode.getNextNode();
            currentNode.setNextNode(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
        }

        this.root = previousNode;
    }

    @Override
    public void insert(T data) {
        if(root == null){
            // this is the first item in the linked list
            root = new Node<>(data);
        }
        else{
            // this is not the first item in the linked list
            insertBeginning(data);
            //insertEnd(data, root);
        }
    }

    // we just have to update the references O(1)
    private void insertBeginning(T data) {
        Node<T> newNode =new Node<>(data);
        newNode.setNextNode(root);
        root = newNode;
    }

    // because we have to start with the root node
    // first we have to find the last node in O(N)
    private void insertEnd(T data, Node<T> node) {

        // this is when we keep looking for the last node O(N)
        if(node.getNextNode() != null){
            insertEnd(data, node.getNextNode());
        }
        else{
            // we have found the last node
            Node<T> newNode =new Node<>(data);
            node .setNextNode(newNode);
        }
    }


    @Override
    public void remove(T data) {

        if(root==null) return;

        // we want to remove the first node(root)
        if( root.getData().compareTo(data) == 0 ) {
            root = root.getNextNode();
        }
        else{
            remove(data,root, root.getNextNode());
        }
    }

    private void remove(T data, Node<T> previousNode, Node<T> actualNode) {

        //we have to find the node we want to remove
        while(actualNode != null){
            if(actualNode.getData().compareTo(data) == 0){
                //update the references
                numOfItems--;
                previousNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }

            // check next node
            previousNode = actualNode;
            actualNode = actualNode.getNextNode();

        }


    }

    @Override
    public void traverse() {

        if(root==null) return;
        Node<T> actualNode = root;
        while(actualNode != null){
            System.out.println(actualNode);
            actualNode = actualNode.getNextNode();
        }

    }

    @Override
    public int size() {
        return numOfItems;
    }
}


/*
 Linked Lists

 every node stores the data itself and a reference the next node in the linked list data structure
 need more memory than arrays
 there is no need for shifting items

 easy data structures and easy to implement
 no random indexing

 insert items at the beginning of the data structure fast - O(1) running time
 insert items at the end - O(N) running time

 - Advantages
 dynamic data structures
 no need for resizing the data structures
 can grow the data structure organically
 manipulating the first item is fast
 can store different sized items

 - Disadvantages
 need more memory
 no random access
 can not go backwards
 not predictable - the running time of the application relies heavily on the operations the users do

 - Comparing Linked Lists and Arrays
  Arrays are static, Linked Lists are dynamic
  Random access available, and not
  Manipulating the first items
  Manipulating the last items
  do not need any extra memory, need extra memory

                           Arrays  Linked Lists
  search                    O(1)       O(N)
  search(arbitrary)         O(N)       O(N)
  insert at the start       O(N)       O(1)
  insert at the end         O(1)       O(N)
  waste space               O(N)        0

 */