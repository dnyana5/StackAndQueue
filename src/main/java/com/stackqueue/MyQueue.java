package com.stackqueue;

public class MyQueue {
    private MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }

    public void enqueue(INode myNode) {
        myLinkedList.add(myNode);
    }

    public void printStack() {
        myLinkedList.printMyNodes();
    }

    public INode peak() {
        return myLinkedList.head;
    }

    public INode pop() {
        return myLinkedList.popLast();
    }


    public INode dequeue() {
        return myLinkedList.popLast();
    }
}
