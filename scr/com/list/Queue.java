package com.list;

public class Queue {
    private  DoubleLinkList list;

    public void enqueue(Object element){
        this.list.insertLast(element);

    }

    public Object dequeue (){
        return this.list.deleteFirst();
    }

    public void displayList(){
        this.list.displayList();
    }

    public Object peek(){
        return this.list.getHead();
    }


}
