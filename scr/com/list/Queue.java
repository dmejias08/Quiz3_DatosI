package com.list;

public class Queue {
    private  DoubleLinkList list;

    public Queue(){
        this.list = new DoubleLinkList();
    }

    public void enqueue(Object element){
        if (this.list.isEmpty()==true){
            this.list.insertFirst(element);
        }else {

            this.list.insertLast(element);
        }
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
